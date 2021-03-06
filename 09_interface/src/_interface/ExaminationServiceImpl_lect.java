package _interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExaminationServiceImpl_lect implements ExaminationService{
	private List<ExaminationDTO> list;
	private Scanner scan = new Scanner(System.in);
	
	public ExaminationServiceImpl_lect() {
		list = new ArrayList<ExaminationDTO>(); //생성자를 통해 ArrayList 객체생성
	}
	
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
		
		ExaminationDTO dto = new ExaminationDTO(name,dap);
		list.add(dto);
		
		System.out.println("입력이 완료되었습니다.");
	}

	@Override
	public void printArticle() {
		System.out.println("이름\t1 2 3 4 5   결과");
		
		/*
		//확장 for문 사용		
		for(ExaminationDTO dto : list) {
			System.out.print(dto.getName()+"\t");
			for(int i=0; i<dto.getOx().length; i++) {
				System.out.print(dto.getOx()[i]+" ");
			}//for i
			System.out.println("  "+dto.getScore());
		}//for
		*/
		
		for(ExaminationDTO dto : list) {
			System.out.println(dto);
		}
		
	}//printArticle()

}
