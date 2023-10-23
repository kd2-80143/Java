package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDAO implements AutoCloseable {
	private Connection con;
	public UserDAO() throws SQLException {
		con = DbUtil.getConnection();
	}
	@Override
	public void close(){
		try {
		if(con != null)
		{
			con.close();
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Case 1: Add new user
	public int addUser(User c) throws SQLException, ParseException {
		String sql = "Insert into users values(default,?,?,?,?,?,false,'voter')";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getFirstName());
			stmt.setString(2, c.getLastName());
			stmt.setString(3, c.getEmail());
			stmt.setString(4, c.getPasswd());
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date utilDate = sdf.parse(c.getDob());
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			stmt.setDate(5, sqlDate);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
		
	}
	//Case 2 : Delete Given user
	public int deleteById(int id) throws SQLException {
		String sql = "Delete from users where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		}
		
	}
	
	//Case 3: Update user
	public int updateById(User c) throws SQLException, ParseException {
		String sql = "Update users set first_name=? , last_name=?, email=?, password=?, dob=? where id = ?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, c.getFirstName());
			stmt.setString(2, c.getLastName());
			stmt.setString(3, c.getEmail());
			stmt.setString(4, c.getPasswd());
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date utilDate = sdf.parse(c.getDob());
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			stmt.setDate(5, sqlDate);
			stmt.setInt(6, c.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
		
	}
	
	//Case 4: Get All candidates
	public List<User> displayAllUsers() throws SQLException
	{
		List<User> list = new ArrayList<>();
		String sql = "Select * from users";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				int id = rs.getInt("id");
				String fname = rs.getString("first_name");
				String lname = rs.getString("last_name");
				String email = rs.getString("email");
				String passwd = rs.getString("password");
				Date sqlDate = rs.getDate("dob");
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				String date = sdf.format(sqlDate);
				boolean status = rs.getBoolean("status");
				String role = rs.getString("role");
				User user = new User(id,fname,lname,email,passwd,date,status,role);
				list.add(user);
				
			}
		}
		return list;
		
	}

}
