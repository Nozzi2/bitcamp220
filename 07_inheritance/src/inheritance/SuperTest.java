package inheritance;

public class SuperTest {
	protected double weight, height;

	public SuperTest(double weight, double height) {
		System.out.println("SuperTest 생성자");
		this.weight = weight;
		this.height = height;
	}
	
	public SuperTest() {
		System.out.println("SuperTest 기본 생성자");
	}
	
	public void disp() {
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}

}
