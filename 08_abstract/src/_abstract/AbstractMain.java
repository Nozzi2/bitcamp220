package _abstract;

public class AbstractMain extends AbstractTest{
	@Override
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest(); 추상클래스로 객체 생성하는 것이므로 에러발생
		AbstractTest at = new AbstractMain(); //부모=자식 > 다형성
		
		at.setName("홍길동");
		System.out.println(at.getName());
	}
}



/*
생성
- 추상클래스는 new할 수 없다.
- 추상클래스를 생성하려면 1. 상속, 2. 메소드, 3. 익명 Inner class
- 반드시 추상메소드를 재구현(override) 해줘야한다. 

*/