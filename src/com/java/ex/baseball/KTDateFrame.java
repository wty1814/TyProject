package com.java.ex.baseball;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.java.ex.db.MemberDao;
import com.java.ex.db.TeamDao;
import com.java.ex.main.BaseballMainFrame;

public class KTDateFrame extends JFrame  {

	private Vector v;
	private Vector cols;
	DefaultTableModel model;
	
	private JLabel kind_base_1tlbl;
	private JButton savebtn, bckbtn;
	private JPanel panel,panel1,panel2,panel3;
	private JTable table;
	private JScrollPane jscp;
	
		public KTDateFrame() {
			super("종목 - 야구 - KT");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			TeamDao dao = new TeamDao();
			v = dao.getTeamKT();
			cols = getColimn();
			model = new DefaultTableModel(v, cols);
			
			panel = (JPanel)getContentPane();
			panel1 = (JPanel)getContentPane();
			panel.setLayout(null);
			panel1.setLayout(null);
			
			
			panel = new JPanel();
			panel1 = new JPanel();
			panel2 = new JPanel();
			panel3 = new JPanel();
			
			kind_base_1tlbl = new JLabel("종목 - 야구 - KT");
			savebtn = new JButton("저장");
			bckbtn = new JButton("뒤로가기");
			table = new JTable(model);
			jscp = new JScrollPane(table);
			
			Font f2 = new Font("", Font.BOLD, 20); //("글자체", Font.글자스타일, 글자크기)
			kind_base_1tlbl.setFont(f2);
			
			panel.add(kind_base_1tlbl);
			panel1.add(savebtn);
			panel1.add(bckbtn);
			
			
			add(panel);
			add(panel1);
			add(jscp);
			
			panel.setBounds(10,10,200,50);
			panel1.setBounds(500,10,200,50);
			jscp.setBounds(30,100,600,200);
			
			savebtn.addActionListener(new MyActionListener1());
			bckbtn.addActionListener(new MyActionListener2());
			
		}
		private Vector getColimn() {
			Vector col = new Vector();
			col.add("승");
			col.add("패");
			col.add("점수");

			return col;
		}
		public void jTableRefresh(){
		       
			TeamDao dao = new TeamDao();
	        DefaultTableModel model= new DefaultTableModel(dao.getTeamKT(), getColimn());
	        table.setModel(model);    
	       
	    }
	
		class MyActionListener1 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				BaseballMainFrame bf = new BaseballMainFrame();
				bf.setSize(new Dimension(700,500));
				bf.setVisible(true);
				dispose();
			}
			
		}
		class MyActionListener2 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				BaseballMainFrame bf = new BaseballMainFrame();
				bf.setSize(new Dimension(700,500));
				bf.setVisible(true);
				dispose();
			}
			
		}
		public static void main(String[] args) {
			KTDateFrame df = new KTDateFrame();
			df.setSize(new Dimension(700,500));
			df.setVisible(true);
			
		}

}


