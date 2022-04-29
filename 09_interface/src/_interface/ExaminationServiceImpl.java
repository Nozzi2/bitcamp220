package _interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExaminationServiceImpl implements ExaminationService {
	private List<ExaminationDTO> list;
	Scanner scan = new Scanner(System.in);

	
	public ExaminationServiceImpl() {
		list = new ArrayList<ExaminationDTO>(); //생성자를 통해 ArrayList 객체생성
	}
	
	
	/*
	*****************
	   1. 입력
	   2. 출력
	   3. 끝
	*****************
	   번호 : 1
	 */
	public void menu() {
		
		while(true) {
			System.out.println();
			System.out.println("**************");
			System.out.println("   1. 입력");
			System.out.println("   2. 출력");
			System.out.println("   3. 끝");
			System.out.println("**************");
			System.out.print("   번호 : ");
			int select=scan.nextInt();
			System.out.println();
			
			if(select==3) break;
			if(select == 1) {
				insertArticle();
			} else if (select == 2){
				printArticle();
			} else {
				System.out.println("다시 입력하세요. ");
			}
		}
	}
	
	@Override
	public void insertArticle() {
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("답 입력 : ");
		String dap = scan.next();
		ExaminationDTO dto = new ExaminationDTO(name, dap); //생성자를 통해서 name, dap 전달
		list.add(dto); //list에 데이터형이 ExaminationDTO인 객체 dto 추가
		System.out.println("입력되었습니다.");
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
	이름		1 2 3 4 5	점수
	홍길동	O X O X X	40
	코난		O O O O O	100
	또치		O X X X X	20
	*/
	@Override
	public void printArticle() {
		System.out.println("이름\t1 2 3 4 5\t점수");
		
		for(int i=0; i<list.size(); i++) { //list 담겨있는 갯수만큼 출력
			System.out.print(list.get(i).getName()+"\t"); //이름
			for(int j=0; j<list.get(i).getOx().length; j++) { //OX 여부 1~5까지 반복출력
				System.out.print(list.get(i).getOx()[j]+" "); //ox[0] ~ ox[4]
			}
			System.out.println("\t"+list.get(i).getScore()); //점수 출력
		}
	}
}



//부모=자식
//List<ExaminationDTO> list = new ArrayList<ExaminationDTO>();
//List는 인터페이스
