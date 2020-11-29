package com.java.ex.db;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class MemberDao {
	private MemberDao() {}
	private static MemberDao instance=new MemberDao();
	public static MemberDao getInstance() {
		return instance;
	}
	
	private Connection conn; //DB 연결 객체
	private PreparedStatement pstmt = null; //Query 작성 객체
	private ResultSet rs; //Query 결과 커서
	static String driver = "org.mariadb.jdbc.Driver";
	static String url = "jdbc:mariadb://localhost:3307/test2";
	static String uid = "root";
	static String pwd = "1111";

	
	//성공 1, 실패 -1, 없음 0
	public int findByUsernameAndPassword(String id, String pw) {
		
		conn = DBConnection.getConnection();
		
		try {
			//2. Query 작성
			pstmt = conn.prepareStatement("select * from member where id = ? and pw = ?");
			pstmt.setString(1, id);
			pstmt.setString(2, pw);

			rs = pstmt.executeQuery();
			
			if(rs.next()) { 
				return 1; //로그인 성공
			}		
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return -1; //로그인 실패
	}
	
	//성공 1, 실패 -1, 
	public int insertDate(MemberDTO dto) {
		conn = DBConnection.getConnection();
		
		try {
			pstmt = conn.prepareStatement("insert into member values(?,?,?,?)");

			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getEmail());
			pstmt.executeUpdate(); //return값은 처리된 레코드의 개수
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
}

