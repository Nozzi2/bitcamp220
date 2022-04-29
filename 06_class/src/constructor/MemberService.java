package constructor;

import java.util.Scanner;

public class MemberService {
	private MemberDTO[] ar = new MemberDTO[5];
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		int input=0;
		
		while(true) {
			System.out.println();
			System.out.println("**************");
			System.out.println("   1. 가입");
			System.out.println("   2. 출력");
			System.out.println("   3. 수정");
			System.out.println("   4. 탈퇴");
			System.out.println("   5. 끝내기");
			System.out.println("**************");
			System.out.print("  번호 : ");
			
			input=sc.nextInt();
			sc.nextLine();
			
			if(input == 1) {
				insertMember();
			} else if(input == 2) {
				list();
			} else if(input == 3) {
				updateMember();
			} else if(input == 4) {
				deleteMember();
			} else if(input == 5) {
				break;
			}//if
		}//while
	}//menu()
	
	
	/*
	1번 가입을 눌렀을 때 처리 - insertMember()
	이름 입력 : 
	나이 입력 :    
	핸드폰 입력 : 
	주소 입력 : 
	
	등록 완료..4자리 남았습니다
	-----------
	만약에 5명이 다 차면 "정원 초과"라고 메세지 띄운다. 
	 */
	public void insertMember() {
		System.out.println();
		String name,phone,address;
		int age;
		int empty=0; 
		
		for(int i=0; i<ar.length;i++) {
			if(ar[i]==null) empty++;
		}
		
		for(int i=0; i<ar.length;i++) {
			if(ar[i]==null) {
				System.out.print("이름 입력 : ");
				name=sc.next();
				System.out.print("나이 입력 : ");
				age=sc.nextInt();
				System.out.print("전화번호 입력 : ");
				phone=sc.next();
				sc.nextLine();
				System.out.print("주소 입력 : ");
				address=sc.nextLine();
				ar[i] = new MemberDTO(name,age,phone,address);
				System.out.println("등록완료. "+(empty-1)+"자리 남았습니다.");
				break;
			} else if(i==4) {
				System.out.println("정원 초과");
			}//if
		}//for i
	}//insertMember()
	
	//총 5명중에서 등록된 회원만 보여준다
	public void list() {
		System.out.println();
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		for(int i=0; i<ar.length;i++) {
			if(ar[i]!=null) {
				System.out.print(ar[i].getName()+"\t");
				System.out.print(ar[i].getAge()+"\t");
				System.out.print(ar[i].getPhone()+"\t");
				System.out.println(ar[i].getAddress());
			}//if
		}//for i
	}//list()
	
	/*
	→ 회원이 없을 때
	핸드폰 번호 입력 : 010-123-1234
	찾고자 하는 회원이 없습니다
	
	-------------------------------
	→ 회원이 있을 때
	핸드폰 번호 입력 : 010-123-1234
	
	이름      나이      핸드폰         주소
	홍길동   25      010-123-1234   서울
	
	수정 할 이름 입력 : 
	수정 할 나이 입력 :    
	수정 할 핸드폰 입력 : 
	수정 할 주소 입력 : 
	
	수정 완료
	 */
	public void updateMember() {
		System.out.print("핸드폰 번호 입력 : ");
		String s=sc.nextLine();
		for(int i=0; i<ar.length; i++) {
			if(ar[i].getPhone().equals(s)) { //입력받은 번호와 같은 경우
				System.out.print("수정 할 이름 입력 : ");
				ar[i].setName(sc.nextLine());
				System.out.print("수정 할 나이 입력 : ");
				ar[i].setAge(sc.nextInt());
				sc.nextLine();
				System.out.print("수정 할 핸드폰 입력 : ");
				ar[i].setPhone(sc.nextLine());
				System.out.print("수정 할 주소 입력 : ");
				ar[i].setAddress(sc.nextLine());
				
				System.out.println("\n수정 완료");
				break;
			} else if(i==ar.length-1) {
				System.out.println("찾고자 하는 회원이 없습니다");
			} //if
		}//for i
	}//updateMember()
	
	
	/*
	4번 삭제를 눌렀을 때 처리 - deleteMember()
	→ 회원이 없을 때
	핸드폰 번호 입력 : 010-123-1234
	찾고자 하는 회원이 없습니다
	
	-------------------------------
	→ 회원이 있을 때
	핸드폰 번호 입력 : 010-123-1234
	
	삭제 완료
	 */
	public void deleteMember() {
		System.out.print("핸드폰 번호 입력 : ");
		String s=sc.nextLine();

		for(int i=0; i<ar.length; i++) {
			if(ar[i].getPhone().equals(s)) { //입력받은 번호와 같은 경우
				ar[i]=null;
				System.out.println("\n삭제 완료");
				break;
			} else if(i==ar.length-1) {
				System.out.println("찾고자 하는 회원이 없습니다");
			} //if
		}//for i
		
	} //deleteMember()

}
