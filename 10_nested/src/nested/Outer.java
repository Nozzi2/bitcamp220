package nested;

public class Outer {
	private String name;
	
	public void output() {
		System.out.println("이름 : "+name);
		//System.out.println("나이 : "+age);  age는 익명 내부클래스의 변수임. 접근X
		
		Inner in = new Inner();
		System.out.println("나이 : "+in.age); //age가 private인데도 접근이 가능함
		//원래 외부의 클래스에서 private 변수를 반환받기 위해서는 getter로 반환받아야함.
		
	}
	
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("이름 : "+name); //Outer클래스의 변수이지만 접근이 가능함
			//Outer.this.name인데 생략되어 name으로 작성됨
			System.out.println("나이 : "+age);
			
		}
	}//class Inner
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer ou = new Outer();
		
		ou.name = "홍길동";
		System.out.println("이름 = " + ou.name);
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 25;
		in2.disp();
		
		Outer.Inner in3 = ou.new Inner();
		//in3.name = "코난"; //Innner 클래스 안에서만 쓸 수 있는거임
		in3.age = 30;
		in3.disp();
		
		Outer.Inner in4 = new Outer().new Inner();
		in4.age=35; //Outer를 통해서 age로 접근할 수 없음. 
		in4.disp(); //name = null 출력됨
	}
}
