public class Guest {

	static int cnt;	//	Class 변수 static => 클래스명.~
	String name;	//	instance 변수 => 객체명.~

	public  Guest(String name){
		this.name = name;
	}

	public static int visit(){
		cnt++;
		return cnt;
	}


}
