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

	private Connection conn; // DB ���� ��ü
	private PreparedStatement pstmt = null; // Query �ۼ� ��ü
	private ResultSet rs; // Query ��� Ŀ��
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
			String sql2 = "SELECT COUNT(CASE WHEN win = '��ȭ' THEN 1 END) as win, COUNT(CASE WHEN lose = '��ȭ' THEN 1 END) as lose FROM game";
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

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='��ȭ'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = 'Ű��' THEN 1 END) as win, COUNT(CASE WHEN lose = 'Ű��' THEN 1 END) as lose FROM game";
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

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='Ű��'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = '�Ｚ' THEN 1 END) as win, COUNT(CASE WHEN lose = '�Ｚ' THEN 1 END) as lose FROM game";
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

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='�Ｚ'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = '�λ�' THEN 1 END) as win, COUNT(CASE WHEN lose = '�λ�' THEN 1 END) as lose FROM game";
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

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='�λ�'");
			pstmt2.setInt(1, win);
			pstmt2.setInt(2, lose);
			pstmt2.setInt(3, cnt);
			pstmt2.setFloat(4, avg);
			pstmt2.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			String sql2 = "SELECT COUNT(CASE WHEN win = '�Ե�' THEN 1 END) as win, COUNT(CASE WHEN lose = '�Ե�' THEN 1 END) as lose FROM game";
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

			pstmt2 = conn.prepareStatement("UPDATE team SET win=?,lose=?,count=?,avg=ROUNd(?,3) where Team='�Ե�'");
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
			String sql = "select * from game where win = 'LG' or lose = 'LG'"; // ������������
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
			String sql = "select * from game where win = 'KIA' or lose = 'KIA'"; // ������������
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
			String sql = "select * from game where win = 'NC' or lose = 'NC'"; // ������������
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
			String sql = "select * from game where win = 'KT' or lose = 'KT'"; // ������������
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
			String sql = "select * from game where win = 'SK' or lose = 'SK'"; // ������������
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
			String sql = "select * from game where win = '�λ�' or lose = '�λ�'"; // ������������
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
			String sql = "select * from game where win = '�Ｚ' or lose = '�Ｚ'"; // ������������
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
			String sql = "select * from game where win = '�Ե�' or lose = '�Ե�'"; // ������������
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
			String sql = "select * from game where win = '��ȭ' or lose = '��ȭ'"; // ������������
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
			String sql = "select * from game where win = 'Ű��' or lose = 'Ű��'"; // ������������
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
			pstmt.executeUpdate(); // return���� ó���� ���ڵ��� ����
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
				JOptionPane.showMessageDialog(null, "���� ����");
			else {
				JOptionPane.showMessageDialog(null, "���� ����");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
