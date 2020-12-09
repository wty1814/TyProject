package com.java.ex.join;


import java.awt.Dimension;
import java.awt.EventQueue;
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

import com.java.ex.db.MemberDTO;
import com.java.ex.db.MemberDao;
import com.java.ex.login.LoginFrame;




public class JoinFrame extends JFrame{
	private JPanel panel1,panel2, panel3, panel4, panel5, panel6, panel,panel7;
	private JButton joinbtn;
	private JLabel idlabel, pwlabel, emaillabel, namelabel, joinlabel;
	private JTextField idtf, emailtf, nametf;
	private JPasswordField pwpf;

	public JoinFrame() {
		super("ȸ������");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = (JPanel)getContentPane();
		panel1.setLayout(null);
		panel2 = (JPanel)getContentPane();
		panel2.setLayout(null);
		panel3 = (JPanel)getContentPane();
		panel3.setLayout(null);
		panel4 = (JPanel)getContentPane();
		panel4.setLayout(null);
		panel5 = (JPanel)getContentPane();
		panel5.setLayout(null);
		panel6 = (JPanel)getContentPane();
		panel6.setLayout(null);
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		panel6 = new JPanel();
		
		joinlabel = new JLabel("ȸ������");
		idlabel = new JLabel("���̵�");
		idtf = new JTextField(15);
		pwlabel = new JLabel("��й�ȣ");
		pwpf = new JPasswordField(15);
		namelabel = new JLabel("�̸�");
		nametf = new JTextField(15);
		emaillabel = new JLabel("�̸���");
		emailtf = new JTextField(15);
		joinbtn = new JButton("�����ϱ�");
		
		
		
		
		Font f1 = new Font("", Font.BOLD,20);
		joinlabel.setFont(f1);
		
		panel1.add(joinlabel);
		panel2.add(idlabel);
		panel2.add(idtf);
		panel3.add(pwlabel);
		panel3.add(pwpf);
		panel5.add(namelabel);
		panel5.add(nametf);
		panel4.add(emaillabel);
		panel4.add(emailtf);
		panel6.add(joinbtn);
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		panel1.setBounds(10,10,100,40);
		panel2.setBounds(75,100,300,60);
		panel3.setBounds(70,160,300,60);
		panel4.setBounds(55,220,300,60);
		panel5.setBounds(80,280,300,60);
		panel6.setBounds(350,400,100,40);
		
		joinbtn.addActionListener(new MyActionListener());
	}
	
	
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			MemberDTO dto = new MemberDTO();
			if (idtf.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "���̵� �Է��ϼ���.");
			} else if (pwpf.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է��ϼ���.");
			} else if (nametf.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "�̸��� �Է��ϼ���.");
			} else if (emailtf.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "�̸����� �Է��ϼ���.");
			} else {
				dto.setId(idtf.getText());
				dto.setPw(pwpf.getText());
				dto.setName(nametf.getText());
				dto.setEmail(emailtf.getText());
				
				MemberDao dao = MemberDao.getInstance();
				int result = dao.insertDate(dto);
				
				if(result == 1) {
					JOptionPane.showMessageDialog(null, "���� �Ϸ�");
					LoginFrame lf = new LoginFrame();
					lf.setSize(new Dimension(500,500));
					lf.setVisible(true);
					dispose();
					dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "���� ����");
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					JoinFrame jf = new JoinFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
		
		JoinFrame jf = new JoinFrame();
		jf.setSize(new Dimension(500,500));
		jf.setVisible(true);
	}

}