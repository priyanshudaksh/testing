package com.hexaware;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	public  int store(Employee emp) {
		int c = 0;
		try {
			Connection con = DBUtility.establishConnection();
			String query = "{call storeEmp (?, ?, ?)}";
			CallableStatement pstmt = con.prepareCall(query);
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setDouble(3, emp.getSalary());
			c = pstmt.executeUpdate();
			
			pstmt.close();
			con.close();
			
			
		}
		catch (Exception e) {
				e.printStackTrace();
			}
		return c;
	}

	public  int delete(int id) {
		int c= 0;
		try {
			Connection con = DBUtility.establishConnection();
			String query = "delete from employee where id = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			c = pstmt.executeUpdate();
			con.close();
		}
		catch (Exception e) {
				e.printStackTrace();
			}
		return c;
	}

	public  Employee findById(int id) {
		ResultSet rs = null;
		Employee em = null;
		try {
			Connection con = DBUtility.establishConnection();
			String query = "select * from employee where id = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				 em = new Employee(rs.getInt(1), rs.getString(2), null, rs.getDouble(3));
				
			}

			con.close();
			pstmt.close();
		}
		catch (Exception e) {
				e.printStackTrace();
			}
		return  em;
	}
	public  List<Employee> findAll() {
		List<Employee>	employees = new ArrayList<Employee>();	
		try {
			Connection con = DBUtility.establishConnection();
			String query = "select * from employee";
			PreparedStatement pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee(rs.getInt(1), rs.getString(2), null, rs.getDouble(3));
				//System.out.println(emp);
				employees.add(emp);
			}
			con.close();
			rs.close();
		}
		catch (Exception e) {
				e.printStackTrace();
			}
		return  employees;
		
	}
	public  int updateSalary(int id, double salary) {
		int c = 0;
		try {
			Connection con = DBUtility.establishConnection();
			String query = "update employee set salary = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setDouble(1, salary);
			pstmt.setInt(2, id);
			c = pstmt.executeUpdate();
			con.close();
		}
		
		catch (Exception e) {
				e.printStackTrace();
			}
		return c;
	}


}
