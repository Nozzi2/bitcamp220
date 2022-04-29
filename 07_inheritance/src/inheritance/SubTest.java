package inheritance;

public class SubTest extends SuperTest{ //자식클래스
	private String name;
	private int age;
	
	public SubTest( String name, int age, double weight, double height) {
		//부모 생성자 호출
		super(weight, height);
		System.out.println("Sub 생성자");
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}

	public void output() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		//System.out.println("몸무게 = " + weight); 부모클래스에 있음
		//System.out.println("키 = " + height);    부모클래스에 있음  >> 부모클래스의 disp()를 사용하면 됨. 
		this.disp(); //부모로부터 상속 받았기 때문에 사용 가능함.
	}
	
	
	public static void main(String[] args) {
		//Sub class를 생성하면 나와 내 부모를 같이 생성한다. => 생성자 2번 호출된다.
		SubTest aa = new SubTest("홍길동", 25, 72.8, 183.6); // 1:1 관계, 결합도 100%
		aa.output();
		System.out.println("------------");
		aa.disp(); //상속받았기 때문에 부모클래스의 메소드 사용 가능함
		System.out.println();
		
		SuperTest bb = new SubTest("코난",13,52.3,162.5); // 다형성. 결합도 낮추기
		//모든 부모클래스는 자식클래스를 참조할 수 있다.
		//부모클래스로 데이터형을 설정해도 객체생성을 자녀클래스로 생성할 수 있다.
		// 부모 = 자식 (가능!!) 이런 특징을 다형성이라고 함
		
		//bb.output(); //에러 발생함
		//좋은 예시가 뭐가 있을까.......
		//고민좀 해보자
		
		bb.disp();
		
		
	}
}
