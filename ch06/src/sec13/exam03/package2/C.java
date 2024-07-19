package sec13.exam03.package2;

import sec13.exam03.package1.A;

public class C {

	public C() {
		//객체 생성
		A a = new A();
		
		//필드값 변경
		a.field1 = 1;
//		a.field2 = 1;	// default 필드 접근 불가 
//		a.field3 = 1;	// private 필드 접근 불가 
		
		//메소드 호출
		a.method1();
//		a.method2();	// default 필드 접근 불가 
//		a.method3();	// private 필드 접근 불가 
	}
}
