package _if;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int a = sc.nextInt();
		
		if(a>= 50) System.out.println(a+"는 50보다 크거나 같다");
		System.out.println(a+"는 50보다 작다");
	}

}
