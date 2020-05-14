package com.yedma.classes.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpDAO {
	// 사원등록 Emp 테이블
	public void insertEmp(Emp emp) {// emp타입의 인스턴스가 와야한다.
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
		String sql = "insert into emp values(" + emp.getEmployeeid() + "" + ",'" + emp.getLastName() + "'" + ","
				+ emp.getSalary() + ",'" + emp.getHireDate() + "'" + ")";
		try {
			// System.out.println(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	// employees 테이블 데이터 조회 결과.
	public Employee[] getEmpList() {
		Employee[] emps = new Employee[100];
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // url주소 고정
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, "hr", "hr");// "주소","아이디","패스워드"
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "select * from employees";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);// 커리를 실행하겠다.
			ResultSet rs = pstmt.executeQuery(); // 커리 호출
			int i = 0;
			while (rs.next()) { // 더이상가져올 데이터가 있는지 체크
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setFirstName(rs.getString("last_name"));
				emp.setFirstName(rs.getString("email"));
				emp.setFirstName(rs.getString("phone_number"));
				emps[i++] = emp; // employee 인스턴스를 담는 작업(저장)
				// System.out.println(rs.getInt("employee_id") +
				// rs.getString("first_name")+ rs.getString("last_name")+
				// rs.getString("email") + rs.getString("phone_number")
				// );

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("조회 완료");
		return emps;
	} // emplist
}// class
