package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2024/07/29
 * 이름 : 강은경
 * 내용 : Delete 실습하기
 * 
 */
public class DeleteTest {

	public static void main(String[] args) {
		
		
		// DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; // <-- 마지막 접속 데이터베이스명
		String user = "root";
		String pass = "1234";
				
		try {
			
			// 1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// 2단계 - SQL실행 객체 statement 생성
			Statement stmt = conn.createStatement();
			
			// 3단계 - SQL 실행
			// 아이디 J101 삭제하기
			stmt.executeUpdate("DELETE FROM `user1` WHERE `uid`='J101'");
			
			// 4단계 - Resultset 결과처리(Select일 경우에만 수행)
			
			
			// 5단계 - 접속 종료
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Update 완료...");
		
	}
}
