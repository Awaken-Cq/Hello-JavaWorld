public class Opertest5 {

	public static void main(String[] args) {
		int x = 0;
		
		System.out.println("1. x = " + x);

		x = 10;
		System.out.println("2. x = " + x);

		x += 5;	//	x = x + 5;
		System.out.println("3. x = " + x);

		x -= 5;	//	x = x + 5;
		System.out.println("4. x = " + x);

		x *= 5;	//	x = x + 5;
		System.out.println("5. x = " + x);

		x /= 5;	//	x = x + 5;
		System.out.println("6. x = " + x);

		x %= 5;	//	x = x + 5;
		System.out.println("7. x = " + x);

		x = 10;
		System.out.println(x);
		x += 1;
		System.out.println(x);
		++x;
		System.out.println(x);
		x = x + 1;
		System.out.println(x);
		x++;
		System.out.println(x);

		int z =0 /10;
		System.out.println(z);

		z = 10/0;
		System.out.println(z);
	}
}
