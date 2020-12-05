package com.java.ex.insert;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
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

public class ListInsertBase extends JFrame{
	private JPanel panel, panel1, panel2, panel3, panel4;
	private JLabel inlbl, vclbl, deflbl, scorelbl;
	private JTextField vctf, detf, scoretf;
	private JButton inbtn, canbtn;
	
	public ListInsertBase() {
		super("기록추가");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = (JPanel)getContentPane();
		panel1 = (JPanel)getContentPane();
		panel2 = (JPanel)getContentPane();
		panel3 = (JPanel)getContentPane();
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
		scorelbl = new JLabel("score");
		vctf = new JTextField(15);
		detf = new JTextField(15);
		scoretf = new JTextField(15);
		inbtn = new JButton("추가");
		canbtn = new JButton("취소");
		
		Font f1 = new Font("", Font.BOLD, 20); //("글자체", Font.글자스타일, 글자크기)
		inlbl.setFont(f1);
		
		panel.add(inlbl);
		panel1.add(vclbl);
		panel1.add(vctf);
		panel2.add(deflbl);
		panel2.add(detf);
		panel3.add(inbtn);
		panel3.add(canbtn);
		panel4.add(scorelbl);
		panel4.add(scoretf);
		
		add(panel);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		panel.setBounds(10,10, 150,50);
		panel1.setBounds(35,70, 300,50);
		panel2.setBounds(35,130, 300,50);
		panel3.setBounds(250,260, 200,50);
		panel4.setBounds(35,190, 300,50);
		
		canbtn.addActionListener(new MyActionListener2());
		inbtn.addActionListener(new MyActionListener1());
	    }
	class MyActionListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			InsertDTO dto = new InsertDTO();
			dto.setWin(vctf.getText());
			dto.setLose(detf.getText());
			dto.setScore(scoretf.getText());
			
			TeamDao dao = TeamDao.getInstance();
			int result = dao.insertDate2(dto);
			
			if(result == 1) {
				JOptionPane.showMessageDialog(null, "입력 완료");
				BaseballMainFrame mf = new BaseballMainFrame();
				mf.setSize(new Dimension(700,500));
				mf.setVisible(true);
				dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, "입력 실패");
			}
//			BaseballMainFrame mf = new BaseballMainFrame();
//			mf.setSize(new Dimension(700,500));
//			mf.setVisible(true);
//			dispose();
				
		}
		
	}
		class MyActionListener2 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				BaseballMainFrame mf = new BaseballMainFrame();
				mf.setSize(new Dimension(700,500));
				mf.setVisible(true);
				dispose();
					
			}
			
		}
	public static void main(String[] args) {
		ListInsertBase li = new ListInsertBase();
		li.setSize(new Dimension(450,400));
		li.setVisible(true);

	}

}
