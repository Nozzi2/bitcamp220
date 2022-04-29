package array_1;

import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = ""; //첫 시작에만 입력받기 위한 변수
		boolean start = true; //첫 시작에만 물어보기 위한 불린 변수
		int input;
		int cnt=0;
		int[] user = new int[3];
		int[] com = new int[3];
		
		//게임을 시작할지 묻는 부분
		while(true) {
			System.out.println("게임을 실행하시겠습니까? (Y/N) : ");
			str = sc.nextLine();
			if(str.charAt(0) == 'n' || str.charAt(0) == 'N') {
				start = false;
				break;
			} else if(str.charAt(0) == 'y' || str.charAt(0) == 'Y'){
				start = true;
				break;
			}
		}
		
		
		// com 난수 입력
		for(int i = 0; i<com.length;i++) {
			com[i] = (int)(Math.random() * (9-1+1))+1;
			
			//중복체크
			for(int j=0; j<i;j++) {
				if(com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		
		while(start) { //start가 true면 무한 반복해야함
			System.out.print("숫자입력 : ");
			input = sc.nextInt();
			
			// user 사용자 입력
			for(int i=0; i<user.length; i++) {
				user[i] = input%10;
				input = input/10;
				for(int j=0; j<i;j++) {
					if(user[i] == user[j]) { //중복일 경우 다시 입력
						i=-1;
						System.out.println("숫자가 중복되었습니다. 다시 입력해주세요.");
						System.out.print("숫자입력 : ");
						input = sc.nextInt();
						break;
					}
				}
			}
			
			
			cnt++;
			int strike = 0;
			int ball = 0;
			
			//스트라이크 알아보기
			for(int i = 0; i<com.length;i++) {
				if(com[i]==user[i]) strike++;
			}
			
			//볼 알아보기
			for(int i=0; i<com.length;i++) {
				for(int j=0; j<user.length;j++) {
					if(i!=j) {
						if(com[i]==user[j]) {
							ball++;
							//System.out.println((i+1)+" : "+com[i]+", "+user[i]+(i+1)+" : ");
						}
					}
				}
			}
			
			
			//출력
			System.out.println(strike+"S   "+ball+"B");
			
			/* 확인용 출력
			for(int i = com.length-1; i>=0;i--) {
				System.out.println("com : "+com[i] +", user : "+user[i]);
			}*/
			
			// 3 스트라이크면 게임을 끝내야함
			if(strike==3) {
				break;
			}
		}
		
		if(start) { //첫 입력이 N이라면 false, 아니면 true
			System.out.println("축하합니다. "+cnt+"번 만에 맞추셨습니다!");
		} else {
			System.out.println("게임을 종료합니다.");
		}
	}
}

/*
[문제] 야구 게임 - 숫자 맞추기 게임 (3개)
- 크기가 3인 정수형 배열을 잡고 1~9 사이의 난수를 발생한다.
- 난수는 중복을 허용하지 않는다.
- 스트라이크는 숫자가 같은 자릿수일 경우, 볼은 같은 숫자가 있지만 다른 자릿수일 경우 
- 3스트라이크일 경우 게임을 끝내고 몇번의 시도가 있었는지 출력한다.
- for, while, if 세개만 사용하면 됨.

[입력1]
w
q
n

[실행결과1]
게임을 실행하시겠습니까? (Y/N) : w
게임을 실행하시겠습니까? (Y/N) : q
게임을 실행하시겠습니까? (Y/N) : n

게임을 종료합니다.


[입력2]
y
123
182
...
428

[실행결과2]
게임을 실행하시겠습니까? (Y/N) : y

게임을 시작합니다.

숫자입력 : 123
1스트라이크 0볼

숫자입력 : 182
0스트라이크 2볼

...

숫자입력 : 428
3스트라이크 0볼

축하합니다. xx번 만에 맞추셨습니다!
*/