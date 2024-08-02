package sub8;

/*
 	인터페이스
 	 - 표준화된 클래스 설계에 사용되는 구조체
 	 - 오직 추상 메서드만 선언
 */

public interface RemoteControl {

	
	public abstract void powerOn();	// 온전한 메서드 말고 추상메서드로 만들어야 함 
	public abstract void powerOff();
	
	public abstract void chUp();	// abstract 키워드 생략가능
	public void chDown();
	
	public void soundUp();
	public void soundDown();
	
}
