package _abstract;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//NumberFormat nf = new NumberFormat(); 추상 클래스로 객체를 생성하는 것이므로 에러발생
		NumberFormat nf = new DecimalFormat();
		System.out.println(nf.format(12345678.456789)); //12,345,678.457
		System.out.println(nf.format(12345678)); //12,345,678

		
		//유효숫자가 아닌것은 표현하지 않는다.
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		System.out.println(nf2.format(12345678.456789)); //12,345,678.46원
		System.out.println(nf2.format(12345678)); //12,345,678원
		
		//0을 강제로 표시
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		System.out.println(nf3.format(12345678.456789)); //12,345,678.46원
		System.out.println(nf3.format(12345678)); //12,345,678.00원
		
		
		NumberFormat nf4 = NumberFormat.getInstance();  //메소드를 이용해서 객체를 생성할 수도 있다.
														//단, 메소드가 static으로 선언되어있어야함
		System.out.println(nf4.format(12345678.456789)); //12,345,678.457
		System.out.println(nf4.format(12345678)); //12,345,678
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance();
		System.out.println(nf5.format(12345678.456789)); //₩12,345,678
		System.out.println(nf5.format(12345678)); //₩12,345,678
		
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.US);
		//매개변수를 선택해서 국가별 화폐 표기단위로 지정할 수 있음
		//nf6.setMinimumFractionDigits(2); //소수 이하 둘째자리까지 출력, 소수이하 없으면 그냥 숫자 출력
		//nf6.setMinimumFractionDigits(2); //소수 이하 2자리까지 0을 강제로 표시
		System.out.println(nf6.format(12345678.456789)); //$12,345,678.46
		System.out.println(nf6.format(12345678)); //$12,345,678.00
	}
}
