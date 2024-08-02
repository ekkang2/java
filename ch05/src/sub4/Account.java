package sub4;

// 클래스 정의 
public class Account {

	// 속성(멤버변수)은 무조건 private 선언 
	protected String bank;
	protected String acc;
	protected String name;
	protected int balance;
	
	// 생성자
	public Account(String bank, String acc, String name, int balance) {
		this.bank = bank;
		this.acc = acc;
		this.name = name;
		this.balance = balance;
	}
	
	// Getter, Setter 
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBank() {
		return bank;
	}
	
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
