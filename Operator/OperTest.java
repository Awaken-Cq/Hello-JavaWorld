public class OperTest 
{
	public static void main(String[] args) 
	{
		int x = 10;
		System.out.println(x);
		System.out.println(x++);
		System.out.println(--x);
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
		System.out.println(x++);
		System.out.println(x);

		char c = 'a';
		System.out.println("c == " + c);
		System.out.println("(int)c == " + (int)c);

		int y = c;	//	자동형변환
		System.out.println("y == " + y);

		c= (char)y;	//	강제형변환
		System.out.println("c == " + c);
		
		//booliean b = true;	//	true or false가 1,0 등이 아니기 때문에
		//int j = b;			//	b는 숫자로 형변환 할 수 없다.

		int z = 30;
		double d = z;
		//z = d	//	error
		z = (int)d;
	}
}
