package com.java.ex.baseball;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.java.ex.main.BaseballMainFrame;

public class SKDateFrame extends JFrame  {

	private JLabel kind_base_1tlbl;
	private JButton savebtn, bckbtn;
	private JPanel panel,panel1,panel2,panel3;
	private JTable table;
	private JScrollPane jscp;
	String header[]={"기록", "승", "패", "점수"};
	String contents[][]={
          {"1경기", "승", "패","7:3"}, //첫째줄 내용입력  null 하면 빈칸으로 출력
          {"2경기", "패", "승","2:3"},
          {"3경기", "패", "승","4:5"},
          {"4경기", "승", "패","5:1"}
	};
	
		public SKDateFrame() {
			super("종목 - 야구 - SK");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			panel = (JPanel)getContentPane();
			panel1 = (JPanel)getContentPane();
			panel.setLayout(null);
			panel1.setLayout(null);
			
			
			panel = new JPanel();
			panel1 = new JPanel();
			panel2 = new JPanel();
			panel3 = new JPanel();
			
			kind_base_1tlbl = new JLabel("종목 - 야구 - SK");
			savebtn = new JButton("저장");
			bckbtn = new JButton("뒤로가기");
			table = new JTable(contents, header);
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
			SKDateFrame df = new SKDateFrame();
			df.setSize(new Dimension(700,500));
			df.setVisible(true);
			
		}

}
//

//		Dimension dim = new Dimension(700,500);
//		dtf.setLocation(0,0);
//		dtf.setPreferredSize(dim);   
//		dtf.setLayout(null);
//		
//		JLabel kind_base_1tlbl = new JLabel("종목 - 야구 - 1팀");
//		kind_base_1tlbl.setLocation(10,10);
//		kind_base_1tlbl.setSize(200,30);
//		dtf.add(kind_base_1tlbl);
//		
//		Font f2 = new Font("", Font.BOLD, 20); //("글자체", Font.글자스타일, 글자크기)
//		kind_base_1tlbl.setFont(f2);
//		
//		JButton savebtn = new JButton("저장");
//		savebtn.setLocation(400,30);
//		savebtn.setSize(100,30);
//		dtf.add(savebtn);
//		
//		JButton bckbtn = new JButton("뒤로가기");
//		bckbtn.setLocation(530,30);
//		bckbtn.setSize(100,30);
//		dtf.add(bckbtn);
//		
//        String header[]={"기록", "승", "패", "점수"}; //맨위 표가로줄 이름지정 지정
//        String contents[][]={
//                {"1경기", "승", "패","7:3"}, //첫째줄 내용입력  null 하면 빈칸으로 출력
//                {"2경기", "패", "승","2:3"},
//                {"3경기", "패", "승","4:5"},
//                {"4경기", "승", "패","5:1"}
//        };
//        JTable table = new JTable(contents, header);
//        JScrollPane jscp1 = new JScrollPane(table);
//        jscp1.setLocation(40,100);
//        jscp1.setSize(600,200);		
//        dtf.add(jscp1);
//        
//		
//		dtf.pack(); //폼크기에 맞게 지정
//		dtf.setVisible(true);
//        dtf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기버튼 클릭시 프로그램 종료


