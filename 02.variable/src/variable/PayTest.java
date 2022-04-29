package variable;

import java.text.DecimalFormat;

public class PayTest {

	public static void main(String[] args) {
		// 내가 구현한 코드
		String name = "L";
		double basePay = 2500000;
		double tax = 0.033;
		double salary = basePay-(basePay*tax);
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("*** "+name+"의 월급 ***");
		System.out.println("기본급 : "+df.format(Integer.parseInt(String.format("%.0f", basePay)))+"원");
		System.out.println("세금 : "+df.format(Integer.parseInt(String.format("%.0f", (basePay*tax))))+"원");
		System.out.println("월급 : "+df.format(Integer.parseInt(String.format("%.0f", salary)))+"원");
		
		
		System.out.println("\n\n\n강사님이 구현한 버젼\n");
		
		//강사님이 구현한 코드
		char name1 = 'L';
		int basePay1 = 2500000;
		int tax1 = (int)(basePay1*0.033);
		int salary1 = basePay1 - tax1;
		
		System.out.println("*** "+name1+"의 월급 ***");
		System.out.println("기본급 : "+df.format(salary1)+"원");
		System.out.println("세금 : "+df.format(tax1)+"원");
		System.out.println("월급 : "+df.format(salary1)+"원");
		
	}

}


/*[문제]
 * 이름이 L(name)인 사람의 기본급(basePay)이 2,500,000원일 때 3.3% 세금(tax)과 월급(salary)을 계싼하시오
 * 
 * 세금 = 기본급 * 3.3% (0.033)
 * 월급 = 기본급-세금
 * 
 * [실행결과]
 * *** L의 월급 ***
 * 기본급 : 2,500,000원
 * 세금 : 82,500
 * 월급 : 2,417,500원
 *  */