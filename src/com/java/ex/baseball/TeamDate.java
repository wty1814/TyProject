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

public class TeamDate extends JFrame  {

	private Vector v;
	private Vector cols;
	DefaultTableModel model;
	private JLabel kind_base_1tlbl, teamlbl;
	private JButton savebtn, bckbtn;
	private JPanel panel,panel1,panel2,panel3;
	private JTable table;
	private JScrollPane jscp;

	
		public TeamDate(String teamlist) {
			super("���� - �߱�");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			TeamDao dao = new TeamDao();
			switch (teamlist) {
			case "LG":
				v = dao.getTeamLg();
				cols = getColimn();
				model = new DefaultTableModel(v, cols);
				break;
			case "�λ�":
				v = dao.getTeamDooSan();
				cols = getColimn();
				model = new DefaultTableModel(v, cols);
				break;
			case "�Ｚ":
				v = dao.getTeamSamSung();
				cols = getColimn();
				model = new DefaultTableModel(v, cols);
				break;
			case "�Ե�":
				v = dao.getTeamLotte();
				cols = getColimn();
				model = new DefaultTableModel(v, cols);
				break;
			case "Ű��":
				v = dao.getTeamKiWoom();
				cols = getColimn();
				model = new DefaultTableModel(v, cols);
				break;
			case "��ȭ":
				v = dao.getTeamHanWha();
				cols = getColimn();
				model = new DefaultTableModel(v, cols);
				break;
			case "KIA":
				v = dao.getTeamKIA();
				cols = getColimn();
				model = new DefaultTableModel(v, cols);
				break;
			case "KT":
				v = dao.getTeamKT();
				cols = getColimn();
				model = new DefaultTableModel(v, cols);
				break;
			case "NC":
				v = dao.getTeamNC();
				cols = getColimn();
				model = new DefaultTableModel(v, cols);
				break;
			case "SK":
				v = dao.getTeamSK();
				cols = getColimn();
				model = new DefaultTableModel(v, cols);
				break;
			default:
				break;
			}
			panel = (JPanel)getContentPane();
			panel1 = (JPanel)getContentPane();
			panel.setLayout(null);
			panel1.setLayout(null);
			
			
			panel = new JPanel();
			panel1 = new JPanel();
			panel2 = new JPanel();
			panel3 = new JPanel();
			
			kind_base_1tlbl = new JLabel("���� - �߱� - ");
			teamlbl = new JLabel();
			teamlbl.setText(teamlist);
			savebtn = new JButton("����");
			bckbtn = new JButton("�ڷΰ���");
			table = new JTable(model);
			jscp = new JScrollPane(table);
			
			Font f2 = new Font("", Font.BOLD, 20); //("����ü", Font.���ڽ�Ÿ��, ����ũ��)
			kind_base_1tlbl.setFont(f2);
			teamlbl.setFont(f2);
			
			panel.add(kind_base_1tlbl);
			panel.add(teamlbl);
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
			col.add("����ȣ");
			col.add("��");
			col.add("��");
			col.add("����");

			return col;
		}
		public void jTableRefresh(){
		       
			TeamDao dao = new TeamDao();
	        DefaultTableModel model= new DefaultTableModel(dao.getTeamDooSan(), getColimn());
	        table.setModel(model);    
	       
	    }
	
		class MyActionListener1 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				TeamDao dao = new TeamDao();
				int row = table.getSelectedRow();
				if (row < 0) {
					return;
				}
				Integer num = (int) table.getValueAt(row, 0);
				model.removeRow(row);
				dao.seleteDel(num);
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
			TeamDate df = new TeamDate(null);
			df.setSize(new Dimension(700,500));
			df.setVisible(true);
			
		}

}
