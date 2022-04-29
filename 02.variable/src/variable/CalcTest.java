package variable;

import java.text.DecimalFormat;

public class CalcTest {
	public static void main(String[] args) {
		
		short a1 = 320;
		short b1 = 258;

		short sum1 = (short)(a1+b1);
		
		short num1 = 320;
		short num2 = 258;
		
		DecimalFormat df = new DecimalFormat(); //(#,###) 이 생략되어있음
		//1234.55  > #,###.# > 1,234.6
		//1234 > #,###.0 > 1,234.0
		
		
		short sum = (short)(num1+num2);
		short sub = (short)(num1-num2);
		int multi = num1*num2;
		double div = (double)num1/(double)num2;
		
		System.out.println(num1+" + "+num2+" = "+sum);
		System.out.println(num1+" - "+num2+" = "+sub);
		System.out.println(num1+" * "+num2+" = "+multi);
		System.out.println(num1+" / "+num2+" = "+String.format("%.2f", div));
		
		
		// 1,000  이런식으로 세자리마다 쉼표 넣기
		System.out.println(num1+" * "+num2+" = "+ df.format(multi)); 
		
		
		//소수 둘째자리 
		
		System.out.println("2진수로 변환할 10진수를 입력하세요.");
		
		int tenJinsu = 203;
		int twoJinsu = 0;
		int tenJari = 1;
		while(tenJinsu != 0) {
			System.out.println("while 전 "+twoJinsu);
			twoJinsu = twoJinsu+(tenJinsu%2)*tenJari;
			tenJinsu = tenJinsu/2;
			tenJari = tenJari * 10;
			System.out.println("while 후 "+twoJinsu);
		}
		System.out.println(twoJinsu);
	}
}

/*
 * [문제]320, 258의 합, 차, 곱, 몫을 구하시오.
 * 
 */
