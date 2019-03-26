package com.kitri.lang;

public class StringBufferTest1 {

	public static void main(String[] args) {
		
		
		StringBuffer sb1 = new StringBuffer("Hello ");
		System.out.println(sb1);
		int cap = sb1.capacity();
		System.out.println("초기 크기 : " + cap + "\t문자열 수 : " + sb1.length());
		System.out.println("1. sb1 == " + sb1);
		sb1.append("Java");
		System.out.println(sb1);
		
		String s = "hello ";
		s.concat("java");
		//String은 기존 문자열에 무언가를 추가할 수 없다.
		System.out.println(s);
		//콘캣 메소드를 직접실행해줘야 붙어서 반환 그러나 s에는 그대로 hello 뿐이다.
		System.out.println(s.concat("java"));
		System.out.println("2. sb1 == " + sb1);
		sb1.append(" !!!!!");
		System.out.println(sb1);
		System.out.println("3. sb1 == " + sb1);
		cap = sb1.capacity();
		System.out.println("크기 : " + cap + "\t문자열 수 : " + sb1.length());
		sb1.append(" !!!!!!");
		//문자열이 크기를 초과할 경우 자동으로 여유공간이 증가된다.
		System.out.println("4. sb1 == " + sb1);
		cap = sb1.capacity();
		System.out.println("크기 : " + cap + "\t문자열 수 : " + sb1.length());

//		insert
		sb1.insert(10,"@@@");
		System.out.println("5. sb1 == " + sb1);
		//	delete(어디부터,어디전까지)	10부터 12전까지 지워짐.(=subString)
		sb1.delete(10,12);
		System.out.println("6. sb1 == " + sb1);
		//	deleteCharAt(어디에 위치는 문자하나)
		sb1.deleteCharAt(10);
		System.out.println("7. sb1 == " + sb1);
		
		//replace(어디부터, 어디전까지를, 대체문자열)6부터 10전까지 대체.(=delete)
		//칸수와 대체문자열의 길이는 상관없음. 그저 칸수만큼의 문자열을 빼고 대체문자열을 삽입.
		sb1.replace(6,  10, "자바");
		System.out.println("8. sb1 == " + sb1);
		
		//reverse()
		sb1.reverse();
		System.out.println("9. sb1 == " + sb1);
		sb1.reverse();
		
		//setCharAt(어디에있는문자를, 무엇으로 대체)
		sb1.setCharAt(9, '@');
		System.out.println("10. sb1 == " + sb1);
		
		//StringBuffer는 문자열이 아니라 단지 임시공간에 존재하는 것이다.
		//고로 마지막에는 StringBuffer를 String에 넣어 String클래스를 만들어야한다.
		//2가지 방법
		//1.
		String s1 = new String(sb1);
		//2.
		String s2 = sb1.toString();
		
		String str = "hello 자바 !!!";
		String findstr = "자바";
		String findstr2 = "오라클";
		String restr = "java";
		
		//hello java !!!
		//오라클은 없습니다.
		StringBuffer nsb = new StringBuffer(str);

		System.out.println(nsb);
		
		int start = str.indexOf(findstr);
		int end =findstr.length();
		nsb.delete(start, start+end);
		//== nsb.delete(6,8);
		
		System.out.println(nsb);
		
		nsb.insert(6,restr);
		System.out.println(nsb);
		String s3 = nsb.toString();
		
		
		
		if(s3.substring(6,8).equals(findstr2)){
		System.out.println(s3);
		} else {
		System.out.println(findstr2 + "은 없습니다.");
		}

		if(nsb.indexOf(findstr2) != -1 ){
			System.out.println(s3);
		} else {
			System.out.println(findstr2 + "은 없습니다.");
		}
		
		System.out.println(nsb.indexOf(findstr2));
		
	}
	
}
