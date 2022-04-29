package array_1;

import java.util.Scanner;

public class ArrayTest3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<3; i++) {
			System.out.print("문자열 입력 : ");
			String s = sc.nextLine();
			
			System.out.print("가운데 문자 = ");
			System.out.println(s.charAt(s.length()/2));
		}
	}
}


/*
[문제] 문자열을 입력받아서 가운데 문자만 출력하시오

[입력]
호랑이
바다코끼리
이구아나

[실행결과]
문자열 입력 : 호랑이
가운데 문자 = 랑

문자열 입력 : 바다코끼리
가운데 문자 = 코

문자열 입력 : 이구아나
가운데 문자 = 아

*/