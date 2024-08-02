package user3;

import java.util.List;
import java.util.Scanner;

import user2.User2DAO;
import user2.User2VO;

/*
 * 날짜 : 2024/07/30
 * 이름 : 강은경
 * 내용 : CRUD 실습하기3
 * 
 */
public class User3Main {

	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		System.out.println("user3 회원 관리 매니저 v1.0");
		System.out.println("-------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택> ");
			
			int answer = sc.nextInt();
			
			if(answer == 0) {
				break;
			}else if(answer == 1) {
				
				System.out.print("아이디 입력 : ");
				String uid = sc.next();
				
				System.out.print("이름 입력 : ");
				String name = sc.next();
				
				System.out.print("생년월일 입력 : ");
				String birth = sc.next();
				
				System.out.print("전화번호 입력 : ");
				String hp = sc.next();
				
				System.out.print("주소 입력 : ");
				String addr = sc.next();
				
				User3VO vo = new User3VO(uid, name, birth, hp, addr);
				
				User3DAO dao = User3DAO.getInstance();
				dao.insertUser(vo);
				
				System.out.println("입력 완료...");
				
			}else if(answer == 2) {
				
				User3DAO dao = User3DAO.getInstance();
				List<User3VO> users = dao.selectUsers();
				
				for(User3VO user : users) {
					System.out.println(user);
				}
				
			}else if(answer == 3) {
				
				System.out.println("검색 아이디 : ");
				String searchUid = sc.next();
				
				User3DAO dao = User3DAO.getInstance();
				User3VO user = dao.selectUser(searchUid);
				
				System.out.println(user);
				
			}else if(answer == 4) {
				
				User3VO user = new User3VO();
				
				System.out.println("수정 회원 아이디 입력 : ");
				user.setUid(sc.next());
				
				System.out.println("수정 회원 이름 입력 : ");
				user.setName(sc.next());
				
				System.out.println("수정 회원 생년월일 입력 : ");
				user.setBirth(sc.next());
				
				System.out.println("수정 회원 전화번호 입력 : ");
				user.setHp(sc.next());
				
				System.out.println("수정 회원 주소 입력 : ");
				user.setAddr(sc.next());
				
				int result = User3DAO.getInstance().updateUser(user);
				
				if(result > 0) {
					System.out.println("수정 완료...");
				}else {
					System.out.println("수정 할 회원 아이디가 없습니다.");
				}
				
			}else if(answer == 5) {
				
				System.out.println("삭제 회원 아이디 입력 : ");
				String uid = sc.next();
				
				int result = User3DAO.getInstance().deleteUser(uid);
				
				if(result > 0) {
					System.out.println("삭제 완료...");
				}else {
					System.out.println("삭제 할 회원 아이디가 없습니다.");
				}
			}
			
		}
		
		sc.close();
		System.out.println("프로그램 종료...");
		
	}
}
