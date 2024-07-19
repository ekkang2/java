package test3;
/*
 * 날짜 : 2024/07/11
 * 이름 : 강은경
 * 내용 : 싱글톤 객체 연습문제
 * 
 */
class Vehicle {
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("================");
		System.out.println("차량명 : "+name);
		System.out.println("가격 : "+price);
		System.out.println("---------------");
	}
}

// 싱글톤 객체 기본 형식으로 외우면 될듯
// 싱글톤 객체는 객체 생성을 못함 
class CarFactory {
	
	// 싱글톤 객체 눈에 익히기 
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}	// 객체 생성 못하게 막음 
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Vehicle createCar(String name, int price) {
		return new Vehicle(name, price);
	}
}

public class Test05 {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
				
		Vehicle avante = factory.createCar("아반테", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}

}
