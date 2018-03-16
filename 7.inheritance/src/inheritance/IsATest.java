package inheritance;
import java.awt.*;

public class IsATest extends Frame {

	//Frame f = new Frame("상속관계");
	Button b = new Button("확인");

	public IsATest() {
		super("상속관계");
		//setTitle("Is A Test");
		setLayout(new FlowLayout());
		//b.setLabel("눌러!!!");
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
