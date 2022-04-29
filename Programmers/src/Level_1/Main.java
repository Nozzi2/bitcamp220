package Level_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] s = sc.nextLine().split(" ");
		String s1 = s[0]+s[1];
		String s2 = s[2]+s[3];
		int num = Integer.parseInt(s1)+Integer.parseInt(s2);
		//System.out.println(Integer.parseInt(s1));
		//System.out.println(Integer.parseInt(s2));
		System.out.println(num);
	}
}
