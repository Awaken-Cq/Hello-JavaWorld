public class MemberServiceExample {

	public static void main(String[] args) {
		MemBer mb = new MemBer("gildong", "hong", "12345", 25 );
		boolean result = mb.login("hong", "12345");
		
		if(result == true){
			
			System.out.println("�α��� �Ǿ����ϴ�.");
			System.out.println(mb.logout("hong"));
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
	}
}
