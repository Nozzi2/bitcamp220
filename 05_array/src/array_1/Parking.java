package array_1;

import java.util.Scanner;

public class Parking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] ar = new boolean[5]; //T는 차가 있음. F는 차가 없음
		int num;
		int section;
		
		
		while (true) {
			System.out.println();
			System.out.println("*************************");
			System.out.println("\t1. 입차");
			System.out.println("\t2. 출차");
			System.out.println("\t3. 리스트");
			System.out.println("\t4. 종료");
			System.out.println("*************************");
			System.out.print(" 메뉴 : ");
			num = sc.nextInt();
			if(num==4) break;
			else if(num == 1) {
				System.out.print("몇번 칸에 주차했습니까? >");
				section = sc.nextInt()-1;
				while(ar[section]) {
					System.out.print("이미 주차되어 있습니다."); 
					section = sc.nextInt()-1;
				}
				ar[section] = true;
				System.out.print((section+1)+"번 위치에 입차했습니다.");
			} else if(num == 2) {
				System.out.print("몇번 칸에 출차했습니까? >");
				section = sc.nextInt()-1;
				while(!ar[section]) {
					System.out.print("해당 칸은 비어 있습니다."); 
					section = sc.nextInt()-1;
				}
				ar[section] = false;
				System.out.print((section+1)+"번 위치에 출차했습니다.");
				
			} else if(num == 3) {
				for(int i = 0; i<ar.length;i++) {
					if(ar[i]) {
						System.out.println((i+1)+"번째 칸에 주차O");
					} else {
						System.out.println((i+1)+"번째 칸에 주차X");
					}
				}
			}
			
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
