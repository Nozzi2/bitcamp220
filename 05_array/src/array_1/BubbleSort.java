package array_1;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = {40, 78, 36, 55, 50};
		
		//정렬 전
		System.out.print("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		//버블소팅 오름차순 정렬
		/*☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		 * ☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
		 * ☆★☆★☆★☆★ 꼭 직접 구현하기 ☆★☆★☆★☆★
		 * ☆★☆★☆★☆★☆☆★☆★★☆★☆★☆★☆★☆★☆★☆★
		 * ☆★☆★☆★☆★☆☆★☆★★☆★☆★☆★☆★☆★☆★☆★
		 * ☆★☆★☆★☆★☆☆★☆★★☆★☆★☆★☆★☆★☆★☆★
		 * ☆★☆★☆★☆★☆☆★☆★★☆★☆★☆★☆★☆★☆★☆★
		 */
		int tmp=0;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar.length-1-i;j++) {
				//System.out.println(j+", "+(j+1));
				if(ar[j]>ar[j+1]) {
					tmp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = tmp;
				}
			}
		}
		
		
		
		
		//정렬 후 출력
		System.out.print("오름차순 버블 정렬 후 : ");
		for(int data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		
		
		//버블소팅 오름차순 정렬
		/* 강사님 구현
		int temp;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=0; j<ar.length-i-1; j++) {
				if(ar[j] > ar[j+1]) {
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
				System.out.println(j+", "+(j+1));
			}
		}*/

	}

}
