package collection;

class GenericTest<T> { //<T> 어떤 타입으로 사용할지 정해지지 않았어요
	 private T a; //아직 타입이 선택되지 않았다.
	
	 public void setA(T a) { //필드와 같은 데이터형 T를 넣어준다. 정해해지 않은 데이터형 T
		 this.a =a;
	 }
	 
	 public T getA() { //필드와 같은 반환할 데이터형 T를 넣어준다. 정해해지 않은 데이터형 T
		 return this.a;
	 }
}

//----------------------

public class GenericMain {

	public static void main(String[] args) {
		GenericTest<Integer> aa = new GenericTest<Integer>();
		
		aa.setA(25);
		System.out.println("나이 = "+aa.getA());
		
		//aa.setA("홍길동"); 에러발생. aa의 데이터형은 int형이기 때문
		
		GenericTest<String> bb = new GenericTest<String>();
		bb.setA("홍길동");
		System.out.println("이름 = "+bb.getA());
	}

}
