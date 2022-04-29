package constructor;

public class ConstructorMain {

	public static void main(String[] args) {
		ConstructorTest aa = new ConstructorTest(); //기본 생성자 사용
		System.out.println("객체 aa = "+aa);
		System.out.println(aa.getName()+", "+aa.getAge());
		System.out.println();
		
		ConstructorTest bb = new ConstructorTest("홍길동"); // Overload한 생성자 사용함.
		System.out.println("객체 bb = "+bb);
		System.out.println(bb.getName()+", "+bb.getAge());
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(25); // Overload한 생성자 사용함.
		System.out.println("객체 cc = "+cc);
		System.out.println(cc.getName()+", "+cc.getAge());
		System.out.println();
	}

}
