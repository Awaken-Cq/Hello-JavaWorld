public class StarCraft {

	public static void main(String[] args) {
		int count = 2;
		Marine my = new Marine();
		Marine com = new Marine();

		my.attack(com,count);
		System.out.println("내가 적을 " + count + "회 공격!");
		System.out.println("내 체력 : "+ my.hp + " : 적 체력 : " + com.hp);
//		
		count = 4;
		com.attack(my,count);
		System.out.println("적이 나를 " + count + "회 공격!");
		System.out.println("내 체력 : "+ my.hp + " : 적 체력 : " + com.hp);
//		
		System.out.println("모드 변경!!!");
		my.mode(my,1);
		System.out.println("내 체력 : "+ my.hp + " : 적 체력 : " + com.hp);

		count = 3;
		my.attack(com,count);
		System.out.println("내가 적을 " + count + "회 공격!");
		System.out.println("내 체력 : "+ my.hp + " : 적 체력 : " + com.hp);

		System.out.println("모드 변경!!!");
		my.mode(my,1);
		System.out.println("내 체력 : "+ my.hp + " : 적 체력 : " + com.hp);

		count = 3;
		my.attack(com,count);
		System.out.println("내가 적을 " + count + "회 공격!");
		System.out.println("내 체력 : "+ my.hp + " : 적 체력 : " + "die\n" + "win");



/*
		//내체력 : 100 적체력 : 100
		int count = 2;
		System.out.println("내가 적을 " + count + "회 공격!");
		//공격~

		//내체력 : 100 적체력 : 80
		
		count = 4;
		System.out.println("적이 나를 " + count + "회 공격!");

		//내체력 : 60 적체력 : 80
		System.out.println("모드 변경!!!!");

		//내체력 : 35 적체력 : 80
		count = 3;
		System.out.println("내가 적을 " + count + "회 공격!");

		//내체력 : 35 적체력 : 35
		System.out.println("모드 변경!!!!");

		//경고 : 모드 변경 불가.
		//내체력 : 35 적체력 : 35
		count = 3;
		System.out.println("내가 적을 " + count + "회 공격!");


		//내체력 : 35 적체력 : die
		//			win
		*/
	}
}
