package confrim.ch06;

class Account1 {
	
	// 필드
	private int balance;
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;
	
	//Getter, Setter
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
}

public class Test19 {
	public static void main(String[] args) {
		Account1 account = new Account1();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: "+account.getBalance());

		account.setBalance(-100);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고: "+account.getBalance());
		
		account.setBalance(300000);
		System.out.println("현재 잔고: "+account.getBalance());
		
	}
}
