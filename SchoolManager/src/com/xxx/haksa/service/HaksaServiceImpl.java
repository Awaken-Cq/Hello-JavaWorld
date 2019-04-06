/* 메뉴선택
 * 1.숫자는 인트로하고, 케이스에 따라 메뉴 선택
 * 2.메뉴를 선택하면 그 메뉴에 따른 화면 구현과 다시 한번 메뉴선택
 * 2-1 등록 학생 나 이 : 10\n 이 름 : 노정탁\n 학 번 : 2006\n
 *  교수 나 이 : 10\n 이 름 : 노정탁\n 과 목 : 2006\n
 *  관리자 나 이 : 10\n 이 름 : 노정탁\n 부 서  : 2006\n
 *  계속하시려면 1, 종료하시려면 0을 입력해주세요.
 * 2-2 찾기 이름으로 검색
 * 	이름 : 노정탁입력
 * 출력 나이 : ~ \t 이름 : ~ \t 학번,과목부서(직업에 따라 달라짐)
 * 계속하시려면 1, 종료하시려면 0을 입력해주세요.
 * 2-3 삭제 이름으로 삭제
 * sm : 노정탁님을 삭제 하였습니다.
 * 계속하시려면 1, 종료하시려면 0을 입력해주세요.
 * 
 * 2-4 전체출력
 * 올 select.
 * 이름  - 나이 - 학과부
 * 계속하시려면 1, 종료하시려면 0을 입력해주세요.
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
		System.out.println("========== 메뉴 선택 ==========");
		System.out.println("1. 등록");
		System.out.println("2. 찾기");
		System.out.println("3. 삭제");
		System.out.println("4. 전체출력");
		System.out.println("--------------------");
		System.out.println("0. 종료");
		System.out.println("--------------------");
		System.out.print("번호를 선택해 주세요.. ");

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
					System.out.println("입력이 잘못되었습니다. 번호를 선택해 주세요.. ");break;
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
		System.out.println("========== 메뉴 선택 ==========");
		System.out.println("1. 학생");
		System.out.println("2. 교수");
		System.out.println("3. 관리자");
		System.out.println("4. 이전메뉴");
		System.out.print("번호를 선택해 주세요.. ");
		try {


			switch (in.readLine()) {
			case "1":
				
				System.out.print("나 이 : ");
				s = in.readLine();
				
				if(isNum(s)) {
				age = Integer.parseInt(s);
				}else {
					System.out.println("숫자가 아닙니다. 이전메뉴로 돌아갑니다.");
					registerMenu();
				}
				
				System.out.print("이 름 : ");
				name = in.readLine();
				System.out.print("학 번 : ");
				values = in.readLine();
				HaksaDto haksaDtoS = new HaksaDto(age, name, 0, values);
				register(haksaDtoS);
				break;

			case "2":
				System.out.print("나 이 : ");
				age = Integer.parseInt(in.readLine());
				System.out.print("이 름 : ");
				name = in.readLine();
				System.out.print("과 목 : ");
				values = in.readLine();
				HaksaDto haksaDtoP = new HaksaDto(age, name, 1, values);
				register(haksaDtoP);
				break;

			case "3":
				System.out.print("나 이 : ");

				age = Integer.parseInt(in.readLine());
				System.out.print("이 름 : ");

				name = in.readLine();
				System.out.print("부 서 : ");

				values = in.readLine();
				HaksaDto haksaDtog = new HaksaDto(age, name, 2, values);
				register(haksaDtog);
				break;
			case "4":
				menu();
				break;
			default:
				System.out.println("입력이 잘못되었습니다. 번호를 선택해 주세요.. ");
				registerMenu();
			}

		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		System.out.println("등록되었습니다.");
		menu();
	}

	@Override
	public void register(HaksaDto haksaDto) {

		list.add(haksaDto);

	}

	@Override
	public void findNameMenu() {
		job = new String[3];
		job[0] = "학 번";
		job[1] = "과 목";
		job[2] = "부 서 ";
		System.out.print("찾을 이름을 입력해 주세요.\n이름 : ");

		try {

			name = in.readLine();
			HaksaDto hsd = findName(name);

			if (hsd != null) {
				System.out.println(
						"나이 : " + hsd.getAge() + "\t이름 : " + hsd.getName() + "\t"  + job[hsd.getKey()] + " : " + hsd.getValue());

			} else{
				System.out.println("해당하는 이름이 없습니다.");
			}
			
			
			
			System.out.println("계속하시려면 1, 종료하시려면 0을 누르시오.");
			do {		s = in.readLine(); 
			if (s.equals("0")) {
				
				processExit();break;
		
			}else if (s.equals("1")) {
				
				menu();break;
			} else {
				
				System.out.print("입력이 옳바르지 않습니다. 다시 입력해주세요.");
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
		System.out.print("찾을 이름을 입력해 주세요.\n이름 : ");

		

			try {
				name = in.readLine();
				HaksaDto hsd = findName(name);
				if (hsd != null) {
					list.remove(hsd);
					System.out.println(name + "님을 삭제하였습니다.");
				} else{
					System.out.println("해당하는 이름이 없습니다.");
				}
				
				System.out.println("계속하시려면 1, 종료하시려면 0을 누르시오.");
				do {	
				m = Integer.parseInt(in.readLine()); 
				if (s.equals("0")) {
					
					processExit();
			
				}else if (s.equals("1")) {
					
					menu();
				} else {
					
					System.out.print("입력이 옳바르지 않습니다. 다시 입력해주세요.");
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
				System.out.println("이름 : " + list.get(i).getName() + "\t나이 : " + list.get(i).getAge() + "\t학번 : "
						+ list.get(i).getValue());
			else if (list.get(i).getKey() == 1)
				System.out.println("이름 : " + list.get(i).getName() + "\t나이 : " + list.get(i).getAge() + "\t과목 : "
						+ list.get(i).getValue());
			else
				System.out.println("이름 : " + list.get(i).getName() + "\t나이 : " + list.get(i).getAge() + "\t부서 : "
						+ list.get(i).getValue());
		}
		
		System.out.println("계속하시려면 1, 종료하시려면 0을 누르시오.");
try {
	do {
		m = Integer.parseInt(in.readLine()); 
		if (m == 0) {
			
			processExit();
	
		}else if (m== 1) {
			
			menu();
		} else {
			
			System.out.print("입력이 옳바르지 않습니다. 다시 입력해주세요.");
		}
	}while(true);
	} catch (IOException e) {
		e.printStackTrace();
	}
}


	

	@Override
	public void processExit() {
		System.out.println("종료되었습니다.!!");
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
