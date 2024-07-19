package sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		
		//Phone phone = new Phone();	//Phone() new 연산자로 직접 생성 불가능 
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
