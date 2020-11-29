package com.java.ex;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
// 연결된 db를 불러와 내용을 표시해준다
public class MainClass2 {
	static String driver = "org.mariadb.jdbc.Driver";
	static String url = "jdbc:mariadb://localhost:3307/test";
	static String uid = "root";
	static String pwd = "1111";
	static String query = "select * from member";
	
	public static void main(String[] args) {
		Connection con = null;
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, uid, pwd);
			stmt = con.createStatement();
			rs =  stmt.executeQuery(query);
			while (rs.next()) {
				String id = rs.getString("m_id");
				String pw = rs.getString("m_pw");
				String name = rs.getString("m_name");
				String email = rs.getString("m_email");
				
				System.out.println("ID : " + id);
				System.out.println("pw : " + pw);
				System.out.println("name : " + name);
				System.out.println("email : " + email);
				System.out.println("=========================");
				
			}
		} catch (ClassNotFoundException e1) {
			System.out.println("로드 실패");
		} catch (SQLException e2) {
			System.out.println("접속 실패");
		} catch (Exception e3) {
			e3.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
