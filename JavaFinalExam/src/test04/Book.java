package test04;

public class Book {

	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public Book(boolean isBorrowd) {
		this.isBorrowd = false;
	}
	
	// 도서가 대출되지 않은 상태라면 대출
	public void borrowBook() {
		
		if(isBorrowd == false) {
			this.isBorrowd = true;
		}
		
	}
	
	// 도서가 대출된 상태라면 반납
	public void returnBook() {
		
		if(isBorrowd == true) {
			this.isBorrowd = false;
		}
	}
	
	// 도서의 정보를 출력(제목, 저자, ISBN, 대출 여부)
	public void getBookInfo() {
		System.out.println("도서명 : " + this.title);
		System.out.println("저자 : " + this.author);
		System.out.println("ISBN : " + this.isbn);
		System.out.println("대출여부 : " + (this.isBorrowd ? "불가능" : "가능"));
	}
	
	public String getTitle() {
		return title;
	}
	
}
