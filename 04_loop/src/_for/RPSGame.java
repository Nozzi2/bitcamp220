package _for;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class RPSGame {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		int user;
		int com;
		int coin = 1000;
		int batting = 0;
		//boolean gameOver = false;
		char reGame;
		int set=0;
		
		while(true) {
			set++;
			System.out.print("["+set+"] "+"가위(1), 바위(2), 보(3) 입력 : ");
			user = sc.nextInt();
			com = (int)(Math.random() * (3-1+1))+1;
			
			
			do {
				System.out.println("당신이 보유한 금액은 "+coin+"원 입니다.");
				System.out.print("배팅금액 입력 : ");
				batting = sc.nextInt();
			}while(coin<batting);
			

			System.out.print(".... 결과를 보시려면 Enter를 누르세요 ....");
			System.in.read(); // \r 처리
			System.in.read(); // \n 처리
			
			System.out.print("사용자 : ");
			switch(user) {
			case 1 : System.out.print("가위\t"); break;
			case 2 : System.out.print("바위\t"); break;
			case 3 : System.out.print("보\t"); break;
			}
			
			System.out.print("컴퓨터 : ");
			switch(com) {
			case 1 : System.out.println("가위"); break;
			case 2 : System.out.println("바위"); break;
			case 3 : System.out.println("보"); break;
			}
			
			if(user == com) {
				System.out.println("You Draw.\n");
			} else if((user == 1 && com == 3) ||
					(user == 2 && com == 1) ||
					(user == 3 && com == 2)) {
				System.out.println("You Win!!\n");
				coin = coin+batting;
			} else {
				System.out.println("You Lose...\n");
				coin = coin-batting;
			}
			
			System.out.println("당신의 금액은 "+df.format(coin)+"원입니다.\n");
			if(coin<=0) {
				System.out.print("\n또 할래 (y/n)");
				reGame = (char) System.in.read();
				if(reGame=='n') {
					break;
				} else {
					System.out.print("insert coin : ");
					coin=sc.nextInt();
					System.out.println();
					set=0;
				}
			}
		}
		
		System.out.print("Bye bye~");
		
		
		

	}

}


/*
[문제] 가위, 바위, 보 게임 (while, if문 사용)
-가위 (1), 바위 (2), 보(3) 지정한다.
- 컴퓨터는 1~3 중에 난수 발생
- 난수에 따라서 가위, 바위, 보 로 출력한다.
// - 1게임 당 100원 (첫 입력은 무조건 100원 이상)
- 첫 돈은 1000원 갖고 시작
- 게임이 끝난 돈이 음수이면 다시 게임할거냐고 물어보기 y/n

[실행결과]
가위 (1), 바위 (2), 보(3) 중 번호 입력 : 3
배팅금액 입력 : 200   (현재금액보다 많아도 좋음)
//+ 결과를 보시려면 Enter를 치세요 (선택) (flush응용)
 
컴퓨터 : 바위    나 : 보자기
You Win!!
당신의 금액은 1200원 이다.
 
가위 (1), 바위 (2), 보(3) 중 번호 입력 : 2
배팅금액 입력 : 500
//+ 결과를 보시려면 Enter를 치세요 (선택) (flush응용)
 
컴퓨터 : 보    나 : 바위
You Lose...
당신의 금액은 700원 이다.

가위 (1), 바위 (2), 보(3) 중 번호 입력 : 1
배팅금액 입력 : 500
//+ 결과를 보시려면 Enter를 치세요 (선택) (flush응용)
 
컴퓨터 : 가위    나 : 가위
You Draw.
당신의 금액은 700원 이다.

또 할래 (y/n)

insert coin ? 

*/