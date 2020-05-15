package com.yedam.interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	public Connection getConnect() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // url주소 고정
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");// "주소","아이디","패스워드"
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	
	public void insertEmp(Employee emp) {
		String sql = "insert into emp values(?,?,?,?)";
		conn = getConnect();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getLastName());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setString(4, emp.getHireDate());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 입력됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Employee[] getEmpList() {
		Connection conn = null;
		String sql = "select * from emp";
		conn = getConnect();
		Employee[] employees = new Employee[100];
		int i = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee(rs.getInt("employee_id"), rs.getString("last_name"),
						rs.getInt("salary"), rs.getString("hire_date"));
				employees[i++] = emp;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}
	
	public void updateEmp(Employee emp) {
		// 전제조건 : 급여만 변경
		Connection conn = null;
		String sql = "update emp set salary = ? employee_id = ?";
		conn = getConnect();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmployeeId());
			int r = pstmt.executeUpdate(sql);
			System.out.println(r + "건 변경됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteEmp(int empId) {
		conn = getConnect();
		String sql = "delete from emp where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
