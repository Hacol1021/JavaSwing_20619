package unit03.LayoutExam;

import javax.swing.*;

public class HelloAbsLayout extends JFrame{
	
	public HelloAbsLayout() {
		
		setLayout(null);
		
		JButton btn1 = new JButton("버튼1");
		btn1.setSize(70, 40);
		btn1.setLocation(10, 30);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setSize(90, 20);
		btn2.setLocation(150, 30);
		
		add(btn1);
		add(btn2);
		
		setTitle("배치관리자가 없는 절대값 레이아웃");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new HelloAbsLayout();

	}

}
