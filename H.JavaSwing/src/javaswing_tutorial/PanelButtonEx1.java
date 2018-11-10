package javaswing_tutorial;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class LaunchJFrame extends JFrame {
	//construction
	public LaunchJFrame() {
		super("First JFrame");
		setBounds(200,200,500,300);//위치 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jpanel = new JPanel();
		JButton btn = new JButton("Start");
		btn.setMnemonic('B');
		btn.setSize(100,50);
		
		jpanel.add(btn);
		add(jpanel);
		setVisible(true);
	}
}

public class PanelButtonEx1 {

	public static void main(String[] args) {

		LaunchJFrame jframe = new LaunchJFrame();
		jframe.setLocale(null);
		jframe.setVisible(true);
		
	}
}
