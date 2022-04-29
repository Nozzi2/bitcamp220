package array_2;

public class MultiArray4 {

	public static void main(String[] args) {
		int[][] ar = {{1,2,3,0}, 
				      {4,5,6,0}, 
				      {7,8,9,0}, 
				      {0,0,0,0}};
		
		//계산
		//가로축 계산
		for(int i=0; i<ar.length-1;i++) {
			for(int j=0; j<ar[i].length-1;j++) {
				ar[i][3] += ar[i][j];
				ar[3][3] += ar[i][j]; //마지막 칸도 같이 계산
			}//for j
		}//for i
		
		//세로축 계산
		for(int i=0; i<ar.length-1;i++) {
			for(int j=0; j<ar[i].length-1;j++) {
				ar[3][i] += ar[j][i];
			}//for j
		}//for i
		
		
		//출력
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(ar[i][j]+"\t");
			}//for j
			System.out.println();
		} //for i
	}
}

/*
[문제] 합을 구하시오

1 2 3 0
4 5 6 0
7 8 9 0
0 0 0 0

[0][3] = 1+2+3
[1][3] = 4+5+6
[2][3] = 7+8+9

[3][0] = 1+4+7
[3][1] = 2+5+8
[3][2] = 3+6+9

[3][3] = 1+2+3+4+5+6+7+8+9
*/