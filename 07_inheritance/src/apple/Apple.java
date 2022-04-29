package apple;

import zoo.Zoo; //같은 패키지에 없기때문에 import 됨.

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨간 사과");
		Zoo zoo = new Zoo();
		zoo.tiger();
		
		//zoo.giraffe(); 에러발생
		
		//zoo.elephant();
		
		//zoo.line();
	}

}
