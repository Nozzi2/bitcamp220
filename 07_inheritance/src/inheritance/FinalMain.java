package inheritance;

class Final {
	public final String FRUIT = "사과";
	public final String FRUIT2; //생성자에서'만' 초기화 가능
	
	public static final String ANIMAL = "호랑이이"; 
	public static final String ANIMAL2; //스태틱 영역에서'만' 초기화 가능
	
	static {
		ANIMAL2 = "비둘기";
	}
	
	public Final() {
		FRUIT2 = "딸기";
	}
}

//-------------------------
public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 25; //상수화
		//AGE = 30; 에러발생
		System.out.println("상수 AGE = "+AGE);
		
		final int AGE2;
		AGE2 = 30;
		System.out.println("상수 AGE2 = "+AGE2);
		
		Final fin = new Final();
		System.out.println("상수 FRUIT = "+fin.FRUIT);
		System.out.println("상수 FRUIT2 = "+fin.FRUIT2);
		
		System.out.println("상수 ANIMAL = "+Final.ANIMAL);
		System.out.println("상수 ANIMAL2 = "+Final.ANIMAL2);
	}

}
