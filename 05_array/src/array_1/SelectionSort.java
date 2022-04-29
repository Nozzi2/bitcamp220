package array_1;

//선택 정렬
public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {40, 78, 36, 55, 50};
		System.out.print("정렬 전 : ");
		for(int data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		int tmp = 0;
		int minIdx;
		//오름차순 정렬
		for(int a = 0; a<ar.length-1;a++) {
			minIdx = a;
			for(int b=a+1; b<ar.length; b++) {
				if(ar[minIdx] > ar[b]) {
					minIdx = b;
				}
			}
			if(minIdx != a) {
				tmp = ar[a];
				ar[a] = ar[minIdx];
				ar[minIdx] = tmp;
			}
		}
		
		System.out.print("오름차순 선택 정렬 후 : ");
		for(int data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		int maxIdx;
		//오름차순 정렬
		for(int a = 0; a<ar.length-1;a++) {
			maxIdx = a;
			for(int b=a+1; b<ar.length; b++) {
				if(ar[maxIdx] < ar[b]) {
					maxIdx = b;
				}
			}
			if(maxIdx != a) {
				tmp = ar[a];
				ar[a] = ar[maxIdx];
				ar[maxIdx] = tmp;
			}
		}
		
		System.out.print("내림차순 선택 정렬 후 : ");
		for(int data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		
		//아래는 강사님이 구현하신 것
		System.out.println("\n\n강사님이 구현하신 소스코드\n");
		
int temp;
for(int i=0; i<ar.length-1; i++) {
	for(int j=i+1; j<ar.length; j++) {
		if(ar[i] > ar[j]) {
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
		System.out.println(i+", "+j);
	}
}
		
		System.out.print("오름차순 선택 정렬 후 : ");
		for(int data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] < ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		
		System.out.print("내림차순 선택 정렬 후 : ");
		for(int data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
	}

}

/*
정렬 (Sort)
 - 오름차순 (Ascending) 1 2 3 4 / A B C D
 - 내림차순 (Descending) 9 8 7 6 / D C B A
 
 - Selection Sort (선택정렬)
 정렬할 첫번째 인덱스는 오름차순 기준으로 가장 작은 값이 나오기때문에
 배열의 처음부터 끝까지 비교한 후 최솟값을 선택하여 첫 번째 인덱스에 저장한다.
 
 ▼기준   ▼비교
 ar[0]	ar[1]
 		ar[2]
 		ar[3]
 		ar[4]
 		
 ▼기준   ▼비교
 ar[1]	ar[2]
 		ar[3]
 		ar[4]
 		
 ▼기준   ▼비교
 ar[2]	ar[3]
 		ar[4]
 		
 ▼기준   ▼비교
 ar[3]	ar[4]

*/
