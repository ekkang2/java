package test02;

public class Product {

	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId, String productName, int price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void updatePrice(int price) {
		this.price = price;
		System.out.println("키보드 가격 수정 됨");
	}
	
	public void addStock(int quantity) {
		this.quantity += quantity;
		System.out.println("키보드 " + this.quantity +"개 재고 추가 됨");
	}
	
	public void printProductInfo() {
		System.out.println("상품 ID : " + this.productId);
		System.out.println("상품이름 : " + this.productName);
		System.out.println("상품가격 : " + this.price);
		System.out.println("재고수량 : " + this.quantity);
	}
	
}
