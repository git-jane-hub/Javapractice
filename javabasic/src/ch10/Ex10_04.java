package ch10;

import java.util.Calendar;

// Calendar 클래스 
public class Ex10_04 {
	public static void main(String[] args) {
		// 날짜 지정
		Calendar date1 = Calendar.getInstance();
		date1.set(2002, 10, 20);
//		date1.set(Calendar.YEAR, 2021);
//		date1.set(Calendar.MONTH, 11);
//		date1.set(Calendar.DATE, 19);
		
		// 시간 지정 
		Calendar time1 = Calendar.getInstance();
		time1.set(Calendar.HOUR_OF_DAY, 14);
		time1.set(Calendar.MINUTE, 32);
		time1.set(Calendar.SECOND, 30);
		
	}
}
