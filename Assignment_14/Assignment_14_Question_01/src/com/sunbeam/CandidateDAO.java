package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CandidateDAO implements AutoCloseable {
	private Connection con;
	public CandidateDAO() throws SQLException {
		con = DbUtil.getConnection();
	}
	@Override
	public void close(){
		try {
			if(con!=null)
				con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//CASE 1 : add new candidate
	public int save(Candidate c) throws SQLException {
		String sql = "Insert into candidates values(default, ?, ?, ?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	//CASE 2 : delete given candidate
	public int deleteById(int id) throws SQLException {
		String sql = "Delete from candidates where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} //stmt.close()
	}
	// CASE 3 : update candidate
	public int update(Candidate c) throws SQLException {
		String sql = "Update candidates set name=?, party=? where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
		
	//CASE 4 : get all candidate
	public List<Candidate> displayAll() throws SQLException{
		List<Candidate> list = new ArrayList<>();
		String sql = "Select * from candidates";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String party = rs.getString("party");
				int votes = rs.getInt("votes");
				Candidate c = new Candidate(id,name,party,votes);
				list.add(c);
			}
			} //rs.close()
		}//stmt.close()
		return list;
		
	}
	
	//CASE 5: increment candidate vote 
	public int incrementVote(int id) throws SQLException {
		String sql = "update candidates set votes=votes+1 where id= ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}
	
	//CASE 6 :get all candidates of given party
	public List<Candidate> getAllCandidatesbyParty(String genparty) throws SQLException {
		List<Candidate> list = new ArrayList<>();
		String sql = "select * from candidates where party = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, genparty);
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String party = rs.getString("party");
				int votes = rs.getInt("votes");
				Candidate c = new Candidate(id,name,party,votes);
				list.add(c);
			}
		}
		return list;
	}
	
		
	}

