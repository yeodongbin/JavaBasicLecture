package javaSwingTutorial;

import java.awt.Choice;
import java.awt.List;

import javax.swing.JFrame;

public class ChoiceEx1 {

	public static void main(String[] args) {
		JFrame jfr = new JFrame("Choice -Select");
		jfr.setSize(500, 500);
		jfr.setLayout(null); //사용자 임의 설정
		
		Choice day = new Choice();
		day.add("Sun");
		day.add("Mon");
		day.add("Tur");
		day.add("Wed");
		day.add("Thu");
		day.add("Fri");
		day.add("Sat");
		day.setSize(100,50);
		day.setLocation(100, 70);
		
		List selectOne = new List(6); //default 4
		selectOne.setLocation(100, 150);
		selectOne.setSize(100,200);
		selectOne.add("Sunday");
		selectOne.add("Monday");
		selectOne.add("Turesday");
		selectOne.add("Wednesday");
		selectOne.add("Thusday");
		selectOne.add("Friday");
		selectOne.add("Saturday");
		
		List selectMany = new List(6,true);
		selectMany.setLocation(250, 150);
		selectMany.setSize(50,200);
		selectMany.add("Sunday");
		selectMany.add("Monday");
		selectMany.add("Turesday");
		selectMany.add("Wednesday");
		selectMany.add("Thusday");
		selectMany.add("Friday");
		selectMany.add("Saturday");
		
		jfr.add(day);
		jfr.add(selectOne);
		jfr.add(selectMany);
		jfr.setVisible(true);
	}

}
