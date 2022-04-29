package variable;

import java.io.IOException;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("데이터 입력 : ");
		int data = System.in.read(); //char형으로 입력 받는것임.
		System.out.print(data);
		
		Scanner sc = new Scanner(System.in); //System.in을 통해서 입력받는 클래스 선언
		System.out.println("정수 입력 : ");
		int a = sc.nextInt();
		System.out.println("실수 입력 : ");
		double b = sc.nextDouble();
		
		System.out.println(a+" + "+b+" = "+(a+b));
		
		System.out.println(a);
		
		
	}

}


/* Exception (예외처리)
 * - 생각지도 않은 에러 발생
 */