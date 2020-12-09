package com.java.ex.main;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.java.ex.baseball.TeamDate;
import com.java.ex.db.MemberDao;
import com.java.ex.db.TeamDao;
import com.java.ex.insert.ListInsertBase;
import com.java.ex.login.LoginFrame;

public class BaseballMainFrame extends JFrame {

	private Vector v;
	private Vector cols;

	DefaultTableModel model;

	private JPanel panel, panel1, panel2, panel3, panel4;
	private JLabel kind_belbl;
	private JTable table, jtable;
	private JScrollPane jscp1;
	private JButton detailbtn, joinbtn, mainbtn;
	private JComboBox<String> teamlist;
	String items[] = { "LG", "두산", "삼성", "SK", "키움", "한화", "롯데", "NC", "KIA", "KT" };

//	DefaultTableModel dt = new DefaultTableModel(header, 0);

	public BaseballMainFrame() {

		super("야구기록");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		TeamDao dao = new TeamDao();
		v = dao.getMemberList();
		cols = getColimn();
		model = new DefaultTableModel(v, cols);

		panel = (JPanel) getContentPane();
		panel1 = (JPanel) getContentPane();
		panel2 = (JPanel) getContentPane();
		panel3 = (JPanel) getContentPane();
		panel4 = (JPanel) getContentPane();
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
		kind_belbl = new JLabel("종목 - 야구");
		jtable = new JTable(model);
		jscp1 = new JScrollPane(jtable);
		teamlist = new JComboBox<String>(items);
		detailbtn = new JButton("상세보기");
		joinbtn = new JButton("결과추가");
		mainbtn = new JButton("메인화면");

		jscp1.setLocation(30, 100);
		jscp1.setSize(600, 200);

		Font f2 = new Font("", Font.BOLD, 20); // ("글자체", Font.글자스타일, 글자크기)
		kind_belbl.setFont(f2);

		panel.add(kind_belbl);
		panel1.add(teamlist);
		panel2.add(detailbtn);
		panel2.add(joinbtn);
		add(jscp1);
		panel4.add(mainbtn);

		add(panel);
		add(panel1);
		add(panel2);
		add(panel4);

		panel.setBounds(10, 10, 100, 50);
		panel1.setBounds(300, 10, 150, 50);
		panel2.setBounds(450, 10, 200, 50);
		panel4.setBounds(500, 400, 100, 50);

		mainbtn.addActionListener(new MyActionListener1());
		joinbtn.addActionListener(new MyActionListener3());
		detailbtn.addActionListener(new MyActionListener2());

	}

	private Vector getColimn() {
		Vector col = new Vector();
		col.add("팀");
		col.add("승");
		col.add("패");
		col.add("경기수");
		col.add("승률");

		return col;
	}
	public void jTableRefresh(){
	       
		TeamDao dao = new TeamDao();
        DefaultTableModel model= new DefaultTableModel(dao.getMemberList(), getColimn());
        jtable.setModel(model);    
       
    }

	class MyActionListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			MainFrame mf = new MainFrame(null);
			dispose();
			mf.setSize(new Dimension(450, 300));
			mf.setVisible(true);

		}

	}

	class MyActionListener3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			ListInsertBase mf = new ListInsertBase();
			mf.setSize(new Dimension(450, 400));
			mf.setVisible(true);
			dispose();
		}

	}

	class MyActionListener2 implements ActionListener {
		@Override

		public void actionPerformed(ActionEvent e) {
			
			TeamDate td = new TeamDate(teamlist.getSelectedItem().toString());
			td.setSize(new Dimension(700, 500));
			td.setVisible(true);
			dispose();
		}

	}

	public static void main(String[] args) {
		BaseballMainFrame bf = new BaseballMainFrame();
		bf.setSize(new Dimension(700, 500));
		bf.setVisible(true);

	}
}
