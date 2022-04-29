package constructor;

import static java.lang.Math.random;
import static java.lang.Math.pow;
//import static java.lang.Math.*; (* 경로 내의 모든 것. 단, static인것만 불러옴)
import static java.lang.System.out;

public class ImportStatic {
	public static void main(String[] args) {
		out.println("난수 = "+random());
		out.println("제곱 = "+pow(2, 5)); //2의 5승
	}
}
