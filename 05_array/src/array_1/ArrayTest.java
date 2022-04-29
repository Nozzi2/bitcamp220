package array_1;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar;
		ar = new int[5];
		System.out.println("배열명 ar = "+ar);
		
		ar[0] = 25;
		ar[1] = 37;
		ar[2] = 12;
		ar[3] = 45;
		ar[4] = 50;
		
		
		for(int i = 0; i<ar.length; i++) {
			System.out.println("ar["+i+"] = " + ar[i]);
		}
		
		System.out.println();
		
		System.out.println("거꾸로 출력");
		
		for(int i = ar.length-1; i>=0; i--) {
			System.out.println("ar["+i+"] = " + ar[i]);
		}
		
		System.out.println("\n짝수만 출력");
		for(int i = 0; i<ar.length; i++) {
			if((ar[i]%2)==0) {
				System.out.println("ar["+i+"] = " + ar[i]);
			}
		}
		
		System.out.println("확장 for");
		for(int data : ar) { //데이터가 다 들어있을 때만 사용한다.
			System.out.println(data);
		}
		
	}

}
