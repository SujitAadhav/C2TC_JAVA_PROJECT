package com.cg.jdbcexample;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperation{

	//Create
	public static void addEmployee() throws SQLException {
		Connection con = DBUtil.getConnection();
		Statement stmt = con.createStatement();
		String sqlinsert = "INSERT INTO employee(`name`,`salary`,`bonus`)" + "values ('Sujit', 5000, 6000)";
		int status = stmt.executeUpdate(sqlinsert);
		if(status==1) {
			System.out.println("Entry is added");
		}
	}
	
	//Update
	public static void updateEmployee() throws SQLException {
		Connection con = DBUtil.getConnection();
		Statement stmt = con.createStatement();
		String sqlupdate = "UPDATE employee SET bonus=2000 Where id=1";
		int status = stmt.executeUpdate(sqlupdate);
		if(status==1) {
			System.out.println("Update is successful");
		}
	}
	
	//Delete
	public static void deleteEmployee() throws SQLException {
		Connection con = DBUtil.getConnection();
		Statement stmt = con.createStatement();
		String sqldelete = "DELETE FROM employee Where id=1";
		int status = stmt.executeUpdate(sqldelete);
		if(status==1) {
			System.out.println("Delete is successful");
		}
	}
	
	//RetrivedById
	public static void retrivedById() throws SQLException {
		Connection con = DBUtil.getConnection();
		Statement stmt = con.createStatement();
		String sqlretrive = "SELECT * From Employee WHERE id=2";
		ResultSet rs = stmt.executeQuery(sqlretrive);
		if(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			int salary=rs.getInt("salary");
			int bonus=rs.getInt("bonus");
			System.out.println(id + " " + name + " " + salary + " " + bonus);
		}else {
			System.out.println("No record found");
		}
		
	}
		
}
