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

	public HaksaServiceImpl() {
		super();
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
			in = new BufferedReader(new InputStreamReader(System.in));

			do {
//				m = Integer.parseInt(in.readLine());
				switch (Integer.parseInt(in.readLine())) {
				case 1:
					registerMenu();
					break;

				case 2:
					findNameMenu();
					break;

				case 3:
					deleteMenu();
					break;
				case 4:
					selectAll();
					break;
				case 0:
					processExit();
					break;
				default:
					System.out.println("�Է��� �߸��Ǿ����ϴ�. ��ȣ�� ������ �ּ���.. ");
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
			in = new BufferedReader(new InputStreamReader(System.in));

//			m = Integer.parseInt(in.readLine());

			switch (Integer.parseInt(in.readLine())) {
			case 1:
				System.out.print("�� �� : ");
				in = new BufferedReader(new InputStreamReader(System.in));
				age = Integer.parseInt(in.readLine());
				System.out.print("�� �� : ");
				in = new BufferedReader(new InputStreamReader(System.in));
				name = in.readLine();
				System.out.print("�� �� : ");
				in = new BufferedReader(new InputStreamReader(System.in));
				values = in.readLine();
				HaksaDto haksaDtoS = new HaksaDto(age, name, 0, values);
				register(haksaDtoS);
				break;

			case 2:
				System.out.print("�� �� : ");
				in = new BufferedReader(new InputStreamReader(System.in));
				age = Integer.parseInt(in.readLine());
				System.out.print("�� �� : ");
				in = new BufferedReader(new InputStreamReader(System.in));
				name = in.readLine();
				System.out.print("�� �� : ");
				in = new BufferedReader(new InputStreamReader(System.in));
				values = in.readLine();
				HaksaDto haksaDtoP = new HaksaDto(age, name, 1, values);
				register(haksaDtoP);
				break;

			case 3:
				System.out.print("�� �� : ");
				in = new BufferedReader(new InputStreamReader(System.in));
				age = Integer.parseInt(in.readLine());
				System.out.print("�� �� : ");
				in = new BufferedReader(new InputStreamReader(System.in));
				name = in.readLine();
				System.out.print("�� �� : ");
				in = new BufferedReader(new InputStreamReader(System.in));
				values = in.readLine();
				HaksaDto haksaDtog = new HaksaDto(age, name, 2, values);
				register(haksaDtog);
				break;
			case 4:
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
		job[0] = "�л�";
		job[1] = "����";
		job[2] = "������";
		System.out.print("ã�� �̸��� �Է��� �ּ���.\n�̸� : ");

		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			
			
			
			name = in.readLine();
			HaksaDto hsd = findName(name);
			
			
				if (hsd.getKey() == 0) {
					System.out.println("�̸� : " + hsd.getName() + "\t���� : " + hsd.getAge() + "\t" + job[0] + " : " + hsd.getValue());
				
				}else if (hsd.getKey() == 1) {
					System.out.println("�̸� : " + hsd.getName() + "\t���� : " + hsd.getAge() + "\t" + job[1] + " : " + hsd.getValue());
							
				}else if(hsd.getKey() == 2) {
					System.out.println("�̸� : " + hsd.getName() + "\t���� : " + hsd.getAge() + "\t" + job[2] + " : " + hsd.getValue());
				}else {
				System.out.println("�ش��ϴ� �̸��� �����ϴ�.");
				}
				System.out.println("����Ͻ÷��� 1, �����Ͻ÷��� 0�� �����ÿ�.");
				in = new BufferedReader(new InputStreamReader(System.in));
				if(Integer.parseInt(in.readLine()) == 1) {
					menu();
				}else if(Integer.parseInt(in.readLine()) == 0) {
					processExit();
				}else {
					System.out.println("�Է��� �ǹٸ��� �ʽ��ϴ�.");
				}
//			int size = list.size();
//			for (int i = 0; i < size; i++) {
//				if (list.get(i).getKey() == 0)
//					System.out.println("�̸� : " + list.get(i).getName() + "\t���� : " + list.get(i).getAge() + "\t�й� : "
//							+ list.get(i).getValue());
//				else if (list.get(i).getKey() == 1)
//					System.out.println("�̸� : " + list.get(i).getName() + "\t���� : " + list.get(i).getAge() + "\t���� : "
//							+ list.get(i).getValue());
//				else
//					System.out.println("�̸� : " + list.get(i).getName() + "\t���� : " + list.get(i).getAge() + "\t�μ� : "
//							+ list.get(i).getValue());
//			}
//			
//			System.out.println("ã�ҽ��ϴ�.");
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public HaksaDto findName(String name) {
		int size = list.size();
		for (int i = 0; i < size; i++) {
			if (name.equals(list.get(i).getName())) {
			m = i; break;
			}else
				return null;
		}
		return list.get(m);
	}

	@Override
	public void deleteMenu() {

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

	}

	@Override
	public void processExit() {
		System.exit(0);
	}

}
