package operator;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		a =2;
		a =3;
		
		int b = a++; //a (3)을 저장하고 a는 a+1
		System.out.println(b); //3
		b = ++a; //a는 a+1하고  a(5)을 저장 
		System.out.println(b); //5
		
		/*a++가 있으면 그 어떤 경우가 있어도 가장 뒤에 연산을 하기때문에
		출력 또한 먼저 하고 뒤에 연산한다.*/
		
		System.out.println("a++ = "+ a++); // 6
		//a가 +1됨 > a에 7이 저장 되어있음.
		
		int  num1=0, num2=0;
		boolean result;
		
		result = ( (num1+=10) < 0 && (num2+=10) > 0);
		System.out.println(result); //false
		System.out.println(num1+", "+num2); // 10,0
		// num2+=10은 수행하지 않는다.
		
		
		result = ( (num1+=10) > 0 || (num2+=10) > 0);
		System.out.println(result); //true
		System.out.println(num1+", "+num2); // 20,0
		// num2+=10은 마찬가지로 수행하지 않는다.
		

	}

}
