package constructor;

class StaticTest {
	//필드
	private int a; //인스턴스 변수 (객체 생성해야만 쓸 수 있음.)
	static int b; //클래스 변수 (클래스 아무곳에서 쓸 수 있음) (=공유 변수)
	
	static { //스태틱 영역
		System.out.println("초기화 영역");
		b=3;
		output();
	}//객체가 생성될때 처음 한번만 호출이 되고,
	//다른객체가 새로 만들어지더라도 한번 호출된 후에는 호출되지 않는다.
	
	public StaticTest() { //생성자가 호출될때 필드가 초기값으로 초기화가 된다.
		System.out.println("StaticTest 기본 생성자");
		this.a = 3;
	}
	
	public void calc() { a++; b++; }
	
	public void disp() {
		System.out.println("a = "+ a +", b = "+ b );
	}
	
	public static void output() { 
		System.out.println("static method...!");
	}//스태틱 메소드 안에는 스태틱 변수밖에 사용할 수 없음.
}


//--------------------------------------------
public class StaticMain {

	public static void main(String[] args) {
		
		StaticTest aa = new StaticTest();
		aa.calc();
		aa.disp(); // a=4, b=4
		System.out.println();
		
		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp(); // a=4, b=5
		System.out.println();
		
		StaticTest cc = new StaticTest();
		cc.calc();
		cc.disp(); // a=4, b=6
		System.out.println();
		
		StaticTest.output();
		aa.output();
	}
}

/* 출력결과
초기화 영역           
static method...!     > 
StaticTest 기본 생성자
a = 4, b = 4

StaticTest 기본 생성자
a = 4, b = 5

StaticTest 기본 생성자
a = 4, b = 6

static method...!
*/