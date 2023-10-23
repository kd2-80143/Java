package com.sunbeam;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Tester {

	static int menu() {
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("****************************************");
		System.out.println("0. Exit");
		System.out.println("1. Add New Candidate");
		System.out.println("2. Delete Given Candidate");
		System.out.println("3. Update Candidate");
		System.out.println("4. Get All Candidates");
		System.out.println("5. Increment Candidate Votes");
		System.out.println("6. Get All Candidates of given party");
		System.out.println("7. Get Partywise votes");
		System.out.println("****************************************");
		System.out.println("Enter your choice ");
		choice = sc.nextInt();
		return choice;
		
	}
	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);
		while((ch=menu())!=0) {
			switch(ch)
			{
			case 1:
				try(CandidateDAO dao = new CandidateDAO()) {

					System.out.print("Enter name : ");
					String name = sc.next();
					System.out.print("Enter party :");
					String party = sc.next();
					System.out.print("Enter votes :");
					int votes = sc.nextInt();
					int cnt = dao.save(new Candidate(0,name,party,votes));
					System.out.println("Rows Inserted : "+ cnt);
					
				} 
				catch (Exception e1) {
					e1.printStackTrace();
				}
			break;
			case 2:
				try (CandidateDAO dao = new CandidateDAO()) {
					System.out.println("Enter candidate id to be deleted");
					int id = sc.nextInt();
					int cnt = dao.deleteById(id);
					System.out.println("Rows Deleted " + cnt);
				}  //dao.close();
				catch (Exception e) {	
					e.printStackTrace();
				}
			break;
			case 3:
				try(CandidateDAO dao = new CandidateDAO()) {
					System.out.println("Enter candidate ID to update : ");
					int id1 = sc.nextInt();
					System.out.println("Enter name : ");
					String name1 = sc.next();
					System.out.println("Enter party : ");
					String party1 = sc.next();
					int cnt = dao.update(new Candidate(id1,name1,party1,0));
					System.out.println("Rows updated : " + cnt);
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			break;
			case 4:
				try(CandidateDAO dao = new CandidateDAO()){
					List<Candidate> list = dao.displayAll();
					list.forEach(c -> System.out.println(c));
				} //dao.close()
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			break;
			case 5:
				try(CandidateDAO dao = new CandidateDAO()) {
					System.out.println("Enter candidate ID to vote : ");
					int candidateId = sc.nextInt();
					int cnt = dao.incrementVote(candidateId);
					System.out.println("Rows updated : " + cnt);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			break;
			case 6:
				try(CandidateDAO dao = new CandidateDAO()) {
					System.out.println("Enter party to get candidates : ");
					String partty = sc.next();
					List<Candidate> list = dao.getAllCandidatesbyParty(partty);
					list.forEach(s -> System.out.println(s));
				} catch (Exception e) {
					e.printStackTrace();
				}
			break;
			case 7:
				try(PartyVotesDAO pao = new PartyVotesDAO()) {
					List<PartyVotes> list2 = pao.getPartywiseVotes();
					list2.forEach(s->System.out.println(s));
				} catch (Exception e) {
					e.printStackTrace();
				}
			break;
			default:
				System.out.println("Enter correct choice");
			break;
			}
		}
		System.out.println("Thank you for using our application");

	}

}
