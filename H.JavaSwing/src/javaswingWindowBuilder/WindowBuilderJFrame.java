package javaswingWindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowBuilderJFrame extends JFrame {

	private JPanel contentPane;
	private String func = "ADD";
	private int firstNumber = 0;

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

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(17, 96, 400, 384);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel anwserLabel = new JLabel("0");
		anwserLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		anwserLabel.setBounds(17, 15, 383, 66);
		contentPane.add(anwserLabel);

		JButton button01 = new JButton("1");
		button01.setBounds(15, 15, 81, 76);
		panel_1.add(button01);

		JButton button02 = new JButton("2");
		button02.setBounds(113, 15, 81, 76);
		panel_1.add(button02);

		JButton button03 = new JButton("3");
		button03.setBounds(207, 15, 81, 76);
		panel_1.add(button03);

		JButton button04 = new JButton("4");
		button04.setBounds(17, 106, 81, 76);
		panel_1.add(button04);

		JButton button05 = new JButton("5");
		button05.setBounds(113, 106, 81, 76);
		panel_1.add(button05);

		JButton button06 = new JButton("6");
		button06.setBounds(207, 106, 81, 76);
		panel_1.add(button06);

		JButton button07 = new JButton("7");
		button07.setBounds(17, 197, 81, 76);
		panel_1.add(button07);

		JButton button08 = new JButton("8");
		button08.setBounds(113, 197, 81, 76);
		panel_1.add(button08);

		JButton button09 = new JButton("9");
		button09.setBounds(207, 197, 81, 76);
		panel_1.add(button09);

		JButton button00 = new JButton("0");
		button00.setBounds(17, 288, 81, 76);
		panel_1.add(button00);

		JButton button_point = new JButton(".");
		button_point.setBounds(113, 288, 81, 76);
		panel_1.add(button_point);

		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String curr = anwserLabel.getText();
				firstNumber = Integer.parseInt(curr);
				anwserLabel.setText("0");
				func = "ADD";
			}
		});
		button_plus.setBounds(302, 15, 81, 76);
		panel_1.add(button_plus);

		JButton button_minus = new JButton("-");
		button_minus.setBounds(302, 106, 81, 76);
		panel_1.add(button_minus);

		JButton button_mux = new JButton("X");
		button_mux.setBounds(302, 197, 81, 76);
		panel_1.add(button_mux);

		JButton button_div = new JButton("%");
		button_div.setBounds(302, 288, 81, 76);
		panel_1.add(button_div);

		JButton button_equal = new JButton("=");
		button_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (func) {
				case "ADD":
					int currValue = Integer.parseInt(anwserLabel.getText());
					anwserLabel.setText(firstNumber + currValue + "");
				}
			}
		});
		button_equal.setBounds(207, 288, 81, 76);
		panel_1.add(button_equal);

		button01.addActionListener(new NumberActionLintener(anwserLabel, "1"));
		button02.addActionListener(new NumberActionLintener(anwserLabel, "2"));
		button03.addActionListener(new NumberActionLintener(anwserLabel, "3"));
		button04.addActionListener(new NumberActionLintener(anwserLabel, "4"));
		button05.addActionListener(new NumberActionLintener(anwserLabel, "5"));
		button06.addActionListener(new NumberActionLintener(anwserLabel, "6"));
		button07.addActionListener(new NumberActionLintener(anwserLabel, "7"));
		button08.addActionListener(new NumberActionLintener(anwserLabel, "8"));
		button09.addActionListener(new NumberActionLintener(anwserLabel, "9"));
		button00.addActionListener(new NumberActionLintener(anwserLabel, "0"));
	}
}

class NumberActionLintener implements ActionListener {

	private JLabel label;
	private String text;

	NumberActionLintener(JLabel l, String t) {
		label = l;
		text = t;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String curr = label.getText();
		if (curr.equals("0")) {
			label.setText(text);
		} else {
			label.setText(label.getText() + text);
		}
	}

}
