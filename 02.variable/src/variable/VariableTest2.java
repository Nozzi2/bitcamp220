package variable;

public class VariableTest2 {
	//필드
	int a;
	static int b; //static : 이미 메모리에 있기 때문에 메인함수에서 b=0이라고 쓸 수 있다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10; //지역변수
		System.out.println("지역변수 a = "+a);
	
		//int a=0; 지역변수는 같은 변수로 선언할 수 없다.
		
		VariableTest2 vt = new VariableTest2();
		
		System.out.println("전역변수 b = "+b);
		System.out.println("전역변수 b = "+vt.b);
		System.out.println("전역변수 b = "+VariableTest2.b);
		System.out.println("전역변수 a = "+vt.a);
		//System.out.println("전역변수 a = "+VariableTest2.a); 에러 발생. static이 아니라서 쓸 수 없음.

	}

}


/* 
 * 변수
 * - local variable (지역변수)
 *  - 메소드 단위
 *  - 쓰레기값 존재, 반드시 초기화해야 한다.
 *  
 * - 필드 (전역변수)
 *  - 이미 초기화 되어 있다.
 */
