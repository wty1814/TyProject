package com.java.ex.db;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.JOptionPane;

public class TeamDao {
	public TeamDao() {
	}

	private static TeamDao instance = new TeamDao();

	public static TeamDao getInstance() {
		return instance;
	}

	private Connection conn; // DB 연결 객체
	private PreparedStatement pstmt = null; // Query 작성 객체
	private ResultSet rs; // Query 결과 커서
	private Statement stmt;
	private PreparedStatement pstmt2 = null;
	private ResultSet rs2;

	public Vector getMemberList() {
		Vector data = new Vector();
		conn = DBConnection.getConnection();
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = 'LG' THEN 1 END) as win, COUNT(CASE WHEN lose = 'LG' THEN 1 END) as lose FROM game";
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			rs.next();
			int win = rs.getInt("win");
			int lose = rs.getInt("lose");
			pstmt.executeUpdate();

			int cnt = 0;
			float avg = 0;
			cnt = win + lose;
			avg = (float) win / (float) cnt;

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='LG'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = 'KT' THEN 1 END) as win, COUNT(CASE WHEN lose = 'KT' THEN 1 END) as lose FROM game";
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			rs.next();
			int win = rs.getInt("win");
			int lose = rs.getInt("lose");
			pstmt.executeUpdate();

			int cnt = 0;
			float avg = 0;
			cnt = win + lose;
			avg = (float) win / (float) cnt;

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='KT'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = 'NC' THEN 1 END) as win, COUNT(CASE WHEN lose = 'NC' THEN 1 END) as lose FROM game";
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			rs.next();
			int win = rs.getInt("win");
			int lose = rs.getInt("lose");
			pstmt.executeUpdate();

			int cnt = 0;
			float avg = 0;
			cnt = win + lose;
			avg = (float) win / (float) cnt;

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='NC'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = 'SK' THEN 1 END) as win, COUNT(CASE WHEN lose = 'SK' THEN 1 END) as lose FROM game";
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			rs.next();
			int win = rs.getInt("win");
			int lose = rs.getInt("lose");
			pstmt.executeUpdate();

			int cnt = 0;
			float avg = 0;
			cnt = win + lose;
			avg = (float) win / (float) cnt;

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='SK'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = 'KIA' THEN 1 END) as win, COUNT(CASE WHEN lose = 'KIA' THEN 1 END) as lose FROM game";
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			rs.next();
			int win = rs.getInt("win");
			int lose = rs.getInt("lose");
			pstmt.executeUpdate();

			int cnt = 0;
			float avg = 0;
			cnt = win + lose;
			avg = (float) win / (float) cnt;

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='KIA'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = '한화' THEN 1 END) as win, COUNT(CASE WHEN lose = '한화' THEN 1 END) as lose FROM game";
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			rs.next();
			int win = rs.getInt("win");
			int lose = rs.getInt("lose");
			pstmt.executeUpdate();

			int cnt = 0;
			float avg = 0;
			cnt = win + lose;
			avg = (float) win / (float) cnt;

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='한화'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = '키움' THEN 1 END) as win, COUNT(CASE WHEN lose = '키움' THEN 1 END) as lose FROM game";
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			rs.next();
			int win = rs.getInt("win");
			int lose = rs.getInt("lose");
			pstmt.executeUpdate();

			int cnt = 0;
			float avg = 0;
			cnt = win + lose;
			avg = (float) win / (float) cnt;

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='키움'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = '삼성' THEN 1 END) as win, COUNT(CASE WHEN lose = '삼성' THEN 1 END) as lose FROM game";
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			rs.next();
			int win = rs.getInt("win");
			int lose = rs.getInt("lose");
			pstmt.executeUpdate();

			int cnt = 0;
			float avg = 0;
			cnt = win + lose;
			avg = (float) win / (float) cnt;

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='삼성'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = '두산' THEN 1 END) as win, COUNT(CASE WHEN lose = '두산' THEN 1 END) as lose FROM game";
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			rs.next();
			int win = rs.getInt("win");
			int lose = rs.getInt("lose");
			pstmt.executeUpdate();

			int cnt = 0;
			float avg = 0;
			cnt = win + lose;
			avg = (float) win / (float) cnt;

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='두산'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = '롯데' THEN 1 END) as win, COUNT(CASE WHEN lose = '롯데' THEN 1 END) as lose FROM game";
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			rs.next();
			int win = rs.getInt("win");
			int lose = rs.getInt("lose");
			pstmt.executeUpdate();

			int cnt = 0;
			float avg = 0;
			cnt = win + lose;
			avg = (float) win / (float) cnt;

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='롯데'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			String sql = "select * from team order by avg desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String Team = rs.getString("Team");
				int win = rs.getInt("win");
				int lose = rs.getInt("lose");
				int count = rs.getInt("count");
				float avg = rs.getFloat("avg");

				Vector row = new Vector();
				row.add(Team);
				row.add(win);
				row.add(lose);
				row.add(count);
				row.add(avg);

				data.add(row);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public Vector getTeamLg() {
		Vector data = new Vector();
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from game where win = 'LG' or lose = 'LG'"; // 내림차순정렬
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Integer num = rs.getInt("num");
				String win = rs.getString("win");
				String lose = rs.getString("lose");
				String score = rs.getString("score");

				Vector row = new Vector();
				row.add(num);
				row.add(win);
				row.add(lose);
				row.add(score);

				data.add(row);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public Vector getTeamKIA() {
		Vector data = new Vector();
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from game where win = 'KIA' or lose = 'KIA'"; // 내림차순정렬
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Integer num = rs.getInt("num");
				String win = rs.getString("win");
				String lose = rs.getString("lose");
				String score = rs.getString("score");

				Vector row = new Vector();
				row.add(num);
				row.add(win);
				row.add(lose);
				row.add(score);

				data.add(row);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public Vector getTeamNC() {
		Vector data = new Vector();
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from game where win = 'NC' or lose = 'NC'"; // 내림차순정렬
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Integer num = rs.getInt("num");
				String win = rs.getString("win");
				String lose = rs.getString("lose");
				String score = rs.getString("score");

				Vector row = new Vector();
				row.add(num);
				row.add(win);
				row.add(lose);
				row.add(score);

				data.add(row);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public Vector getTeamKT() {
		Vector data = new Vector();
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from game where win = 'KT' or lose = 'KT'"; // 내림차순정렬
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Integer num = rs.getInt("num");
				String win = rs.getString("win");
				String lose = rs.getString("lose");
				String score = rs.getString("score");

				Vector row = new Vector();
				row.add(num);
				row.add(win);
				row.add(lose);
				row.add(score);

				data.add(row);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public Vector getTeamSK() {
		Vector data = new Vector();
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from game where win = 'SK' or lose = 'SK'"; // 내림차순정렬
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Integer num = rs.getInt("num");
				String win = rs.getString("win");
				String lose = rs.getString("lose");
				String score = rs.getString("score");

				Vector row = new Vector();
				row.add(num);
				row.add(win);
				row.add(lose);
				row.add(score);

				data.add(row);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public Vector getTeamDooSan() {
		Vector data = new Vector();
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from game where win = '두산' or lose = '두산'"; // 내림차순정렬
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Integer num = rs.getInt("num");
				String win = rs.getString("win");
				String lose = rs.getString("lose");
				String score = rs.getString("score");

				Vector row = new Vector();
				row.add(num);
				row.add(win);
				row.add(lose);
				row.add(score);

				data.add(row);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public Vector getTeamSamSung() {
		Vector data = new Vector();
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from game where win = '삼성' or lose = '삼성'"; // 내림차순정렬
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Integer num = rs.getInt("num");
				String win = rs.getString("win");
				String lose = rs.getString("lose");
				String score = rs.getString("score");

				Vector row = new Vector();
				row.add(num);
				row.add(win);
				row.add(lose);
				row.add(score);

				data.add(row);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public Vector getTeamLotte() {
		Vector data = new Vector();
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from game where win = '롯데' or lose = '롯데'"; // 내림차순정렬
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Integer num = rs.getInt("num");
				String win = rs.getString("win");
				String lose = rs.getString("lose");
				String score = rs.getString("score");

				Vector row = new Vector();
				row.add(num);
				row.add(win);
				row.add(lose);
				row.add(score);

				data.add(row);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public Vector getTeamHanWha() {
		Vector data = new Vector();
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from game where win = '한화' or lose = '한화'"; // 내림차순정렬
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Integer num = rs.getInt("num");
				String win = rs.getString("win");
				String lose = rs.getString("lose");
				String score = rs.getString("score");

				Vector row = new Vector();
				row.add(num);
				row.add(win);
				row.add(lose);
				row.add(score);

				data.add(row);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public Vector getTeamKiWoom() {
		Vector data = new Vector();
		conn = DBConnection.getConnection();
		try {
			String sql = "select * from game where win = '키움' or lose = '키움'"; // 내림차순정렬
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Integer num = rs.getInt("num");
				String win = rs.getString("win");
				String lose = rs.getString("lose");
				String score = rs.getString("score");

				Vector row = new Vector();
				row.add(num);
				row.add(win);
				row.add(lose);
				row.add(score);

				data.add(row);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public int insertDate2(InsertDTO dto) {
		conn = DBConnection.getConnection();

		try {
			String sum = dto.getScore() + ":" + dto.getScore2();
			pstmt = conn.prepareStatement("insert into game(win,lose,score) values(?,?,?)");

			pstmt.setString(1, dto.getWin());
			pstmt.setString(2, dto.getLose());
			pstmt.setString(3, sum);
			pstmt.executeUpdate(); // return값은 처리된 레코드의 개수
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	public void seleteDel(int num) {
		conn = DBConnection.getConnection();
		int ok;
		try {
			pstmt = conn.prepareStatement("DELETE FROM game WHERE num=?");
			pstmt.setInt(1, num);
			int r = pstmt.executeUpdate();
			if (r != 1)
				JOptionPane.showMessageDialog(null, "삭제 실패");
			else {
				JOptionPane.showMessageDialog(null, "삭제 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
