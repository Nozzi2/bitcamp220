package _class;

class Person {
	//필드
	private String name; //외부로부터 접근을 막는다. > 캡슐화
	//Person에 있는 메소드를 통해서만 데이터에 접근할 수 있다.
	private int age;
	
	
	//메소드
	public void setName(String n){
		name = n;
	}
	
	public void setAge(int a){
		age = a;
	}
	
	//Overload
	public void setData(String n, int a) { //p3에 활용
		name = n;
		age = a;
	}

	//Overload
	public void setData() { //p4에 활용
	}
	
	
	//출력하기 메소드
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

//-----------------------------------------------------
public class PersonMain {
	public static void main(String[] args) {
		Person p; //p를 객체라고 한다. p는 새로운 방을 만들었고, 그 방의 주솟값이 저장되어있다.
		p = new Person(); //생성
		
		//name = "홍길동"; 에러발생 name은 p의 주소로 가야 있음
		//p.name = "홍길동"; //에러발생 name은 private으로 선언되어있기때문
		//p.age = 25; //에러발생 age은 private으로 선언되어있기때문
		
		p.setName("홍길동"); //호출
		p.setAge(25); //호출

		System.out.println("객체 p = "+p);
		System.out.println(p.getName()+", "+p.getAge());
		
		Person p2 = new Person();
		System.out.println("객체 p2 = "+p2);
		p2.setName("코난");
		p2.setAge(13);
		System.out.println(p2.getName()+", "+p2.getAge());

		Person p3 = new Person();
		System.out.println("객체 p3 = "+p3);
		p3.setData("둘리", 100);
		System.out.println(p3.getName()+", "+p3.getAge());
		
		Person p4 = new Person();
		System.out.println("객체 p4 = "+p4);
		p4.setData();
		System.out.println(p4.getName()+", "+p4.getAge());
		
	}
}
