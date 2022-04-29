package array_1;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar;
		System.out.print("배열의 크기를 입력하세요. >");
		int size = sc.nextInt();
		ar = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.print("ar["+i+"] 값 입력 : ");
			ar[i] = sc.nextInt();
		}
		
		for(int data : ar ) {
			System.out.print(data+" + ");
		}
		System.out.println();
		
		//합계 구하기
		int sum = 0;
		for(int data : ar) {
			sum+=data;
		}
		System.out.println("= "+sum);
		
		//최댓값 구하기
		int max = ar[0]; //초기값으로 0으로 설정하면 배열의 모든 값이 음수라면 뜬금없는 0이 출력된다.
		for(int data : ar) {
			if(max<data) {
				max=data;
			}
		}
		System.out.println("최댓값 : "+max);
		
		//최솟값 구하기
		int min = ar[0]; //초기값으로 0으로 설정하면 배열의 모든 값이 음수라면 뜬금없는 0이 출력된다.
		for(int data : ar) {
			if(min>data) {
				min=data;
			}
		}
		System.out.println("최솟값 : "+min);
	}
}
