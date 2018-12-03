package nestedInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonExample {
	public static void main(String[] args) {
		
		Button btn = new Button();
		btn.setOnClickListener(new CallListener());
		btn.touch();

		Button.OnClickListener btn2 = 
				new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		};
		btn2.onClick();
//		
//		JFrame frame = new JFrame("NestedInterface Sample");
//		JButton button = new JButton("HI");
//		button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if (button.getText() == "HI") {
//					button.setText("good bye");
//				} else {
//					button.setText("HI");
//				}
//			}
//		});
//
//		frame.add(button);
//		frame.setVisible(true);
//		frame.setSize(300, 300);
	}
}
