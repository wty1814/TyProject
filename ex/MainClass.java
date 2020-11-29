package com.java.ex;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass {
	static String driver = "org.mariadb.jdbc.Driver";
	static String url = "jdbc:mariadb://localhost:3307/test";
	static String uid = "root";
	static String pwd = "1111";
	
	
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("JDBC 드라이버 로드 성공");
			con = DriverManager.getConnection(url, uid, pwd);
			System.out.println("접속성공");			
		} catch (ClassNotFoundException e1) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e2) {
			System.out.println("접속 실패");
		} finally {
			try	{
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
