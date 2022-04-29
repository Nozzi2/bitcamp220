package inheritance;

class AAA {
	protected int a;
	
	protected void abc() {
		System.out.println("a = "+a);
	}
}

class BBB extends AAA{
	protected int b;
	
	protected void abc() {
		System.out.println("a+b = "+(a+b));
	}
}

class CCC extends BBB{
	protected int c;
	
	protected void abc() {
		System.out.println("a+b+c = "+(a+b+c));
	}
}


public class InheritanceTest {
	public static void main(String[] args) {
		AAA aa = new CCC();
		aa.abc();
		System.out.println(aa.a);
		//System.out.println(aa.b); 에러발생
		//System.out.println(aa.c); 에러발생
	}
}
