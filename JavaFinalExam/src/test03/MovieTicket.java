package test03;

public class MovieTicket {

	
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
	}
	
	public MovieTicket(boolean isBooked) {
		this.isBooked = false;
	}

	public void bookTicket() {
		
		if(this.isBooked == false) {
			System.out.println(this.movieTitle +". " + this.screenTime + ". "  + this.seatNumber +" "+ "예매 완료");
			this.isBooked = true;
		}
		else {
			System.out.println("이미 예매됨");
		}
	}
	
	public void cancelBook() {
		
		if(this.isBooked == true) {
			System.out.println(this.movieTitle +". " + this.screenTime + ". "  + this.seatNumber +" "+ "취소 완료");
			this.isBooked = false;
		}
		else {
			System.out.println("아직 예매안됨");
		}
	}
	
	public void printTicketInfo() {
		System.out.println("영화제목 : " + this.movieTitle);
		System.out.println("상영시간 : " + this.screenTime);
		System.out.println("좌석번호 : " + this.seatNumber);
		System.out.println("예매여부 : " + (this.isBooked ? "Yes" : "No"));

		 
		 
	}
	
}
