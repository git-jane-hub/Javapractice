package ch10;

import java.util.Calendar;

public class Ex10_06 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.clear();
		
		// 2020년 8월 31일 
		date.set(2020, 7, 31);
		System.out.println(toString(date));
		// add(): 특정 필드의 값을 증가 또는 감소(다른 필드에 영향을 미침)
		// 날짜에 1을 더해서 2020년 8월 1일
		date.add(Calendar.DATE, 1);
		System.out.println(toString(date));
		// 월에서 8을 빼서 2020년 1월 1일
		date.add(Calendar.MONTH, -8);
		System.out.println(toString(date));
		// 2020년 8월 31일 
		date.set(2020, 7, 31);
		System.out.println(toString(date));
		
		// roll(): 특정 필드의 값을 증가 또는 감소(다른 필드에 영향을 미치지 않음)
		// 날짜에 1을 더해 2020년 8월 1일 
		date.roll(Calendar.DATE, 1);
		System.out.println(toString(date));
		// 월에서 8을 빼서 12월 1일
		date.roll(Calendar.MONTH, -8);
		System.out.println(toString(date));
		
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일";
	}
}
