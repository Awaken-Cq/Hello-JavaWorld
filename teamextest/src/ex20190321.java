/*조건문
 * 반복
 * 배열쓰기
 * 변수
 * 동물
 * cat 3
 * dog 4
 * lion 5
 * tiger 8
 * 
 * x / y = 3, 4, 5, 8
 * 
 * 중복될때 연속으로 나열
 * 
 * 하단의 출력된 동물이름을 count
 * 
 *
 */
public class ex20190321 {

	public static void main(String[] args) {
		
		String ani[] = {"cat", "dog", "lion", "tiger"};
		int cat = 0;
		int dog = 0;
		int lion = 0;
		int tiger = 0;
		
		for(int i = 1;i<25;i++){
			System.out.print(i+". " );
			if(i%3 == 0) {
				cat++;
				System.out.print(ani[0] + " ");
			}
			if(i%4 == 0) {
				dog++;
				System.out.print(ani[1] + " ");			
			}
			if(i%5 == 0) {
				lion++;
				System.out.print(ani[2] + " ");
			}				
			if(i%8 == 0) {
				tiger++;
				System.out.print(ani[3] + " ");
			}
			System.out.println("");
		}
		System.out.println("==<<Fruit Count List>>==");
		System.out.println("cat" + cat + "회");
		System.out.println("cat" + dog + "회");
		System.out.println("cat" + lion + "회");
		System.out.println("cat" + tiger + "회");
	}	
}
