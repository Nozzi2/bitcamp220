package _for;

import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int answer;
		int correct = 0;
		boolean re = true;
		for(int i = 0; i<5; i++) {
			num1 = (int)(Math.random() * (99-10+1))+10;
			num2 = (int)(Math.random() * (99-10+1))+10;
			
			System.out.print("["+(i+1)+"] "+num1+" + "+num2+" = ");
			while(true) {
				answer = sc.nextInt();
				if(num1+num2 == answer) {
					System.out.println("딩동뎅...참 잘했어요");
					correct++;
					break;
				} else {
					if(!re) {
						System.out.print("틀렸습니다.\n");
						System.out.print("정답은 "+(num1+num2)+"입니다.\n");
						break;
					}
					System.out.print("틀렸으니 다시 입력해보세요. ");
					re = false;
				}
			}
			re=true;
			
		}
		
		System.out.println("\n당신의 총 5문제 중에서 "+correct+"문제 맞추어서 "+(correct*20)+"점 입니다.");
	}

}


/*
[문제] 덧셈의 결과를 맞추는 게임
조건1 : 10~99사이의 난수 2개 발생한다.
조건2 : 문제는 5문제 제공한다.
조건3 : 한 문제당 20점으로 계산해서 마지막에 점수를 출력한다.
조건4 : 틀리면 1번의 기회를 더 준다. (다중for문 이용)

[입력]
52
11
...
50

[실행결과]
[1] 25 + 36 = 52					//25, 36은 난수이다.
틀렸당
[1] 25 + 36 = 25				
틀렸당

[2] 10 + 1 = 88						
틀렸당
[2] 10 + 1 = 11						
딩동뎅...참 잘했어요

...

[5] 25 + 25 = 50
딩동뎅...참 잘했어요

당신의 총 5문제 중에서 x문제 맞추어서 **점 입니다.
*/