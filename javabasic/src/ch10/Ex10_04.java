package ch10;

import java.util.Calendar;

// Calendar 클래스 
public class Ex10_04 {
	public static void main(String[] args) {
		// 날짜 지정
		Calendar date0 = Calendar.getInstance();
		date0.set(2002, 10, 20);
//		date0.set(Calendar.YEAR, 2021);
//		date0.set(Calendar.MONTH, 11);
//		date0.set(Calendar.DATE, 19);
		
		// 시간 지정 
		Calendar time1 = Calendar.getInstance();
		time1.set(Calendar.HOUR_OF_DAY, 14);
		time1.set(Calendar.MINUTE, 32);
		time1.set(Calendar.SECOND, 30);
		
		// 요일은 1부터 시작, DAY_OF_WEEK[0]는 비워둠
		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
		
		// Calendar 객체 생성
		Calendar date1 = Calendar.getInstance();	// 오늘과 차이를 얻으려는 날짜 
		Calendar date2 = Calendar.getInstance();	// 오늘 
		
		// 월은 0부터 시작하기 때문에 12월인 경우, 11로 지정해야함
		// date1.set(2021, Calendar.DECEMBER, 20)으로 할 수 있음
		date1.set(2021, 0, 1);	// 2021년 1월 1일로 날짜 지정
		System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고, ");
		System.out.println("오늘(date2)은 " + toString(date2) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
	
		// 두 날짜 간 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환해야함
		long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
		System.out.println(date2.getTimeInMillis());
		System.out.println(date1.getTimeInMillis());
		System.out.println("그 날(date1)부터 지금(date2)까지 " + difference + "초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + difference / (24 * 60 * 60) + "일 입니다.");	// 1일 = 24 * 60 * 60
		
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1)+ "월 " + date.get(Calendar.DATE) + "일 ";
	}
}
