package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "hello java !!!";
		
		//default�����ڰ� ����, �⺻������ String str�� ��.
		//�ƹ��͵� ������ ���ϸ� '����'�� ������ ��ū �з��� ��.��)"j"�� j�� �������� ����
		StringTokenizer st = new StringTokenizer(str);
		int cnt = st.countTokens();
		System.out.println("��ū�� : " + cnt);
		//Elemnets, Tokens�� ���ٰ� �����.
		//while���� ���鼭 "hello"��ū, "java"��ū, "!!!"��ū�� ������.
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			
		}
		//��ū ������ "|"�� �Ͽ� ���ڿ����� ���ϴ� �κи� ������ �� �ִ�.
		//��ɿ� ���� �����̳� �Ѱ��� ���ڿ����� ���� �ǹ̸� ��Ÿ���°�� �װ��� ������ �� �ִ�.
		str = "TO|����Ź|�ȳ��ϼ��� ���� ���ؿ�???";
		StringTokenizer st2 = new StringTokenizer(str, "|");
		String protocol = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		System.out.println("��� : " + protocol);
		System.out.println("�������� : " + to);
		System.out.println("������ �޼��� : " + msg);
		
		//**UUID : ���迡�� �ϳ����� ���̵�Ƽ���̾ ��´�.(������?)
		System.out.println(UUID.randomUUID());
	}

}
