package inheritance;

class AA { //부모 클래스
	protected int a = 3;
	
	public void disp() {
		a += 5;
		System.out.println("AA : "+a+" ");
	}
}


class BB extends AA { //자녀 클래스
	protected int a = 8;
	
	public void disp() {
		a += 5; //this.a = this.a+5;
		System.out.println("BB : "+a+" ");
	}
}

//---------------------------------
public class TestMain2 {

	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp(); //BB : 13
		System.out.println("aa : "+aa.a); //13 자녀클래스의 연산된 a 출력
		System.out.println();
		
		AA bb = new BB();
		bb.disp(); //BB : 13
		System.out.println("bb : "+bb.a); //3 부모클래스의 a 출력
		System.out.println();
		
		AA cc = new AA(); //부모 자체로 객체를 생성했기 때문에 자녀 클래스는 생성되지 않음
		cc.disp(); //AA : 8
		System.out.println("cc : "+cc.a); //8 부모클래스의 연산된 a 출력
		System.out.println();
		
		//자식 = (자식)부모
		BB dd = (BB)bb; //메모리에는 BB클래스의 데이터들이 등록이 되어있음
//		BB dd = (BB)cc; cc는 자식이 있는지 없는지도 모르기 때문에 데이터형이 BB인 객체 생성이 안됨
//						첨부그림 확인
		dd.disp(); //BB : 18 > bb에서 연산된 값을 참조하기 때문에 연산된 a 출력
		System.out.println("dd : "+dd.a); //18
		System.out.println();
	}

}
