package javaswing_Login;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
	//	setPreferredSize(new Dimension(im
		setLayout(null);
	}
	public void paintComponent (Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	
}

public class Login extends JFrame {
	
	public Login() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pswrd = new JLabel("Password : ");
		JPasswordField textPW = new JPasswordField(10);
		JTextField textID = new JTextField(10);
		JButton logBtn = new JButton("Log In");
		//
		ImagePanel imagePanel = new ImagePanel(
							 	new ImageIcon("./image/bird.jpg")
							 	.getImage());
		panel.add(label);
		panel.add(textID);
		panel.add(pswrd);
		panel.add(textPW);
		panel.add(logBtn);
		
		logBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String id = "dongbin";
				String pw = "1234";
				
				if (id.equals(textID.getText())&&pw.equals(pswrd.getText())) {
					JOptionPane.showMessageDialog(null, "Pass");					
				} else {
					JOptionPane.showMessageDialog(null, "Fail");
					
				}
			}
			
		});
		
		add(panel);
		//add(imagePanel);
		//pack();
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new Login();
	}

}
