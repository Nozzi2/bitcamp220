package operator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompTest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader
		           (new InputStreamReader(System.in));
		System.out.print("a의 값 입력 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("b의 값 입력 : ");
		int num2 = Integer.parseInt(br.readLine());
		
		int max = num1 > num2 ? num1 : num2;
		System.out.print("큰 값 = ");
		System.out.println(max);
	}

}


/* 
[문제] 데이터 2개를 입력 받아서 큰 값을 출력하시오.

 [실행결과]
 a의 값 입력 : 25
 b의 값 입력 : 78
 큰 값 = 78
*/
