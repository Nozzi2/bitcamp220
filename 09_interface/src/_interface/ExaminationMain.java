package _interface;

public class ExaminationMain {

	public static void main(String[] args) {
		//ExaminationService examinationService = new ExaminationServiceImpl();
		ExaminationService examinationService = new ExaminationServiceImpl_lect();
		examinationService.menu();
		System.out.println("프로그램을 종료합니다.");
	}
}

/* 출력 샘플
1
홍길동
12122
1
코난
11111
1
또치
15555


*/


/*
[문제] 사지선다형으로 입력된 답안지를 채접하는 프로그램을 작성하시오.
-정답은 다 1번이다.
-문제는 총 5문제 개당 20점으로 채점한다.
- 이름과 5개의 답을 입력하여 OX로 채점하시오

클래스    : ExaminationDTO.java
			- 필드 : String name (이름)
					String dap
			      	char[] ox
			      	store 
			      	public static final String JUNG = "11111"; (미리 정답을 입력해놓기)
			- 메소드 : 생성자, setter / getter, compare()
			
인터페이스 : ExaminationService.java
			- 추상메소드 : insertArticle, printArticle
			 
클래스    : ExaminationServiceImpl.java  (인터페이스 구현부)



메소드 : 	생성자
		compare() 비교
		output()


[실행결과]
menu()
*****************
   1. 입력
   2. 출력
   3. 끝
*****************
   번호 : 1

[1번인 경우] - insertArticle(), 생성자를 이용
이름 입력 : 홍길동
답 입력 : 14123

[2번인 경우] - printArticle()
이름		1 2 3 4 5	점수
홍길동	O X O X X	40
코난		O O O O O	100
또치		O X X X X	20
*/




