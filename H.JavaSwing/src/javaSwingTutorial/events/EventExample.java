package javaSwingTutorial.events;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EventExample {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label = new JLabel("some text");
		JButton button1 = new JButton("Click me!!");
		JButton button2 = new JButton("Exit");
		JTextArea textArea = new JTextArea();
		JTextField textField = new JTextField();
		JPanel btnPanel = new JPanel();
		panel.setLayout(new BorderLayout());

		btnPanel.add(button1);
		btnPanel.add(button2);
		panel.add(label, BorderLayout.NORTH);
		panel.add(btnPanel, BorderLayout.WEST);
		panel.add(textArea, BorderLayout.CENTER);

		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textArea.getText());
			}
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		frame.add(panel);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(840, 840 / 12 * 9));
		frame.setSize(840, 840 / 12 * 9);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
