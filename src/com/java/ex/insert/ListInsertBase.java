package com.java.ex.insert;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.java.ex.db.InsertDTO;
import com.java.ex.db.MemberDao;
import com.java.ex.db.TeamDao;
import com.java.ex.login.LoginFrame;
import com.java.ex.main.BaseballMainFrame;
import com.java.ex.main.MainFrame;

public class ListInsertBase extends JFrame {
	private JPanel panel, panel1, panel2, panel3, panel4;
	private JLabel inlbl, vclbl, deflbl, scorelbl, lbl;
	private JTextField scoretf, scoretf2;
	private JButton inbtn, canbtn;
	private JComboBox<String> vteamlist, dteamlist;
	String vtitems[] = { "LG", "두산", "삼성", "SK", "키움", "한화", "롯데", "NC", "KIA", "KT" };
	String dtitems[] = { "LG", "두산", "삼성", "SK", "키움", "한화", "롯데", "NC", "KIA", "KT" };

	public ListInsertBase() {
		super("기록추가");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = (JPanel) getContentPane();
		panel1 = (JPanel) getContentPane();
		panel2 = (JPanel) getContentPane();
		panel3 = (JPanel) getContentPane();
		panel.setLayout(null);
		panel1.setLayout(null);
		panel2.setLayout(null);
		panel3.setLayout(null);

		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		inlbl = new JLabel("야구 - 기록추가");
		vclbl = new JLabel("Victory");
		deflbl = new JLabel("Defeat");
		lbl = new JLabel(" : ");
		scorelbl = new JLabel("score");
		scoretf = new JTextField(5);
		scoretf2 = new JTextField(5);
		inbtn = new JButton("추가");
		canbtn = new JButton("취소");
		vteamlist = new JComboBox<String>(vtitems);
		dteamlist = new JComboBox<String>(dtitems);

		Font f1 = new Font("", Font.BOLD, 20); // ("글자체", Font.글자스타일, 글자크기)
		inlbl.setFont(f1);

		panel.add(inlbl);
		panel1.add(vclbl);
		panel1.add(vteamlist);
		panel2.add(deflbl);
		panel2.add(dteamlist);
		panel3.add(inbtn);
		panel3.add(canbtn);
		panel4.add(scorelbl);
		panel4.add(scoretf);
		panel4.add(lbl);
		panel4.add(scoretf2);

		add(panel);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		panel.setBounds(10, 10, 150, 50);
		panel1.setBounds(35, 70, 300, 50);
		panel2.setBounds(35, 130, 300, 50);
		panel3.setBounds(250, 260, 200, 50);
		panel4.setBounds(35, 190, 300, 50);

		canbtn.addActionListener(new MyActionListener2());
		inbtn.addActionListener(new MyActionListener1());
	}

	class MyActionListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
//			int num1 = Integer.parseInt(scoretf.getText());
//			int num2 = Integer.parseInt(scoretf2.getText());
			InsertDTO dto = new InsertDTO();
			dto.setWin(vteamlist.getSelectedItem().toString());
			if (vteamlist.getSelectedItem() == dteamlist.getSelectedItem()) {
				JOptionPane.showMessageDialog(null, "승리팀과 패배팀이 같습니다.");
			} else if (scoretf.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "점수를 입력하세요.");
			} else if (scoretf2.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "점수를 입력하세요.");
			} 
			else {
				int num1 = Integer.parseInt(scoretf.getText());
				int num2 = Integer.parseInt(scoretf2.getText());
				if(num1<0 || num2<0) {
					JOptionPane.showMessageDialog(null, "정수를 입력하세요.");
				}
				else if (num1 <= num2) {
					JOptionPane.showMessageDialog(null, "승리팀 점수를 더 높게 입력하세요.");
					return;
				} else {
					int result2 = JOptionPane.showConfirmDialog(null, "경기를 추가하시겠습니까.", "추가", JOptionPane.YES_NO_OPTION);
					if (result2 == JOptionPane.CLOSED_OPTION) {
						return;
					} else if (result2 == JOptionPane.YES_OPTION) {
						dto.setLose(dteamlist.getSelectedItem().toString());
						dto.setScore(scoretf.getText());
						dto.setScore2(scoretf2.getText());
						TeamDao dao = TeamDao.getInstance();
						dao.insertDate2(dto);
						BaseballMainFrame mf = new BaseballMainFrame();
						mf.setSize(new Dimension(700, 500));
						mf.setVisible(true);
						dispose();
					}
				}
			}
		}

	}

	class MyActionListener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			BaseballMainFrame mf = new BaseballMainFrame();
			int result = JOptionPane.showConfirmDialog(null, "취소하시겠습니까.", "취소", JOptionPane.YES_NO_OPTION);
			if (result == JOptionPane.CLOSED_OPTION) {
				return;
			} else if (result == JOptionPane.YES_OPTION) {
				mf.setSize(new Dimension(700, 500));
				mf.setVisible(true);
				dispose();
			}
		}

	}

	public static void main(String[] args) {
		ListInsertBase li = new ListInsertBase();
		li.setSize(new Dimension(450, 400));
		li.setVisible(true);

	}

}
