package array_2;

public class MultiArray4_lect {

	public static void main(String[] args) {
		int[][] ar = {{1,2,3,0}, 
					  {4,5,6,0}, 
					  {7,8,9,0}, 
					  {0,0,0,0}};
		
		//계산
		/*
		for(int i=0; i<ar.length-1;i++) {
			for(int j=0; j<ar[i].length-1; j++) {
				ar[i][3] += ar[i][j];
				ar[3][i] += ar[j][i];
				ar[3][3] += ar[i][j];
			}
		}*/
		
		//이렇게도 풀 수 있음
		for(int i=0; i<ar.length-1;i++) {
			for(int j=0; j<ar[i].length-1; j++) {
				ar[j][3] += ar[j][i];
				ar[3][j] += ar[i][j];
				ar[3][3] += ar[j][i];
			}
		}
		/* ▲ 아래와 같은 반복문
		ar[3][0] += ar[0][0];
		ar[3][1] += ar[0][1];
		ar[3][2] += ar[0][2];
		
		ar[3][0] += ar[1][0];
		ar[3][1] += ar[1][1];
		ar[3][2] += ar[1][2];
		
		...
		
 		이렇게 구현 되어있는 것임.
		 */
		
		
		//출력
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(String.format("%3d", ar[i][j]));
			}//for j
			System.out.println();
		} //for i
			
		
	}
}
