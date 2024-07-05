package sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
		}
		//int v3 = v1 + v2 + 5;  // v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생(중괄호 블록 내에서 선언된 변수는 해당 블록 내에서만 사용이 가능함)
	}
}
