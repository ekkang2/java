package sub3;

public class Calc {

	// 싱글톤 객체
	private static Calc instance = new Calc(); // 클래스에서 자신을 객체로 생성 
	public static Calc getInstance() {
		return instance;
	}
	private Calc() {} // 외부에서 객체 생성 못하도록 막아놓음
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
}
