public class Guest {

	static int cnt;	//	Class ���� static => Ŭ������.~
	String name;	//	instance ���� => ��ü��.~

	public  Guest(String name){
		this.name = name;
	}

	public static int visit(){
		cnt++;
		return cnt;
	}


}
