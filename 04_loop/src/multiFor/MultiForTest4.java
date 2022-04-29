package multiFor;

public class MultiForTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3중 포문 사용하기
		int dan, i;
		
		
		for(int a=0; a<=6;a=a+3) {
			for(i=1; i<=9; i++) {
				for(dan=2+a; dan<=4+a; dan++) {
					if(dan==10) break;
					System.out.print(dan+" * "+i+" = ");
					System.out.print(dan*i+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}


/*
[문제] 구구단
3단씩 끊어서 출력하세요

[실행결과]
2 * 1 = 2	3 * 1 = 3	4 * 1 = 4
...
2 * 9 = 18	3 * 9 = 27	4 * 9 = 36

5 * 1 = 5	6 * 1 = 6	7 * 1 = 7
...
5 * 9 = 45	6 * 9 = 54	7 * 9 = 63

8 * 1 = 8	9 * 1 = 9
...
8 * 9 = 72	9 * 9 = 81


*/