package inheritanceExample05;
import java.awt.*;

public class IsATest extends Frame {

	//Frame f = new Frame("��Ӱ���");
	Button b = new Button("Ȯ��");

	public IsATest() {
		super("��Ӱ���");
		//setTitle("Is A Test");
		setLayout(new FlowLayout());
		//b.setLabel("����!!!");
		add(b);
		setBackground(Color.CYAN);
		setLocation(300, 200);
		setSize(400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IsATest();
	}
}
