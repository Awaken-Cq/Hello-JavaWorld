/* 필드
 * 잔고(음수불가) ~ 1,000,000(메소드에서 설정해줘야할듯)
 * 외부에서 변경불가(private)
 * MIN_BALANCE, MAX_BALANCE
 * 메소드
 * getBalance 
 * 
 * 
 */
public class Account {
	
	private int balance;
	private int MAX_BALANCE = 1000000;
	private int MIN_BALANCE = 0;
	
	public void setBalance(int m) {
		if( m >= MIN_BALANCE && m <= MAX_BALANCE)
			balance = m;
	}
			


	
	
	public int getBalance() {
		
		return balance;
	}
	
	
}
