package sub1;

public class Apple {

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
	
	
	
}
