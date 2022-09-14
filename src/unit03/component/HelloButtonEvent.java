package unit03.component;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HelloButtonEvent extends JFrame implements ActionListener{
	
	JPanel p;
	JButton btn1, btn2;
	
	public HelloButtonEvent() {
		
		p = new JPanel();
		add(p);
		
		p.setLayout(new FlowLayout());
		
		btn1 = new JButton("�����");
		btn2 = new JButton("��ȫ��");
		
		p.add(btn1);
		p.add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setTitle("��ư �̺�Ʈ");
		setSize(700, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new HelloButtonEvent();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			p.setBackground(Color.YELLOW);
			JOptionPane.showMessageDialog(null, e.getActionCommand() + "��ư�� Ŭ���� �Ǿ����ϴ�");
		}
		else if(e.getSource() == btn2) {
			p.setBackground(Color.PINK);
			JOptionPane.showMessageDialog(null, e.getActionCommand() + "��ư�� Ŭ���� �Ǿ����ϴ�");
		}
	}

}
