package inheritanceExample05;

import java.awt.*;

public class HasATest {

	Frame f = new Frame("���԰���");
	Button b = new Button("Ȯ��");

	public HasATest() {
		//f.setTitle("Has A Test");
		f.setLayout(new FlowLayout());
		//b.setLabel("����!!!");
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
