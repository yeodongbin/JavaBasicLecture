package javaSwingTutorial.component;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableEx {
	
	JFrame jFrame = new JFrame("JTable");
	String columnNames[] = {"stu_no", "sub_no", "enr_grade"};
	
	Object rowData[][] = {{1,2,3},
								{4,5,6},
								{7,8,9}};
	
	JTable jTable = new JTable(rowData, columnNames);
	JScrollPane jScrollPane = new JScrollPane(jTable);
	
	public JTableEx() 	{
		jFrame.add(jScrollPane);
		jFrame.setSize(500,300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JTableEx();
	}
}
