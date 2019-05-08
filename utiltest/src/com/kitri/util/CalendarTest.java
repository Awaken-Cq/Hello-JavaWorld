package com.kitri.util;
import java.util.*;
public class CalendarTest {
	public static void main(String[] args) {
		//1 ����Ŭ���� ����
		//2019�� 03�� 26�� ���� 1�� 17�� 35��
		
		Calendar cal = new GregorianCalendar();
		
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DAY_OF_MONTH);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		int apm = cal.get(Calendar.AM_PM);
		
	System.out.println(y+ "�� " + zeroPlus(m) + "�� "+zeroPlus(d)+"�� "+(apm == 0 ? "����" : "����")
			+ " " + zeroPlus(h)+"�� "+zeroPlus(mi)+"�� "+zeroPlus(s)+ "��");
	
	//**date class
	Date date = new Date();
	
	//after(����), before(����) Ư�� ��¥���� �������� ��������.
	
	//toString
	System.out.println(date.toString());
		
		
	}
	//static�� ������ �ڱⰡ ������ �ڱⰡ �޴°�� ���α׷���ü������ ������ ��ġ������.
	//�׷��� static���� ���������� ��ġ�� �� �ִٸ�, ��ĩ ���α׷� ��ü������ ��ȭ�� ���� �� �ֱ⶧����
	// static�� �����ʴ°� ����. pointcardEx����.
	private static String zeroPlus(int num) {
		return (num < 10 ? "0" + num : "" + num);
		
	}
	
	
	
}

//2 �ڽ��� ��ü�� return �ϴ� static method
//Calendar cal = Calendar.getInstance();