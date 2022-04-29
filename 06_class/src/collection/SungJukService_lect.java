package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukService_lect {
	private ArrayList<SungJukDTO> list; //이 문장을 고치지 마세요.
	private Scanner scan = new Scanner(System.in);
	
	public SungJukService_lect() {
		list = new ArrayList<SungJukDTO>();
	}
	
	public void menu() {
		int num;
		
		while(true) {
			System.out.println("*****************");
			System.out.println("     1. 입력");
			System.out.println("     2. 출력");
			System.out.println("     3. 검색");
			System.out.println("     4. 삭제");
			System.out.println("     5. 정렬(소트)");
			System.out.println("     6. 끝");
			System.out.println("*****************");
			System.out.print("     번호 : ");
			num = scan.nextInt();
			if(num==6) break;
			if(num<1 || num>6) { //이렇게 하는 방법도 있음
				System.out.println("1~6중에 선택하세요");
				continue;
			} //if
			if(num == 1) insertArticle();
			else if(num == 2) printArticle();
			else if(num == 3) searchArticle();
			else if(num == 4) deleteArticle();
			else if(num == 5) sortArticle();
		} //while
	}


	public void insertArticle() {
		System.out.print("번호 입력 :");
		int no = scan.nextInt();
		scan.nextLine();
		System.out.print("이름 입력 :");
		String name = scan.nextLine();
		System.out.print("국어 입력 :");
		int kor = scan.nextInt();
		System.out.print("영어 입력 :");
		int eng = scan.nextInt();
		System.out.print("수학 입력 :");
		int math = scan.nextInt();
		
		SungJukDTO dto = new SungJukDTO(no, name, kor, eng, math);
		
		list.add(dto);
		
	}//insertArticle()

	public void printArticle() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		
		for(SungJukDTO dto : list ) {
			System.out.println(dto); //toString 오버라이드해서 출력함
		}
		
	}//printArticle()
	

	public void searchArticle() {
		System.out.println();
		System.out.println("검색할 이름 입력 : ");
		String name = scan.next();
		
		int sw=0;
		
		for(SungJukDTO dto : list) {
			if(dto.getName().equals(name)) {
				if(sw==0) System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(dto); //toString 오버라이드해서 출력함
				sw=1;
			}//if
		}//for
		
		if(sw==0) System.out.println("찾고자 하는 이름이 없습니다.");
	}//searchArticle()
	

	public void deleteArticle() {
		System.out.println();
		System.out.println("검색할 이름 입력 : ");
		String name = scan.next();
		int count=0;
		
		Iterator<SungJukDTO> it = list.iterator(); //꼭 제네릭 해야된다!
		while(it.hasNext()) { //.hasNext() 항목이 있으면 T, 없으면 F    size, length같은거 없음
			SungJukDTO dto = it.next(); //it가 가르키는 항목을 꺼내서 보관하고 it는 다음으로 이동한다.
		
			if(dto.getName().equals(name)) {
				it.remove(); //it가 가리키는 곳의 항목을 지우는게 아!니!라! 방금 꺼낸 dto를 지운다.
				count++;
			}//if
		}//while
		
		if(count ==0) {
			System.out.println("삭제하고자 하는 이름이 없습니다.");
		} else {
			System.out.println("데이터를 "+count+"건 삭제하였습니다.");
		}//if
	}//deleteArticle()

	private void sortArticle() {
		
		while(true) {
			System.out.println();
			System.out.println("1. 이름으로 오름차순");
			System.out.println("2. 총점으로 내림차순");
			System.out.println("3. 이전 메뉴");
			int num = scan.nextInt();
			if(num==3)break;
			if(num==1) {
				Collections.sort(list);
				this.printArticle();
			} else if (num==2) {
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {

					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						//조건연산자
						// 조건 ? 참 : 거짓;
						return s1.getTotal() < s2.getTotal() ? 1 : -1;
						//부등호가 오른쪽을 바라볼때 참일경우 -1이 출력되는 것이 오름차순이다.
						//위의 경우에서는 1을 놨기때문에 내림차순
					}
				};
				
				Collections.sort(list, com);
				this.printArticle();
				
			}
		}//while
		
		
	}
}
