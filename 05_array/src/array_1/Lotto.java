package array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];
		int randomAtoB;
		Scanner sc = new Scanner(System.in);
		System.out.print("1000원 단위로 입력하세요 : ");
		int money = sc.nextInt();
		
		for(int x=0; x<money/1000; x++) {
			for(int i=0; i<lotto.length;i++) {
				randomAtoB = (int)(Math.random() * (45-1+1))+1;
				lotto[i] = randomAtoB;
				for(int j=1; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--; //여기서 --해주기 때문에 다시 반복하게 된다!!!!!!
						break;
					}
				}
			}
			
			Arrays.sort(lotto); //static으로 구현되어있기때문에 인스턴스화 시키지 않아도 됨.
			
			for(int i=0; i<lotto.length; i++) {
				System.out.print(String.format("%3d", lotto[i])); 
			}
			System.out.println();
			
			if((x+1)%5==0) {
				System.out.println();
			}
		}
	}

}


/*
[문제] 로또 프로그램
 1~45 사이의 난수를 6개 발생
 중복된 숫자가 나오면 안됨
 숫자가 오름차순으로 정렬시켜야 한다. (직접 정렬할것임)
 

*/