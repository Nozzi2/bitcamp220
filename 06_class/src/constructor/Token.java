package constructor;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str= "학원,집,,게임방";
		//토큰은 ,,을 무시한다
		//스플릿은 ,,을 아무것도 없는 것으로 저장한다.
		
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println("토큰 개수 = "+st.countTokens()); // 비어있는 문자열을 무시한다. 3 출력
		
		//hasMoreTokens() '현재' 위치에 항목 있다(True)/없다(false) 반환
		//nextToken() '현재' 위치에 항목을 꺼내주고, 다음 위치로 이동
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}//while
		
		String[] ar = str.split(",");
		for(String data : ar) {
			System.out.println(data);
		}
		/*▼출력
		학원
		집
		
		게임방
		 */
	}
}