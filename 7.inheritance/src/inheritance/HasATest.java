package inheritance;

import java.awt.*;

public class HasATest {

	Frame f = new Frame("포함관계");
	Button b = new Button("확인");

	public HasATest() {
		//f.setTitle("Has A Test");
		f.setLayout(new FlowLayout());
		//b.setLabel("눌러!!!");
		f.add(b);
		f.setBackground(Color.CYAN);
		f.setLocation(300, 200);
		f.setSize(400, 300);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new HasATest();
	}
}
