package array_2;

public class SungJuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"홍길동", "라이언", "어피치"};
		int[][] jumsu = { {90,96,100,0},
						  {100,89,75,0},
						  {75,80,48,0}};
		double[] avg = new double[3];
		char[] grade = new char[3];
		
		for(int a=0; a<jumsu.length;a++) {
			for(int b=0; b<jumsu[a].length-1;b++) {
				jumsu[a][jumsu[a].length-1] += jumsu[a][b];
			}
		}
				
		for(int i=0; i<avg.length; i++) {
			avg[i] = (double)jumsu[i][jumsu[i].length-1]/3;
		}
		
		for(int i=0; i<grade.length; i++) {
			if(avg[i]<=100 && avg[i]>=90) {
				grade[i] = 'A';
			} else if(avg[i]<90 && avg[i]>=80) {
				grade[i] = 'B';
			} else if(avg[i]<80 && avg[i]>=70) {
				grade[i] = 'C';
			} else if(avg[i]<70 && avg[i]>=60) {
				grade[i] = 'D';
			} else {
				grade[i] = 'F';
			}
		}
		
		System.out.println("----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("----------------------------------------------------");
		
		for(int a=0; a<name.length;a++) {
			System.out.print(name[a]+"\t");
			for(int b=0; b<jumsu[a].length;b++) {
				System.out.print(jumsu[a][b]+"\t");
			}
			System.out.print(String.format("%.2f", avg[a])+"\t");
			System.out.println(grade[a]);
		}
		System.out.println("----------------------------------------------------");

	}

}


/*
[문제] 성적처리
----------------------------------------------------
이름      국어      영어      수학      총점      평균      학점
----------------------------------------------------
홍길동   90      96      100
라이언   100      89      75
어피치   75      80      48
----------------------------------------------------

-평균은 소수이하 둘째자리까지 출력.
-총점 = 국어 + 영어 + 수학
-평균 = 총점 / 3
-평균이 90이상이면 A
 평균이 80이상이면 B
 평균이 70이상이면 C
 평균이 60이상이면 D
 그외는 F
 -문자열은 문자열대로 배열을 잡아줘야함	name[]
  String[] name = { 홍길동, 라이언, 어피치 }
 -국,영,수,총점은 2차원 배열 (int)	jumsu[][]
 -평균은 1차원 배열 (double)		avg[]
 -학점은 1차원 배열 (char)			grade[]
*/
