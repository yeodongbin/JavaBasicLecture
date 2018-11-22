package javaswing_Login;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{

	public Login() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("PassWord : ");
		JPasswordField textPW = new JPasswordField();
		JTextField textID = new JTextField(10);
		JButton logBtn = new JButton("Log In");
		
		panel.add(label);
		panel.add(textID);
		panel.add(textPW);
		panel.add(logBtn);
		
		setVisible(true);
		setSize(600,400);
	}
	
	public static void main(String[] args) {

	}

}
