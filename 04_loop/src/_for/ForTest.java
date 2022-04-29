package _for;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i =0; i<5; i++) {
			System.out.println("Hello Java"+i);
		}
		System.out.println("끝났다~"+i);
		
		for(i=10; i>0; i--) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		
		for(i='A'; i<='Z';i++) {
			System.out.print((char)i+" ");
		}
		
	}

}
