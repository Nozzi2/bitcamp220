package array_1;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// 2진수 변환 프로그램
		
		
		// 배열에 하나씩 입력하고 꺼꾸로 출력이 되야함. 
		Scanner sc = new Scanner(System.in);
		int input;
		
		while(true) {
			int[] binary = new int[32];
			input=0;
			do {
				System.out.print("10진수 입력 : ");
				input = sc.nextInt();
			} while(input <0);// -> 이부분은 continue로 바꿀 수 있음
			if(input ==0) break;
			
			int maxIdx=0;
			/*
			int a=0;
			while(input !=0) {
				binary[a] = input%2;
				a++;
				input = input/2;
			}*/
			
			for(int i = 0; input!=0;i++) {
				binary[i]=input%2;
				input = input/2;
			}
			
			
			for(int i = binary.length-1; i>=0; i--) {
				if(binary[i]==1) {
					maxIdx=i;
					break;
				}
			}
						
			for(int i = maxIdx; i>=0; i--) {
				System.out.print(binary[i]);
				if((i)%4==0) {
					System.out.print(" ");
				}
			}
			System.out.println("\n");
		}
		System.out.println("프로그램을 종료합니다");
	}

}

/*
10진수를 입력하여 2진수로 변환하시오
- 0이 입력되면 프로그램을 종료하시오
- 음수가 입력되면 재입력하시오
- 4개씩 끊어서 보여주기
- Integer.toBinaryString() 사용 X

10진수 입력 : -5

10진수 입력 : 12
1100

10진수 입력 : 250
1111 1010

10진수 입력 : -8

10진수 입력 : 0
프로그램을 종료합니다
*/