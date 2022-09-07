package unit03.LayoutExam;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Hellobutton extends JFrame{
	
	Hellobutton(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.pink);
		add(p);
		
		

		JButton jb = new JButton("버튼1");
		p.add(jb);
		
		
		
		setTitle("안녕 버튼");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Hellobutton();

	}

}
