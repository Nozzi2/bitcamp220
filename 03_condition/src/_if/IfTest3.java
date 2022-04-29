package _if;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 입력 : ");
		int b = sc.nextInt();
		System.out.print("세번째 입력 : ");
		int c = sc.nextInt();
		
		int min = 0;
		int max = a;
		int mid = 0;
		
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		
		if(max == a) {
			if(mid < b) {
				mid = b;
				min = c;
			}
			if(mid < c){
				mid = c;
				min = b;
			}
		} else if(max == b) {
			if(mid < a) {
				mid = a;
				min = c;
			}
			if(mid < c){
				mid = c;
				min = a;
			}
		} else if(max == c){
			if(mid < a) {
				mid = a;
				min = b;
			}
			if(mid < b){
				mid = b;
				min = a;
			}
		}
		
		System.out.println(min+"  "+mid+"  "+max);

		
		
		//강사님께서 풀이해주신 코드
		if(a<b && a<c) { //a가 가장 작다면
	          if(b<c) System.out.println(a+", "+b+", "+c);
	          else System.out.println(a+", "+c+", "+b);
	       
	       }else if(b<c) { //b가 가장 작다면
	          if(a<c) System.out.println(b+", "+a+", "+c);
	         else System.out.println(b+", "+c+", "+a);
	       
	       }else { //c가 가장 작은 값 
	          if(a<b) System.out.println(c+", "+a+", "+b);
	         else System.out.println(c+", "+b+", "+a);
	       }

	}

}

/*
[문제] 3개의 숫자 (a,b,c)를 입력받아서 순서대로 출력하시오.
전제1. 3개의 숫자를 모두 다르게 입력한다.
전제2. if문만 사용하기

[입력]
85
80
65

62
60
80


[실행결과]
첫번째 입력 : 85
두번째 입력 : 80
세번째 입력 : 65
65  80  85

첫번째 입력 : 62
두번째 입력 : 60
세번째 입력 : 80
60  62  80
 */
