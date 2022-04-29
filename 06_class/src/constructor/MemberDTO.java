package constructor;

public class MemberDTO {
	//필드 잡기
	private String name, address, phone;
	private int age;
	
	//생성자 잡기
	public MemberDTO(String name, int age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
		
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}


	//getter
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	
}


/*
/*
[문제] 회원관리 프로그램
클럽의 회원관리 프로그램 작성하려고 한다.
여기는 코로나로 인한 폐쇄적인 모임으로 회원은 총 5명으로 한다. (객체배열)
회원의 정보는 이름(name), 나이(age), 핸드폰(콜), 주소(address)로 설정한다.
회원 가입, 출력, 수정, 탈퇴 프로그램을 작성하시오.

menu()
*************
   1. 가입
   2. 출력
   3. 수정
   4. 탈퇴
   5. 끝내기
*************
  번호 : 
  
  
1번 가입을 눌렀을 때 처리 - insertMember()
이름 입력 : 
나이 입력 :    
핸드폰 입력 : 
주소 입력 : 

등록 완료..4자리 남았습니다
-----------
만약에 5명이 다 차면 "정원 초과"라고 메세지 띄운다.  


2번 출력을 눌렀을 때 처리 - list()
→ 총 5명중에서 등록된 회원만 보여준다

이름      나이      핸드폰      주소


3번 수정을 눌렀을 때 처리 - updateMember()
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


4번 삭제를 눌렀을 때 처리 - deleteMember()
→ 회원이 없을 때
핸드폰 번호 입력 : 010-123-1234
찾고자 하는 회원이 없습니다

-------------------------------
→ 회원이 있을 때
핸드폰 번호 입력 : 010-123-1234

삭제 완료
*/


/* 입력 샘플
1
노정환
20
010-2864-6425
인천 서구 가정동
1
이창근
19
010-2222-2222
서울 강남구
1
홍길동
90
011-999-9999
조선 한양
1
오연의
27
010-5555-5555
지하철 3호선 라인 역세권 짱짱 아파트
1
어피치
8
010-1111-1111
카카오톡 이모티콘샵

 @@@@ 수정할거 @@@@
강수정
24
010-0000-0000
수정나라 수정도 수정시

*/