package com.kitri.lang;

public class ReverseTest {

	public static void main(String[] args) {
		String str = "!!! avaJ olleH";
		
		//	Hello Java !!! 3가지 이상
		
		
		
		
		//1
		String result = "";
		int len = str.length();

				for (int i = len-1; i >= 0 ; i--) {
					result += str.charAt(i);
				}
		System.out.println(result);
		
		//2
		String result2 = "";
		
		char c[] = str.toCharArray();
		int len2 = c.length;
				for (int i = len2-1; i >= 0; i--) {
					result2 += c[i];
				}
		System.out.println(result2);
		
		
		//3
		
		char c2[] = str.toCharArray();
		int len3 = c2.length;
		char c3[] = new char[len3];
		int j = 0;
		
		for (int i = len3-1; i >= 0; i--) {
			c3[j] = c2[i];
			j++;
		}
		String result1 = new String(c3);
		System.out.println(c3);
			
		
		
		//3 getbytes
		
	byte b[] = str.getBytes();
	int len4 = str.length();
	byte b1[] = new byte[len4];
	int x = 0;
	for(int i = (len-1); i >= 0; i--)
			b1[x++] = b[i];
	String result3 = new String(b1);
	System.out.println(result3);
				
		// e는 2번째있습니다.
		//1
		System.out.println(result.indexOf('e')+1);
		
		//2
		System.out.println(result2.indexOf('e')+1);
		
		//3
		System.out.println(result3.indexOf('e')+1);
		
		
		
	}

}


