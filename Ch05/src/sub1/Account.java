package sub1;

public class Account {
	
	//속성
	String bank;
	String id;
	String name;
	int balance; //전역 변수
	
	//기능
	public void deposit(int money) {
		this.balance += money; //this는 이 안의 전역 변수를 가리키는 것을 말한다
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("------------------------");
		System.out.println("은행명	: "+this.bank);
		System.out.println("계좌	: "+this.id);
		System.out.println("입금주	: "+this.name);
		System.out.println("현재잔액	: "+this.balance);
		System.out.println("------------------------");
	}
}
