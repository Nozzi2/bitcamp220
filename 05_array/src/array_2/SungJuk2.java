package array_2;

import java.util.Scanner;

public class SungJuk2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 : ");
		int testCase = sc.nextInt(); //사람 수
		sc.nextLine();
		String[] name = new String[testCase]; //이름
		int[] subjectCnt = new int[testCase]; //과목 수
		String[][] subject = new String[testCase][]; //과목 이름 이중배열
		int[][] jumsu = new int[testCase][]; //과목 점수 이중배열
		
		
		
		for(int i = 0; i<testCase; i++) {
			System.out.println();
			System.out.println((i+1)+"번째");
			System.out.print("이름 입력 : ");
			name[i] = sc.nextLine();
			System.out.print("과목수 입력 : ");
			subjectCnt[i] = sc.nextInt();
			sc.nextLine();
			
			//과목 입력
			for(int j=0; j<subjectCnt[i]; j++) {
				if(j==0) { //첫번째 수행에만 배열 사이즈를 선언해야함
					subject[i] = new String[subjectCnt[i]]; // > 이거 for문 밖으로 빠져나오면 되잖아?
				}
				System.out.print("과목명 "+(j+1)+" 입력 : ");
				subject[i][j] = sc.nextLine();
			}//for j
			
			//과목점수 입력
			for(int j=0; j<subjectCnt[i]; j++) {
				if(j==0) { //첫번째 수행에만 배열 사이즈를 선언해야함
					jumsu[i] = new int[subjectCnt[i]]; // > 이거 for문 밖으로 빠져나오면 되잖아?
				}
				System.out.print("과목점수 "+(j+1)+" 입력 : ");
				jumsu[i][j] = sc.nextInt();
				sc.nextLine();
			}//for j
			
			System.out.println();
		}//for i
		
		//출력
		for(int i=0; i<testCase; i++) {
			//인원당 항목 출력
			System.out.print("이름\t");
			for(int j=0; j<subjectCnt[i]; j++) { //해당인원의 과목수만큼
				System.out.print(subject[i][j]+"\t");
			}
			System.out.println("평균\t총점");
			
			//인원당 점수 출력
			int sum = 0; //합계
			System.out.print(name[i]+"\t");
			for(int j=0; j<subjectCnt[i]; j++) {
				System.out.print(jumsu[i][j]+"\t");
				sum+=jumsu[i][j];
			}
			double avg = (double)sum/subjectCnt[i]; //평균
			System.out.print(String.format("%.2f", avg)+"\t");
			System.out.println(sum+"\n");
		}

	}

}


/*
[문제] 성적계산
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오.
-인원수만큼 배열 생성해야함
-평균은 소수이하 2째자리까지 출력
-이름 변수명 name
-과목수 변수명 subjectCnt
-과목명 변수명 subject
-과목별 점수 jumsu




[입력]
2


[실행결과]
인원수 : 2

1번째
이름입력 : 홍길동
과목 수 입력 : 2
과목명 입력 : 국어
과목명 입력 : 영어
국어 점수 입력 : 95
영어 점수 입력 : 80

2번째
이름입력 : 이기자
과목 수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 자바
국어 점수 입력 : 65
영어 점수 입력 : 85
자바 점수 입력 : 100


이름   	국어 	영어	    총점 	평균
홍길동	95		80	

이름   	국어 	영어	    자바		총점 	평균
이기자	95		80		100

 
*/

/* 출력 샘플
3
홍길동
2
국어
영어
95
80
노정환
5
리액트
자바
JS
스프링
DB
85
100
85
95
100
이풍혁
2
정처필기
정처실기
85
94
*/