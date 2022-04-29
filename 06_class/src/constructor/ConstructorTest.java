package constructor;

public class ConstructorTest {
	//필드 선언시 기본값으로 초기화됨
	private String name;
	private int age; 
	
	//앞에 public 있으면 다른 패키지에서도 사용 가능
	//뺴버리면 같은 패키지에서만 사용 가능
	public ConstructorTest() { //기본 생성자
		this("네오"); // Overload된 다른 생성자를 호출한다. 단, 생성자의 맨 첫줄에 호출해야한다.
	}
	
	public ConstructorTest(String name) { //기본 생성자
		this.name = name;
	}
	
	public ConstructorTest(int age) { //기본 생성자
		this.age = age;
		System.out.println("Overload 생성자 age 입력");
		System.out.println("this   = "+this);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	

}
