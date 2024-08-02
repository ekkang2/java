package sub5;

//Truck 클래스 생성 
//Car는 부모클래스, Truck는 자식 클래스 
public class Truck extends Car {

	private int capacity;
	
	public Truck(String name, String color, int speed, int capacity) {
		super(name, color, speed);
		this.capacity = capacity; // 초기화 
	}
	
	@Override
	public void speedUp(int speed) {
		// Truck에 맞게 speedUP 메서드 재정의
		this.speed += speed / capacity;
	}
	
	public void show() {
		System.out.println("차량명 : " +  name);
		System.out.println("차량색 : " + color);
		System.out.println("현재속도 : " + speed);
		System.out.println("적재용량 : " + capacity);
	}
	
}
