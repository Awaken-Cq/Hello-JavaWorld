package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "hello java !!!";
		
		//default생성자가 없음, 기본적으로 String str이 들어감.
		//아무것도 지정을 안하면 '공백'을 가지고 토큰 분류를 함.예)"j"는 j를 기준으로 구분
		StringTokenizer st = new StringTokenizer(str);
		int cnt = st.countTokens();
		System.out.println("토큰수 : " + cnt);
		//Elemnets, Tokens는 같다고 보면됨.
		//while문이 돌면서 "hello"토큰, "java"토큰, "!!!"토큰이 찍혔음.
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
		//토큰 구분은 "|"로 하여 문자열에서 원하는 부분만 추출할 수 있다.
		//기능에 따른 구분이나 한가지 문자열에서 여러 의미를 나타내는경우 그것을 구분할 수 있다.
		str = "TO|노정탁|안녕하세요 오늘 머해요???";
		StringTokenizer st2 = new StringTokenizer(str, "|");
		String protocol = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		System.out.println("기능 : " + protocol);
		System.out.println("누구에게 : " + to);
		System.out.println("보내는 메세지 : " + msg);
		
		//**UUID : 세계에서 하나뿐인 아이덴티파이어를 얻는다.(고유값?)
		System.out.println(UUID.randomUUID());
	}

}
