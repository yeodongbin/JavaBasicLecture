package javaSwingTutorial.swingTest;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class LaunchJFrame2 extends JFrame {
	//construction
	public LaunchJFrame2() {
		super("First JFrame");
		setBounds(200,200,700,500);//위치 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = this.getContentPane();
		JPanel jpanel = new JPanel();
		JButton btn = new JButton("Start");
		JTextField textfield = new JTextField(10);
		JLabel label = new JLabel(" Input Period : "); 
		JCheckBox checkbox = new JCheckBox("Fire randomly");
		
		checkbox.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				if(((JCheckBox) e.getSource()).isSelected())
				{
					textfield.setText("Random");
					textfield.setEnabled(false);
				} else
				{
					textfield.setText("");
					textfield.setEnabled(true);
				}
			}
		});
		
		btn.setMnemonic('B');
		btn.setSize(200,100);
		btn.setPreferredSize(new Dimension(100, 50));
		
		label.setPreferredSize(new Dimension(100, 50));
		textfield.setPreferredSize(new Dimension(100, 50));
		
		jpanel.add(btn);
		jpanel.add(label);
		jpanel.add(textfield);
		jpanel.add(checkbox);
//		add(jpanel); //2
		contentPane.add(jpanel);
		contentPane.setVisible(true);
	}
}

public class PanelButtonEx1 {
	
	public static void main(String[] args) {
		LaunchJFrame2 jframe = new LaunchJFrame2();
		jframe.setLocale(null);
		jframe.setVisible(true);
	}
	
}

