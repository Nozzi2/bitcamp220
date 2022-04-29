package inheritance;

class Test2 extends Object {
	
}

class Sample {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getClass()+"@개바부";
	}
	
}

public class ObjectMain {

	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println("객체 t = "+t); //클@16진수
		System.out.println("객체 t = "+t.toString());
		System.out.println("객체 t = "+t.hashCode()); //10진수
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = "+s.toString()); //개바부 출력
		System.out.println();
		
		String str = "apple";
		String text = new String("apple");
		System.out.println("객체 str = "+str);
		System.out.println("str == text : " + (str==text)); //주소값이 같은지 비교
		System.out.println("str.equals(text) : " + (str.equals(text))); //주소값에 저장된 문자열 비교
		System.out.println();
		
		Object ob = new Object();
		Object ob2 = new Object();
		
		System.out.println();
		ob = "hello";
		System.out.println(ob);
		ob = Integer.parseInt("100");
		System.out.println(ob);
		System.out.println(ob.toString());
		System.out.println();
		
		
		System.out.println("ob == ob2 : " + (ob==ob2)); //주소값이 같은지 비교
		System.out.println("ob.equals(ob2) : " + (ob.equals(ob2))); //주소값이 같은지 비교
		System.out.println();
	}
}



/*
객체를 반환하면 주소, 문자열을 반환하면 문자열이 나오는 이유
class Object {
	public String toString(){ } //16진수 출력
	public boolean equals(Object ob) { } //주소 비교
}
class String extends Object {
	public String toString(){ } //문자열 출력
	public boolean equals(Object ob) { } //문자열 비교
}
String 클래스에서 오버라이드 해서 다른 기능을 수행하도록 했기때문
*/