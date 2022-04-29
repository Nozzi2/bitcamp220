package array_2;

public class MultiArray2 {

	public static void main(String[] args) {
		int[][] ar = new int[10][10];
		
		for(int i=ar.length-1; i>=0; i--) {
			for(int j=ar[i].length-1; j>=0; j--) {
				ar[i][j] = (j*10)+(i+1);
				System.out.print(String.format("%4d", ar[i][j])); // % 'n'칸만큼 떨어져서 출력
			}
			System.out.println();
		}
	}
}
