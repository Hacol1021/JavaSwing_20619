package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPanel extends JFrame{
	
	HelloPanel(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.orange);
		add(p);
		
		JButton btn1 = new JButton("��ư1");
		btn1.setBackground(Color.yellow);
		p.add(btn1);
		
		JButton btn2 = new JButton("��ư2");
		btn2.setBackground(Color.red);
		p.add(btn2);
		
		
		
		
		// ������ �⺻����
		
		setTitle("hello");
		setSize(300, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new HelloPanel();

	}

}
