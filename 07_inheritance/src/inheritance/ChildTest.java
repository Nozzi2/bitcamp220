package inheritance;

public class ChildTest extends SuperTest {
	private String name;
	private int age;
	
	public ChildTest( String name, int age, double weight, double height) {
		System.out.println("ChildTest 생성자");
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	public void disp() { //부모클래스와 메소드가 같지만 에러가 뜨진 않음. 
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		super.disp(); //부모로부터 상속 받았기 때문에 사용 가능함.
	}
	
	public static void main(String[] args) {
		ChildTest aa = new ChildTest("홍길동", 25, 72.8, 183.6);
		aa.disp(); //자식클래스의 disp()가 우선적으로 호출된다.
		
		System.out.println("--------------------------");
		
		SuperTest bb = new ChildTest("코난",13,52.3,162.5); // 다형성
		bb.disp();
	}
	

}
