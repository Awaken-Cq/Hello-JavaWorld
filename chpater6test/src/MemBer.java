public class MemBer {

	String name;
	String id;
	String password;
	int age;

	public MemBer(String name, String id){
		this.name = name;
		this.id = id;
	}

	public MemBer(String name, String id, String password, int age){
		this(name, id);
		this.password = password;
		this.age = age;
	}

	public boolean login(String id, String password){
			if(this.id == id && this.password == password)
				return true;
			else
				return false;
	}

	public String logout(String id){
		
		return "로그아웃 되었습니다.";
		
	}
	
}
