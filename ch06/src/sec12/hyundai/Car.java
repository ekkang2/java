package sec12.hyundai;

import sec12.hankook.SnowTire;
import sec12.kumho.AllSeasonTire;

//import 문으로 다른 패키지 클래스 사용을 명시

public class Car {

	// 부품 필드 선언
	sec12.hankook.Tire tire1 = new sec12.hankook.Tire();
	sec12.kumho.Tire tire2 = new sec12.kumho.Tire();
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
	
}
