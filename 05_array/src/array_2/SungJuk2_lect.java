package array_2;

import java.util.Scanner;


public class SungJuk2_lect {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("인원수 입력 : ");
		int cnt = scan.nextInt();
		
		String[] name = new String[cnt];
		int subjectCnt; //2차원배열의 length를 이용하면 되기 때문에 배열로 선언할 필요 없음
		String[][] subject = new String[cnt][]; //가변길이 배열
		int[][] jumsu = new int[cnt][]; //가변길이 배열
		double[] avg = new double[cnt];
		
		for(int i=0; i<cnt; i++) { //인원수만큼 반복수행
			System.out.println();
			System.out.println((i+1)+"번째");
			
			System.out.print("이름 입력 : ");
			name[i] = scan.next();
			
			System.out.print("과목수 입력 : ");
			subjectCnt = scan.nextInt();
			
			//과목 입력
			subject[i] = new String[subjectCnt]; //subject의 가변길이 설정
			for(int j=0; j<subjectCnt; j++) {
				System.out.print("과목명 입력 : ");
				subject[i][j] = scan.next();
			}//for j
			
			//과목 점수 입력
			jumsu[i] = new int[subjectCnt+1]; //jumsu의 가변길이 설정. +1 > 마지막칸에 총점 추가해야됨
			for(int j=0; j<subjectCnt; j++) {
				System.out.print(subject[i][j]+" 점수 입력 : ");
				jumsu[i][j] = scan.nextInt();
				jumsu[i][subjectCnt] += jumsu[i][j]; //총점 계산
			}//for j
			
			//평균 계산
			avg[i] = (double)jumsu[i][subjectCnt] / subjectCnt;			
		}//for i
		
		//출력
		for(int i=0; i<cnt; i++) {
			//타이틀
			System.out.println();
			System.out.print("이름\t");
			for(int j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j]+"\t");
			}
			System.out.println("총점\t평균\t");
			
			//데이터
			System.out.print(name[i]+"\t");
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println(String.format("%.2f", avg[i]));
			
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