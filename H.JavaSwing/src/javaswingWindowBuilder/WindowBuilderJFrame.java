package javaswingWindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WindowBuilderJFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderJFrame frame = new WindowBuilderJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBuilderJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 551);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(17, 15, 400, 66);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(17, 96, 400, 384);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		
		JButton button = new JButton("2");
		button.setBounds(113, 15, 81, 76);
		panel_1.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.setBounds(207, 15, 81, 76);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.setBounds(17, 106, 81, 76);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.setBounds(113, 106, 81, 76);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.setBounds(207, 106, 81, 76);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.setBounds(17, 197, 81, 76);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.setBounds(113, 197, 81, 76);
		panel_1.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.setBounds(207, 197, 81, 76);
		panel_1.add(button_7);
		
		JButton button_8 = new JButton("+");
		button_8.setBounds(302, 15, 81, 76);
		panel_1.add(button_8);
		
		JButton button_9 = new JButton("0");
		button_9.setBounds(17, 288, 81, 76);
		panel_1.add(button_9);
		
		JButton button_10 = new JButton(".");
		button_10.setBounds(113, 288, 81, 76);
		panel_1.add(button_10);
		
		JButton button_11 = new JButton("1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		button_11.setBounds(15, 15, 81, 76);
		panel_1.add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.setBounds(302, 106, 81, 76);
		panel_1.add(button_12);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(302, 197, 81, 76);
		panel_1.add(btnX);
		
		JButton button_14 = new JButton("%");
		button_14.setBounds(302, 288, 81, 76);
		panel_1.add(button_14);
		
		JButton button_15 = new JButton("=");
		button_15.setBounds(207, 288, 81, 76);
		panel_1.add(button_15);
	}
}
