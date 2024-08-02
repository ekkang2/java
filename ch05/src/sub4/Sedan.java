package sub4;

// Sedan 클래스 생성 
public class Sedan extends Car {

	// Car 클래스를 상속받기 때문에 car에 있는 부분 필요없음
//	private String name;
//	private String color;
//	private int speed;
	private int cc;
	
	// 생성자 
	public Sedan(String name, String color, int speed, int cc) {
//		this.name = name;
//		this.color = color;
//		this.speed = speed;
		super(name, color, speed); // 부모클래스 생성자 호출(초기화)
		this.cc = cc;
	}
	
	public void show() {
		super.show();
		System.out.println("배기량 : " + cc);
	}
	
//	public void speedUp(int speed) {
//		this.speed += speed;
//	}
//	
//	public void speedDown(int speed) {
//		this.speed -= speed;
//	}
	
	
}
