package array_2;

public class MultiArray3 {

	public static void main(String[] args) {
		int[][] ar = new int[3][];
		ar[0] = new int[2];
		ar[1] = new int[3];
		ar[2] = new int[4];
		
		System.out.println("ar = "+ar);
		
		int cnt=0;
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar["+i+"] = "+ar[i]);
			for(int j=0; j<ar[i].length; j++) {
				cnt++;
				ar[i][j] = cnt*10;
				System.out.println("ar["+i+"]["+j+"] = "+ar[i][j]);
			}
			System.out.println();
		}
	}

}
