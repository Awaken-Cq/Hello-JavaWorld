package com.kitri.util;
import java.util.*;
public class CalendarTest {
	public static void main(String[] args) {
		//1 하위클래스 참조
		//2019년 03월 26일 오후 1시 17분 35초
		
		Calendar cal = new GregorianCalendar();
		
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DAY_OF_MONTH);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		int apm = cal.get(Calendar.AM_PM);
		
	System.out.println(y+ "년 " + zeroPlus(m) + "월 "+zeroPlus(d)+"일 "+(apm == 0 ? "오전" : "오후")
			+ " " + zeroPlus(h)+"시 "+zeroPlus(mi)+"분 "+zeroPlus(s)+ "초");
	
	//**date class
	Date date = new Date();
	
	//after(언제), before(언제) 특정 날짜보다 이전인지 이후인지.
	
	//toString
	System.out.println(date.toString());
		
		
	}
	//static을 쓸때는 자기가 보내서 자기가 받는경우 프로그램전체적으로 영향을 미치지않음.
	//그러나 static에서 전역변수를 터치할 수 있다면, 자칫 프로그램 전체적으로 변화가 있을 수 있기때문에
	// static을 쓰지않는게 좋다. pointcardEx참조.
	private static String zeroPlus(int num) {
		return (num < 10 ? "0" + num : "" + num);
		
	}
	
	
	
}

//2 자신의 객체를 return 하는 static method
//Calendar cal = Calendar.getInstance();