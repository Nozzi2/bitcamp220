package constructor;

public class VarArgs {
	public int sum(int...ar) { //입력되는 매개변수의 갯수에 맞게 배열이 생성된다.
		int hap=0;
		for(int i=0; i<ar.length; i++) {
			hap += ar[i];
		}
		return hap;
	}
	
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println("합 = "+va.sum(1, 2));
		System.out.println("합 = "+va.sum(1, 2, 3));
		System.out.println("합 = "+va.sum(1, 2, 3, 4));
	}
}
