package method;

public class MethodTest2 {
	int a; //필드

	public static void main(String[] args) {
		int a; //지역변수
		
		MethodTest2 mt = new MethodTest2();
		System.out.println("합 = "+mt.sum(25,36));
		System.out.println("차 = "+mt.sub(25,36));
		System.out.println("곱 = "+mt.mul(25,36));
		System.out.println("몫 = "+mt.div(25,36));

	}
	
	//public 반환값데이터형 함수명(매개변수1, 매개변수2, ...)
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public double div(int a, int b) { //여기 둘다 입력값에 맞게 파라미터를 정수형으로 맞춰주는게 좋음
		return (double)a/b;
	}

}
