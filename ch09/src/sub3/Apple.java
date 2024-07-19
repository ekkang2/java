package sub3;

import java.io.Serializable;

public class Apple implements Serializable {

	private static final long serialVersionUID = 1L; // 객체의 일련번호
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {	// 객체 정보를 출력하는 메서드 
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
	public void show() {
		System.out.println("원산지 : " + country);
		System.out.println("가격 : " + price);
	}
	
}
