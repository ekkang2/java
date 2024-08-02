package sub1;

// 클래스 정의 
public class Account {

	// 속성(멤버변수)
	String bank;
	String acc;
	String name;
	int balance;
	
	// 기능(멤버 메서드)
	public void deposit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public void show() {
		System.out.println("-------------------");
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.acc);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
	}
}
