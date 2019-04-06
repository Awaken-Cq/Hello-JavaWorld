/* �޴�����
 * 1.���ڴ� ��Ʈ���ϰ�, ���̽��� ���� �޴� ����
 * 2.�޴��� �����ϸ� �� �޴��� ���� ȭ�� ������ �ٽ� �ѹ� �޴�����
 * 2-1 ��� �л� �� �� : 10\n �� �� : ����Ź\n �� �� : 2006\n
 *  ���� �� �� : 10\n �� �� : ����Ź\n �� �� : 2006\n
 *  ������ �� �� : 10\n �� �� : ����Ź\n �� ��  : 2006\n
 *  ����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է����ּ���.
 * 2-2 ã�� �̸����� �˻�
 * 	�̸� : ����Ź�Է�
 * ��� ���� : ~ \t �̸� : ~ \t �й�,����μ�(������ ���� �޶���)
 * ����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է����ּ���.
 * 2-3 ���� �̸����� ����
 * sm : ����Ź���� ���� �Ͽ����ϴ�.
 * ����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է����ּ���.
 * 
 * 2-4 ��ü���
 * �� select.
 * �̸�  - ���� - �а���
 * ����Ͻ÷��� 1, �����Ͻ÷��� 0�� �Է����ּ���.
 */

package com.xxx.haksa.service;

import java.io.*;
import java.util.ArrayList;

import com.xxx.haksa.data.HaksaDto;

public class HaksaServiceImpl implements HaksaService {

	ArrayList<HaksaDto> list = new ArrayList<HaksaDto>();
	String[] job;
	BufferedReader in;

	HaksaDto haksaDto;
	int m = 0;
	int age = 0;
	String name = "";
	String values = "";
	String s = "";
	Boolean flag;
	
	
	public HaksaServiceImpl() {
		super();
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public void menu() {
		System.out.println("========== �޴� ���� ==========");
		System.out.println("1. ���");
		System.out.println("2. ã��");
		System.out.println("3. ����");
		System.out.println("4. ��ü���");
		System.out.println("--------------------");
		System.out.println("0. ����");
		System.out.println("--------------------");
		System.out.print("��ȣ�� ������ �ּ���.. ");

		try {

			do {
				switch ((in.readLine())) {
				case "1":
					registerMenu();
					break;

				case "2":
					findNameMenu();
					break;

				case "3":
					deleteMenu();
					break;
				case "4":
					selectAll();
					break;
				case "0":
					processExit();
					break;
				default:
					System.out.println("�Է��� �߸��Ǿ����ϴ�. ��ȣ�� ������ �ּ���.. ");break;
				}
			} while (true);

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(m);
	}

	@Override
	public void registerMenu() {
		System.out.println("========== �޴� ���� ==========");
		System.out.println("1. �л�");
		System.out.println("2. ����");
		System.out.println("3. ������");
		System.out.println("4. �����޴�");
		System.out.print("��ȣ�� ������ �ּ���.. ");
		try {


			switch (in.readLine()) {
			case "1":
				
				System.out.print("�� �� : ");
				s = in.readLine();
				
				if(isNum(s)) {
				age = Integer.parseInt(s);
				}else {
					System.out.println("���ڰ� �ƴմϴ�. �����޴��� ���ư��ϴ�.");
					registerMenu();
				}
				
				System.out.print("�� �� : ");
				name = in.readLine();
				System.out.print("�� �� : ");
				values = in.readLine();
				HaksaDto haksaDtoS = new HaksaDto(age, name, 0, values);
				register(haksaDtoS);
				break;

			case "2":
				System.out.print("�� �� : ");
				age = Integer.parseInt(in.readLine());
				System.out.print("�� �� : ");
				name = in.readLine();
				System.out.print("�� �� : ");
				values = in.readLine();
				HaksaDto haksaDtoP = new HaksaDto(age, name, 1, values);
				register(haksaDtoP);
				break;

			case "3":
				System.out.print("�� �� : ");

				age = Integer.parseInt(in.readLine());
				System.out.print("�� �� : ");

				name = in.readLine();
				System.out.print("�� �� : ");

				values = in.readLine();
				HaksaDto haksaDtog = new HaksaDto(age, name, 2, values);
				register(haksaDtog);
				break;
			case "4":
				menu();
				break;
			default:
				System.out.println("�Է��� �߸��Ǿ����ϴ�. ��ȣ�� ������ �ּ���.. ");
				registerMenu();
			}

		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("��ϵǾ����ϴ�.");
		menu();
	}

	@Override
	public void register(HaksaDto haksaDto) {

		list.add(haksaDto);

	}

	@Override
	public void findNameMenu() {
		job = new String[3];
		job[0] = "�� ��";
		job[1] = "�� ��";
		job[2] = "�� �� ";
		System.out.print("ã�� �̸��� �Է��� �ּ���.\n�̸� : ");

		try {

			name = in.readLine();
			HaksaDto hsd = findName(name);

			if (hsd != null) {
				System.out.println(
						"���� : " + hsd.getAge() + "\t�̸� : " + hsd.getName() + "\t"  + job[hsd.getKey()] + " : " + hsd.getValue());

			} else{
				System.out.println("�ش��ϴ� �̸��� �����ϴ�.");
			}
			
			
			
			System.out.println("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �����ÿ�.");
			do {		s = in.readLine(); 
			if (s.equals("0")) {
				
				processExit();break;
		
			}else if (s.equals("1")) {
				
				menu();break;
			} else {
				
				System.out.print("�Է��� �ǹٸ��� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			}
			} while (true);


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public HaksaDto findName(String name) {
		int size = list.size();
		for (int i = 0; i < size; i++) {
			if (name.equals(list.get(i).getName())) {
				return list.get(i);
			}
		}
		return null;
	}

	@Override
	public void deleteMenu() {
		System.out.print("ã�� �̸��� �Է��� �ּ���.\n�̸� : ");

		

			try {
				name = in.readLine();
				HaksaDto hsd = findName(name);
				if (hsd != null) {
					list.remove(hsd);
					System.out.println(name + "���� �����Ͽ����ϴ�.");
				} else{
					System.out.println("�ش��ϴ� �̸��� �����ϴ�.");
				}
				
				System.out.println("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �����ÿ�.");
				do {	
				m = Integer.parseInt(in.readLine()); 
				if (s.equals("0")) {
					
					processExit();
			
				}else if (s.equals("1")) {
					
					menu();
				} else {
					
					System.out.print("�Է��� �ǹٸ��� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				}
				}while(true);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
	}
	
	@Override
	public int delete(String name) {
		return 0;
	}

	@Override
	public void selectAll() {
		int size = list.size();
		for (int i = 0; i < size; i++) {
			if (list.get(i).getKey() == 0)
				System.out.println("�̸� : " + list.get(i).getName() + "\t���� : " + list.get(i).getAge() + "\t�й� : "
						+ list.get(i).getValue());
			else if (list.get(i).getKey() == 1)
				System.out.println("�̸� : " + list.get(i).getName() + "\t���� : " + list.get(i).getAge() + "\t���� : "
						+ list.get(i).getValue());
			else
				System.out.println("�̸� : " + list.get(i).getName() + "\t���� : " + list.get(i).getAge() + "\t�μ� : "
						+ list.get(i).getValue());
		}
		
		System.out.println("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �����ÿ�.");
try {
	do {
		m = Integer.parseInt(in.readLine()); 
		if (m == 0) {
			
			processExit();
	
		}else if (m== 1) {
			
			menu();
		} else {
			
			System.out.print("�Է��� �ǹٸ��� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
		}
	}while(true);
	} catch (IOException e) {
		e.printStackTrace();
	}
}


	

	@Override
	public void processExit() {
		System.out.println("����Ǿ����ϴ�.!!");
		System.exit(0);
	}

	public Boolean isNum(String s) {
			flag = true;
		int len = s.length();
		for(int i = 0; i< len ; i++) {
			m = s.charAt(i)-48;
			if(m < 0 || m > 9)
				flag = false;
		}
		
		return flag;
		
		
	}
	
}
