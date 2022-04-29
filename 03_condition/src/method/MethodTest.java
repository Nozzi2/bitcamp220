package method;

public class MethodTest {
	public static void main(String[] args) {
		output(); //static O > 호출 O
		MethodTest.output(); //static O > 호출 O
		
		MethodTest mt = new MethodTest(); // 객체 생성
		System.out.println("mt = "+mt); //객체의 메모리 주소 출력
		mt.disp(); //static X > 호출 X .   static X > 객체 생성 후 호출 O 
	}

	public void disp() {
		System.out.println("non-static method");
	}
	
	public static void output() {
		System.out.println("static method");
	}
}

//main 글자를 수정하면 문법에 오류는 없지만, main이 없기 때문에 구현한 부분이 실행되지 않는다.
