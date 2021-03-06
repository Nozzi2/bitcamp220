package constructor;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple"; //literal 생성
		String b = "apple";
		
		if(a==b) System.out.println("a와 b의 참조 값은 같다"); //같은 주소값을 참조한다.
		else System.out.println("a와 b의 참조 값은 다아아르다");
		
		if(a.equals(b)) System.out.println("a와 b의 문자열은 같다");
		else System.out.println("a와 b의 문자열은 다아아르다");
		
		
		
		String c = new String("apple");
		String d = new String("apple");
		
		if(c==d) System.out.println("c와 d의 참조 값은 같다");
		else System.out.println("c와 d의 참조 값은 다아아르다"); //다음은 다르게 나옴
		
		if(c.equals(d)) System.out.println("c와 d의 문자열은 같다");
		else System.out.println("c와 d의 문자열은 다아아르다");
		
		//String e = "오늘 날짜는 "+2022+4+22;
		/*
		문자열은 편집이 안되므로 메모리 4번 생성된다
		JVM에 의해서 삭제 시 Garbage Collector로 보낸다
		Garbage Collector가 실행(휴지통 비우기)되면 컴퓨터는 멈춘다

		"오늘 날짜는 "
		"오늘 날짜는 2022"
		"오늘 날짜는 20224"
		e ---> "오늘 날짜는 2022422" 
		
		=> 불필요한 메모리 할당, 삭제가 일어난다. 비효율 적인 구현
		*/ 
		String e = "오늘 날짜는 "+2022+4+22;	
		System.out.println(e.charAt(0));
		System.out.println(e.charAt(1));
		System.out.println(e.charAt(13));
		
		System.out.println("부분 문자열 추출 : "+e.substring(7));
		System.out.println("부분 문자열 추출 : "+e.substring(7,11)); //index 7~11 이전까지 즉, 7,8,9,10
		
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("소문자 변경 = " + "Hello".toLowerCase());
		
		
		System.out.println("문자열 검색 = "+e.indexOf("짜"));//4
		System.out.println("문자열 검색 = "+e.indexOf("날짜"));//3
		System.out.println("문자열 검색 = "+e.indexOf("개바봉"));//-1
		System.out.println("문자열 검색 = "+e.indexOf("2"));//7
		System.out.println("문자열 검색 = "+e.indexOf("2",0));// "2"라는 문자열을 0부터 찾고, 처음 찾은 인덱스를 반환하라
		System.out.println("문자열 검색 = "+e.indexOf("2",8));// "2"라는 문자열을 8부터 찾고, 처음 찾은 인덱스를 반환하라
		
		System.out.println("문자열 치환 = "+e.replace("날짜", "일자")); //"날짜"라는 문자열을 "일자"로 치환
		

	}

}





