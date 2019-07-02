package basicApiClass;

import java.util.*;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		TimeZone tz = now.getTimeZone();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(amPm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		System.out.println(tz);
		
	}
}
