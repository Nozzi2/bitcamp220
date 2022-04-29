package method;

import java.util.Arrays;
import java.util.Random;

public class MethodTest3 {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		System.out.println("절대값 = " + Math.abs(-25) );
		System.out.println("최솟값 = " + Math.min(12.3, 36.5) );
		System.out.println("난수 Math = " + Math.random() ); //에러 없음
		System.out.println("난수 Random = " + rnd.nextDouble() ); //에러 없음
		
		
		//배열
		int[] ar = new int[5];
		ar[0] = 25;
		ar[1] = 12;
		ar[2] = 35;
		ar[3] = 78;
		ar[4] = 30;
		
		int[] ar1 = {25, 12, 35, 78, 30};
		
		//소트(정렬) - 오름차순
		Arrays.sort(ar);
		System.out.println(ar[0]+", "+ar[1]+", "+ar[2]+", "+ar[3]+", "+ar[4]);
	}

}



/*
abs(-25) > 자신이 속해 있는 클래스에서 메소드를 찾는다.
Math.abs(12.3, 36.5) > Math에서 찾아야함. 매개변수에 맞는 자료형을 찾아서 반환함.
						매개변수가 double형이기 때문에 반환값도 double임

 
 */
