package javaSwingTutorial;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class FrameEx1 {

	public static void main(String[] args) {
		//Method 1
		JFrame frame = new JFrame();
		frame.setSize(500, 300);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		frame.setTitle("First main Frame");
		frame.setLocation(screenSize.width/2 -150, screenSize.height/2 - 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//Method 2
		LaunchJFrame jframe = new LaunchJFrame();
		new JFrame();
		
	}
}

//Method 2
class LaunchJFrame extends JFrame {
	//construction
	public LaunchJFrame() {
		super("First JFrame");
		setBounds(200,200,500,300);//위치 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
