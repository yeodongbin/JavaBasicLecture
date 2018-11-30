package javaSwingTutorial;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class FlowLayoutEx extends JFrame {
	FlowLayoutEx(){
		setTitle("FlowLayout ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//contentpane flowlayout left sorting, left-right 30, up-down 40
		setLayout(new FlowLayout(FlowLayout.LEFT,30, 40));
		
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
		
		setSize(300, 200);
		setVisible(true);
	}
}

class BorderLayoutEx extends JFrame {
	BorderLayoutEx(){
		setTitle("BorderLayoutEx ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		add(new JButton("1"),BorderLayout.NORTH);
		add(new JButton("2"),BorderLayout.CENTER);
		add(new JButton("3"),BorderLayout.SOUTH);
		add(new JButton("4"),BorderLayout.EAST);
		add(new JButton("5"),BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
		
	}
}

class GridLayoutEx extends JFrame {
	GridLayoutEx(){
		setTitle("GridLayoutEx ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout gridLayout =new GridLayout(4,2); 
		gridLayout.setVgap(5);
		setLayout(gridLayout);
		
		add(new JLabel(" name :"));
		add(new JTextField(""));
		add(new JLabel(" student number :"));
		add(new JTextField(""));
		add(new JLabel(" department :"));
		add(new JTextField(""));
		add(new JLabel(" subject :"));
		add(new JTextField(""));
	
		setSize(300, 200);
		setVisible(true);
		
	}
}

class NullContainerEx extends JFrame {
	NullContainerEx(){
		setTitle("NullContainerEx ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(null);
		
		JLabel jla = new JLabel("Buttons");
		jla.setLocation(130, 50);
		jla.setSize(200, 20);
		add(jla);
		
		for (int i=1;i<=9;i++) {
			JButton btn = new JButton(Integer.toString(i));
			btn.setLocation(i*15, i*15);
			btn.setSize(50,20);
			add(btn);
		}
	
		setSize(300, 200);
		setVisible(true);
		
	}
}


public class Layout {

	public static void main(String[] args) {
		new FlowLayoutEx();
		new BorderLayoutEx();
		new GridLayoutEx();
		new NullContainerEx();
	}
}
