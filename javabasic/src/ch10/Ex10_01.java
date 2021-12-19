package ch10;

import java.util.Calendar;

// 날짜와 시간 
public class Ex10_01 {
	public static void main(String[] args) {
		// Calendar 객체를 생성해 int get(int field)으로 날짜와 시간 필드 가져오기 - 현재 날짜와 시간으로 세팅 
		Calendar cal = Calendar.getInstance();
		
		// 날짜 
		// 올해
		int thisYear = cal.get(Calendar.YEAR);
		// 이번달(0부터 시작)
		int thisMonth = cal.get(Calendar.MONTH) + 1;
		// 오늘 날짜
		int today = cal.get(Calendar.DATE);
		// 1월1일부터 지금까지 몇 번째 주
		int weekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
		// 이번달 몇 번째 주
		int weekOfMonth = cal.get(Calendar.WEEK_OF_MONTH);
		// 1월1일부터 지금까지 몇 번째 일 
		int dayOfMonth = cal.get(Calendar.DAY_OF_YEAR);
		// 이번달 몇 번째 일
		int dayOfYear = cal.get(Calendar.DAY_OF_MONTH);
		// 이 달의 마지막 날
		int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE);
		
		
		System.out.println(thisYear + "년 " + thisMonth + "월 " + today + "일");
		System.out.println(weekOfMonth);
		System.out.println(weekOfYear);
		System.out.println(dayOfMonth);
		System.out.println(dayOfYear);
		
		// 시간
		// 시(0 - 11)
		int hour = cal.get(Calendar.HOUR);
		// 시(0 - 23)
		int hour2 = cal.get(Calendar.HOUR_OF_DAY);
		// 분 
		int minute = cal.get(Calendar.MINUTE);
		// 초
		int second = cal.get(Calendar.SECOND);
		// 천분의 일초
		int millisecond = cal.get(Calendar.MILLISECOND);
		// GMT기준 시차
		int zoneOffSet = cal.get(Calendar.ZONE_OFFSET);
		// 오전/오후 
		int ampm = cal.get(Calendar.AM_PM);
		
		System.out.println(hour2 + "시 " + minute + "분 " + second + "초");
		System.out.println(millisecond);
		System.out.println(zoneOffSet);
		System.out.println(ampm);
	}
}
