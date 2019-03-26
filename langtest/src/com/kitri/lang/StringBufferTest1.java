package com.kitri.lang;

public class StringBufferTest1 {

	public static void main(String[] args) {
		
		
		StringBuffer sb1 = new StringBuffer("Hello ");
		System.out.println(sb1);
		int cap = sb1.capacity();
		System.out.println("�ʱ� ũ�� : " + cap + "\t���ڿ� �� : " + sb1.length());
		System.out.println("1. sb1 == " + sb1);
		sb1.append("Java");
		System.out.println(sb1);
		
		String s = "hello ";
		s.concat("java");
		//String�� ���� ���ڿ��� ���𰡸� �߰��� �� ����.
		System.out.println(s);
		//��Ĺ �޼ҵ带 ������������� �پ ��ȯ �׷��� s���� �״�� hello ���̴�.
		System.out.println(s.concat("java"));
		System.out.println("2. sb1 == " + sb1);
		sb1.append(" !!!!!");
		System.out.println(sb1);
		System.out.println("3. sb1 == " + sb1);
		cap = sb1.capacity();
		System.out.println("ũ�� : " + cap + "\t���ڿ� �� : " + sb1.length());
		sb1.append(" !!!!!!");
		//���ڿ��� ũ�⸦ �ʰ��� ��� �ڵ����� ���������� �����ȴ�.
		System.out.println("4. sb1 == " + sb1);
		cap = sb1.capacity();
		System.out.println("ũ�� : " + cap + "\t���ڿ� �� : " + sb1.length());

//		insert
		sb1.insert(10,"@@@");
		System.out.println("5. sb1 == " + sb1);
		//	delete(������,���������)	10���� 12������ ������.(=subString)
		sb1.delete(10,12);
		System.out.println("6. sb1 == " + sb1);
		//	deleteCharAt(��� ��ġ�� �����ϳ�)
		sb1.deleteCharAt(10);
		System.out.println("7. sb1 == " + sb1);
		
		//replace(������, �����������, ��ü���ڿ�)6���� 10������ ��ü.(=delete)
		//ĭ���� ��ü���ڿ��� ���̴� �������. ���� ĭ����ŭ�� ���ڿ��� ���� ��ü���ڿ��� ����.
		sb1.replace(6,  10, "�ڹ�");
		System.out.println("8. sb1 == " + sb1);
		
		//reverse()
		sb1.reverse();
		System.out.println("9. sb1 == " + sb1);
		sb1.reverse();
		
		//setCharAt(����ִ¹��ڸ�, �������� ��ü)
		sb1.setCharAt(9, '@');
		System.out.println("10. sb1 == " + sb1);
		
		//StringBuffer�� ���ڿ��� �ƴ϶� ���� �ӽð����� �����ϴ� ���̴�.
		//��� ���������� StringBuffer�� String�� �־� StringŬ������ �������Ѵ�.
		//2���� ���
		//1.
		String s1 = new String(sb1);
		//2.
		String s2 = sb1.toString();
		
		String str = "hello �ڹ� !!!";
		String findstr = "�ڹ�";
		String findstr2 = "����Ŭ";
		String restr = "java";
		
		//hello java !!!
		//����Ŭ�� �����ϴ�.
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
		System.out.println(findstr2 + "�� �����ϴ�.");
		}

		if(nsb.indexOf(findstr2) != -1 ){
			System.out.println(s3);
		} else {
			System.out.println(findstr2 + "�� �����ϴ�.");
		}
		
		System.out.println(nsb.indexOf(findstr2));
		
	}
	
}
