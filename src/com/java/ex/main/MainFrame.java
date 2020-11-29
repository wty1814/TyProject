package com.java.ex.main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.java.ex.login.LoginFrame;

public class MainFrame extends JFrame{
	private JButton bebtn, scbtn, bkbtn, logoutbtn;
	private JPanel panel,panel2,panel3, panel1, panel4;
	private JLabel kindlabel, mainlabel, namelbl, namelbl2;
	
	public MainFrame(String id) {
		super("메인화면");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = (JPanel)getContentPane();
		panel1 = (JPanel)getContentPane();
		panel2 = (JPanel)getContentPane();
		panel3 = (JPanel)getContentPane();
		panel4 = (JPanel)getContentPane();
		panel.setLayout(null);
		panel1.setLayout(null);
		panel2.setLayout(null);
		panel3.setLayout(null);
		panel4.setLayout(null);
		
		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		bebtn = new JButton("야구");
		scbtn = new JButton("축구");
		bkbtn = new JButton("농구");
		logoutbtn = new JButton("로그아웃");
		kindlabel = new JLabel("종목");
		mainlabel = new JLabel("메인화면");
		namelbl = new JLabel("접속자:");
		namelbl2 = new JLabel();
		namelbl2.setText(id);
		
		Font f1 = new Font("", Font.BOLD, 18); //("글자체", Font.글자스타일, 글자크기)
		kindlabel.setFont(f1);
		Font f2 = new Font("", Font.BOLD, 24); //("글자체", Font.글자스타일, 글자크기)
		mainlabel.setFont(f2);
		Font f3 = new Font("", Font.PLAIN, 12); //("글자체", Font.글자스타일, 글자크기)
		namelbl.setFont(f3);
		
		panel.add(mainlabel);
		panel1.add(kindlabel);
		panel2.add(bebtn);
		panel2.add(scbtn);
		panel2.add(bkbtn);
		panel3.add(logoutbtn);
		panel4.add(namelbl);
		panel4.add(namelbl2);
		add(panel);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		panel.setBounds(10,10,100,40);
		panel1.setBounds(50,90,300,40);
		panel2.setBounds(50,130,300,40);
		panel3.setBounds(300,50,100,40);
		panel4.setBounds(250,10,150,100);
		
		bebtn.addActionListener(new MyActionListener());
		logoutbtn.addActionListener(new MyActionListener1());
		
	}
	
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			BaseballMainFrame bf = new BaseballMainFrame();
			bf.setSize(new Dimension(700,500));
			bf.setVisible(true);
			
		}
	}
	class MyActionListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			LoginFrame lf = new LoginFrame();
			lf.setSize(new Dimension(500,500));
			lf.setVisible(true);
			dispose();
		}
	}
	
	public static void main(String[] args) {
		MainFrame mf = new MainFrame(null);
		mf.setSize(new Dimension(450,300));
		mf.setVisible(true);
		
	}
	
	
	
}
