package operator;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
