package com.java.ex;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.omg.CORBA.Bounds;

import dao.MemberDao;


public class LoginFrame extends JFrame {
	private JPanel panel1, panel2, panel3, panel;
	private JLabel idLabel, pwLabel, loginlabel;
	private JTextField idTf, pwTf;
//	private JPasswordField ;
	private JButton logBt, joinBt;
	
	public LoginFrame() {
		super("로그인");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X표 누르면 바로 종료시킴
		panel1 = (JPanel)getContentPane(); // ()가 앞에 붙으면 형변환을 시켜줌
		panel2 = (JPanel)getContentPane();
		panel1.setLayout(null);
		panel2.setLayout(null);
		
		panel = new JPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		loginlabel = new JLabel("로그인");
		panel.add(loginlabel);
		idLabel = new JLabel("ID");
		panel1.add(idLabel);
		pwLabel = new JLabel("PW");
		panel2.add(pwLabel);
		idTf = new JTextField(15);
		panel1.add(idTf);
		pwTf = new JTextField(15);
		panel2.add(pwTf);
		logBt = new JButton("로그인");
		joinBt = new JButton("회원가입");
		
		Font f1 = new Font("", Font.BOLD, 20); //("글자체", Font.글자스타일, 글자크기)
		loginlabel.setFont(f1);
		
		panel3.add(logBt);
		panel3.add(joinBt);
		add(panel);
		add(panel1);
		add(panel2);
		add(panel3);
		panel.setBounds(10,10, 100,50);
		panel1.setBounds(35,70,300,30);
		panel2.setBounds(30,100,300,30);
		panel3.setBounds(35,200,300,30);
		
		joinBt.addActionListener(new MyActionListener());
		logBt.addActionListener(new MyActionListener1());

	}
	
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JoinClass jf = new JoinClass();
			jf.setVisible(true);
			jf.setSize(new Dimension(500,500));
			dispose();
		}
	}
	class MyActionListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String id = idTf.getText();
			String pw = pwTf.getText();
			MemberDao dao = MemberDao.getInstance();
			int result = dao.findByUsernameAndPassword(id, pw);
			if(result == 1) {
				JOptionPane.showMessageDialog(null, "로그인성공");
				MainFrame jf = new MainFrame();
				jf.setVisible(true);
				jf.setSize(new Dimension(500,500));
				dispose();
			}
			else {
				JOptionPane.showMessageDialog(null, "로그인실패");
			}
			

		}
	}
	
	public static void main(String[] args) {
		LoginFrame lgf = new LoginFrame();
		lgf.setSize(new Dimension(400,400));
		lgf.setVisible(true);

	}
	
}