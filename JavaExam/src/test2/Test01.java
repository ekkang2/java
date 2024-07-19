package test2;

/*
 * 날짜 : 2024/07/05
 * 이름 : 홍길동
 * 내용 : 자바 배열 문자 출력 연습문제
 */
public class Test01 {
	public static void main(String[] args) {
	
		// 문자 배열 선언 및 초기화
		char str[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U'};
		int row, col;
		
		// 외부 루프: 행을 제어 
		for(row = 1; row < 10; row++) {
			
			// 내부 루프 : 열을 제어, 현재 행의 크기만큼 문자를 출력
			for (col = 0; col <= row; col++) {
				
				// str 배열의 col 인덱스에 해당하는 문자를 출력(줄 바꿈 포함)
				System.out.print(str[col]);
			}
			
			System.out.println("\n");
		}
	}
}
