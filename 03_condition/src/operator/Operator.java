package operator;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = 25 > 36;
		System.out.println("a = "+a);
		System.out.println("!a = "+!a);

		//원래 클래스는 앞글자가 대문자임.
		//그리고 new 이런식으로 선언해야하지만 오직! String만 저렇게 선언가능
		//이걸 리터럴 생성이라고 함.
		String c = new String("apple");
		String b = "apple"; //리터럴 생성
		
		//주소를 비교한다. 
		//같은 문자열이라도 주소가 다르다
		System.out.println(b == c? "같다":"다르다");
		
		//내용물을 비교한다.
		//.equals는 안의 내용물을 비교하여 반환
		System.out.println(b.equals(c)? "같다":"다르다");
	}

}


/*
literal
1. 문자 literal - 'A', 't' ...
2. 정수 literal - 25, -100 ...
3. 실수 literal - 35.6, -78.3 ...
4. 문자열 literal - "car", "Apple" ...  
 
 */
