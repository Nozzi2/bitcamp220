package array_1;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = new int[100];
		int[] count = new int[26];
		//'A' = 65, 'Z' = 90
		for(int i = 0; i<ar.length;i++) {
			ar[i] = (int)(Math.random() * (90-65+1))+65;
			System.out.print((char)ar[i]+" ");
			if((i+1)%10==0) {
				System.out.println();
			}
			count[ar[i]-65]++;
		}
		System.out.println();
		
		for(int i = 0; i<count.length;i++) {
			System.out.print((char)(i+65)+"의 갯수 : "+count[i]+"\t");
			if((i+1)%3==0) {
				System.out.println();
			}
		}
	}
}
//
/*
65~90 사이의 난수를 100개 발생하여 문자로 출력하시오
- 1줄에 10개씩 출력하시오
- 각 문자마다 몇 개씩 출력되었는지 개수를 출력하시오

[실행결과]
G  A  O  I  Q  G  J  M  S  M  
V  K  M  Y  A  A  R  U  L  Y  
H  O  H  Z  T  G  V  W  W  H  
O  H  L  U  J  D  V  J  A  O  
B  I  K  E  Q  C  P  J  D  X  
L  V  Q  Y  C  O  B  A  W  G  
A  L  S  U  Z  I  C  B  L  S  
B  C  S  V  Z  A  B  T  J  U  
Y  K  O  O  M  H  V  W  A  S  
K  Q  S  O  I  Y  K  Q  B  Z  

A의 개수 = 8   B의 개수 = 6   C의 개수 = 4   
D의 개수 = 2   E의 개수 = 1   F의 개수 = 0   
G의 개수 = 4   H의 개수 = 5   I의 개수 = 4   
J의 개수 = 5   K의 개수 = 5   L의 개수 = 5   
M의 개수 = 4   N의 개수 = 0   O의 개수 = 8   
P의 개수 = 1   Q의 개수 = 5   R의 개수 = 1   
S의 개수 = 6   T의 개수 = 2   U의 개수 = 4   
V의 개수 = 6   W의 개수 = 4   X의 개수 = 1   
Y의 개수 = 5   Z의 개수 = 4
*/