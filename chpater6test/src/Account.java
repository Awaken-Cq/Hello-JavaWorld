/* �ʵ�
 * �ܰ�(�����Ұ�) ~ 1,000,000(�޼ҵ忡�� ����������ҵ�)
 * �ܺο��� ����Ұ�(private)
 * MIN_BALANCE, MAX_BALANCE
 * �޼ҵ�
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
