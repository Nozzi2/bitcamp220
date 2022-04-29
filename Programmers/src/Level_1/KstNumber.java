package Level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KstNumber {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		String[] s = bf.readLine().split(" "); //String
		int[] array = new int[s.length];
		for(int i = 0; i<s.length;i++) {
			array[i] = Integer.parseInt(s[i]);
		}
		
		/* 하나라도 먼저 구현하고 반복하자
		int testCase = Integer.parseInt(bf.readLine()); //테스트 케이스
		int[][] commands = new int[testCase][3];
		for(int a = 0; a<testCase;a++) {
			s = bf.readLine().split(" ");
			for(int b=0; b<3; b++) {
				commands[a][b] = Integer.parseInt(s[b]);
			}
		}
		*/
		
		int[] commands = new int[3];
		s = bf.readLine().split(" ");
		for(int b=0; b<3; b++) {
			commands[b] = Integer.parseInt(s[b]);
		}
		
		int[] newArr = new int[commands[1]-commands[0]+1];
		int n=0;
		for(int i=commands[0]-1; i<=commands[1]-1; i++) {
			newArr[n]=array[i];
			n++;
		}
		n=0;
		Arrays.sort(newArr);
		//int kstNum = Integer.parseInt(bf.readLine());
		
		System.out.println("\n\n\n"+newArr[commands[2]-1]);
		
		
		
		//int[] result;
		

	}

}
