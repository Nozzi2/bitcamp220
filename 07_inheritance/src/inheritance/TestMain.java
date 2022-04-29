package inheritance;

class Test /*extends Object*/{ // 생략되어있음
	int a,b;
	//접근제한자 자리에 아무것도 없으면 default로 본다.
	//default는 같은 패키지에서 모두 사용이 가능하다.
	
	@Override
	public String toString() { //Object클래스에서 메소드를 Override하는 것임
		return "Have a nice day~~";
	}
	
}

//------------------------------------
public class TestMain {

	public static void main(String[] args) {
		Test aa = new Test();
		System.out.println("객체 aa = "+aa);
		
		Test bb = aa;
		
		aa.a=2;
		aa.b=5;
		System.out.println(aa.a+"\t"+aa.b); // 2  5
		System.out.println(bb.a+"\t"+bb.b); // 2  5
		//aa가 가르키고 있는 객체의 값을 바꿔줬고, bb는 aa 객체의 주소값을 받는다.
		
		
		bb.a=7;
		bb.b=9;
		System.out.println(aa.a+"\t"+aa.b); // 7  9
		System.out.println(bb.a+"\t"+bb.b); // 7  9
		
		bb = new Test();
		bb.a=10;
		bb.b=20;
		System.out.println(aa.a+"\t"+aa.b); // 7  9
		System.out.println(bb.a+"\t"+bb.b); // 10  20
	}
}