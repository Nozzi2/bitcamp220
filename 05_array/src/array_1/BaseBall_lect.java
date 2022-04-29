package array_1;

import java.io.IOException;

//강사님이 구현한 코드
public class BaseBall_lect {

	public static void main(String[] args) throws IOException{
		int[] com = new int[3];
		int[] user = new int[3];
		int yn;
		int strike;
		int ball;
		int cnt=0;
		
		//게임시작할지 묻기 Y,y,N,n일 경우에만 벗어남
		do {
			System.out.println("게임을 실행하시겠습니까? (Y/N) : ");
			yn = System.in.read();
			System.in.read();
			System.in.read();
			System.out.println((char)yn);
		} while (yn!='Y' && yn != 'y' &&  yn != 'N' && yn !='n' );
		
		//게임 시작할
		if(yn=='Y' || yn=='y' ) {
			System.out.println("\n게임을 시작합니다.");
			
			//com 난수발생
			for(int i=0; i<com.length;i++) {
				com[i] = (int)(Math.random() * (9-1+1))+1;
				
				//중복체크
				for(int j=0; j<i; j++) {
					if(com[i]==com[j]) { //중복이 있다면
						i--; //방금 동작했던 for문을 다시 동작하기 위해 1을 빼준다.
						System.out.print("중복발생! ");
						break;
					} //if
				} //for j
				
				System.out.println(com[i]);
			} // for i
			
			//발생한 숫자 맞추기
			while(true) {
				//user 숫자 입력
				System.out.println("숫자 입력 : ");
				for(int i=0; i<user.length; i++) {
					user[i] = System.in.read()-'0'; //문자가 각각 입력되어 아스키코드값이 저장되기 때문에 -'0'(-48)을 해줘야함.
				}
				System.in.read(); //flush
				System.in.read();
				cnt++;
				//비교
				/* 2중 for문 사용해야함
				com[0] == user[0]	com[1] == user[0]		com[1] == user[0]	
						  user[1]			  user[1]			      user[1]
				  		  user[2]			  user[2]			      user[2]	
				 */
				strike = 0;
				ball = 0;
				for(int i=0; i<com.length;i++) {
					for(int j=0; j<user.length;j++) {
						if(com[i]==user[j]) { //배열에 같은 값이 있는지?
							if(i==j) { //같은 값이 같은 자리에 있는지?
								strike++;
							} else {
								ball++;
							}
						}
					}
				}
				
				//마무리
				System.out.println(strike+"S   "+ball+"B");
				if(strike==3) { //3S면 게임을 끝내야함.
					System.out.println("축하합니다. "+cnt+"번 만에 맞추셨습니다!");
					break;
				}
			}
			
		} else {
			System.out.println("프로그램을 종료합니다.");
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