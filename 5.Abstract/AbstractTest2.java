public class AbstractTest2 {

	public static void main(String[] args) throws Exception {
		
		//3. 외부클래스 참조.
		//
		//런타임클래스는 프라이빗이기 때문에 new로 객체생성을 할 수 없다.
		//그래서 런타임을 반환하는 메소드를 찾아 런타임 반환.
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("calc");
		System.out.println("");

	}
}
