package test04;

public class Member {

	private String name;
	private String memberId;
	private Book borrowedBook;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}

	public void borrowBook(Book book) {
		
		book.borrowBook();
		borrowedBook = book;
		
	}
	
	public void returnBook(Book book) {
		
		book.returnBook();
        borrowedBook = null;
	}
	
	public void getMemberInfo() {
		System.out.println("회원명 : " + this.name);
		System.out.println("아이디 : " + this.memberId);
		System.out.println("대출한 도서 : " + (borrowedBook == null ? "없음" : borrowedBook.getTitle()));
	}
	
}
