public class MemberServiceExample {

	public static void main(String[] args) {
		MemBer mb = new MemBer("gildong", "hong", "12345", 25 );
		boolean result = mb.login("hong", "12345");
		
		if(result == true){
			
			System.out.println("로그인 되었습니다.");
			System.out.println(mb.logout("hong"));
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}
}
