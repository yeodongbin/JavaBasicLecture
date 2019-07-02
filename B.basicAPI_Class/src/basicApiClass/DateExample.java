package basicApiClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date();
		String time = now.toString();
		System.out.println(time);
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy.MM.dd. hh:mm:ss");
		System.out.println(sdf.format(now));	
	}
}
