package array_1;

public class ArrayTest2 {

	public static void main(String[] args) {
		//String[] ar = new String[3];
		for(int i =0; i< args.length; i++) {
			System.out.println("args["+i+"] = "+args[i]);
			System.out.println("args["+i+"] 문자열의 크기 "+args[i].length());
			//각 방의 첫글자만 뽑아오기
			System.out.println("args["+i+"] 첫번째 문자 = "+args[i].charAt(0));
			System.out.println();
		}
		for(String s : args) {
			System.out.println(s+s.length()+s.charAt(0));
		}
		
		

	}

}

