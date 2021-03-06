package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SungJukService {
	private ArrayList<SungJukDTO> list; //이 문장을 고치지 마세요.
	Scanner scan = new Scanner(System.in);
	boolean init = true;
	
	public void menu() {
		int select;
		boolean reInput=false; //1~6 이외의 수일 때 메뉴 출력 X
		
		while(true) {
			if(!reInput) { //1~6 이외의 숫자를 입력했는지?
				System.out.println("*****************");
				System.out.println("     1. 입력");
				System.out.println("     2. 출력");
				System.out.println("     3. 검색");
				System.out.println("     4. 삭제");
				System.out.println("     5. 몰?루");
				System.out.println("     6. 끝");
				System.out.println("*****************");
			}//if
			System.out.print("     번호 : ");
			select = scan.nextInt();
			scan.nextLine();
			
			if(select == 1) { //입력
				insertArticle();
			} else if(select == 2) { //출력
				printArticle();
			} else if(select == 3) { //검색
				searchArticle();
			} else if(select == 4) { //삭제
				deleteArticle();
			} else if(select == 5) { //정렬
				sortArticle();
			} else if(select == 6) { //끝
				break;
			} else {
				System.out.println("1~6중에 선택하세요");
				reInput = true;
				continue;
			}
			reInput = false;
		}//while
	}//menu()
	
	/*
	menu()
*****************
   1. 입력
   2. 출력
   3. 검색
   4. 삭제
   
   6. 끝
*****************
   번호 : 8
1~6중에 선택하세요
	*/
	public void insertArticle() {
		if(init) {
			list = new ArrayList<SungJukDTO>();
			init = false;
		}//if
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
		list.add(new SungJukDTO(no,name,kor,eng,math));
		System.out.println("\n데이터를 저장했습니다.\n");
	}//insertArticle()
	
	//번호      이름      국어      영어      수학      총점      평균
	public void printArticle() {
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i).getNo()+"\t");
			System.out.print(list.get(i).getName()+"\t");
			System.out.print(list.get(i).getKor()+"\t");
			System.out.print(list.get(i).getEng()+"\t");
			System.out.print(list.get(i).getMath()+"\t");
			System.out.print(list.get(i).getTotal()+"\t");
			System.out.println(list.get(i).getAvg());
		}//for i
		System.out.println();
	}//printArticle()
	
	
	
	/*
	검색 할 이름 입력 : 코난
	찾고자 하는 이름이 없습니다
	
	검색 할 이름 입력 : 홍길동
	번호      이름      국어      영어      수학      총점      평균
	15      홍길동   90      92      91      xxx      xx.xx
	16      홍길동   89      45      78      xxx      xx.xx
	*/
	public void searchArticle() {
		System.out.print("검색 할 이름 입력 : ");
		String name = scan.nextLine();
		boolean category = true; // 처음만 항목 출력, 항목출력 없을 시 데이터 없음
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				if(category) {
					System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
					category = false;
				}//if
				System.out.print(list.get(i).getNo()+"\t");
				System.out.print(list.get(i).getName()+"\t");
				System.out.print(list.get(i).getKor()+"\t");
				System.out.print(list.get(i).getEng()+"\t");
				System.out.print(list.get(i).getMath()+"\t");
				System.out.print(list.get(i).getTotal()+"\t");
				System.out.println(list.get(i).getAvg());
			}//if
		}//for i
		if(category) {
			System.out.println("찾고자 하는 이름이 없습니다.");
		}//if
		System.out.println();
	}//searchArticle()
	/*
	삭제 할 이름 입력 : 홍길동

	데이터를 2건 삭제하였습니다.
	*/
	public void deleteArticle() {
		System.out.print("삭제 할 이름 입력 : ");
		String name = scan.nextLine();
		boolean category = true; //한번이라도 삭제했는지?
		int cnt=0; //데이터 삭제건수 카운팅
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				category = false;
				cnt++;
				list.remove(i); //요소 삭제
				i--;
			}//if
		}//for i
		if(category) {
			System.out.println("삭제하고자 하는 이름이 없습니다.");
		} else {
			System.out.println("데이터를 "+cnt+"건 삭제하였습니다.");
		}//if
		System.out.println();
	}//deleteArticle()
	
	private void sortArticle() {
		
		System.out.println("1. 이름으로 오른차순");
		System.out.println("2. 총점으로 내림차순");
		System.out.println("3. 이전메뉴");
		int select = scan.nextInt();
		scan.nextLine();
		
		
		if(select == 1) { //이름으로 오른차순
			Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
				@Override
				public int compare(SungJukDTO p1, SungJukDTO p2) {
					//오름차순
					return p1.getName().compareTo(p2.getName());
					
					//내림차순
					//return p1.getName().compareTo(p2.getName()) * -1 ;
				}
			};
			Collections.sort(list, com);
		} else if(select == 2) { //총점기준 내림차순
			Collections.sort(list); //DTO에 구현되어있음
		} else if(select == 3) {
			return;
		}
		
	}//sortArticle()
	
	/*
		System.out.println("다른 기준으로 정렬 - 이름");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
				//오름차순
				//return p1.getName().compareTo(p2.getName());
				
				//내림차순
				return p1.getName().compareTo(p2.getName()) * -1 ;
			}
		};
		
		System.out.println("정렬 전 = "+list);
		Collections.sort(list, com);
		System.out.println("정렬 후 = "+list);
	 */
}
