package basicApiClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {

		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat(
				"E요일, "
				+ "yyyy 년의 몇 번째주 w"
				+ " MM 월의 몇 번째주 W");
		
		System.out.println(sdf.format(now));
		
		
	}

}
