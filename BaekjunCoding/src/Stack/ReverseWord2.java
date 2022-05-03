package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseWord2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Character> stack = new ArrayDeque<>();
		boolean sw = false; // < 일 경우 true, >일 경우 false 
		String s = br.readLine();
		char[] chars = s.toCharArray();
		
		for(int i=0; i<chars.length; i++) {
			if(chars[i] == '<') { //<일 경우
				//스택의 담긴 모든 내용 pop하여 SB에 넣기
				while(!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				sw = true; //< 일 경우 true
				sb.append('<');
			} else if (chars[i] == '>') { //>일 경우
				sw = false; //> 일 경우 false 
				sb.append('>');
			} else if (sw) { // 괄호가 < 열려있을 경우
				sb.append(chars[i]); //뒤집지 않고 그냥 출력
			} else if (!sw) { // 괄호가 > 닫혀있을 경우
				if(chars[i]==' ') { //공백일 경우
					//스택의 담긴 모든 내용 pop하여 SB에 넣기
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(' '); //' ' SB에 넣기
				} else if (i == chars.length-1) { //배열의 끝일 경우
					stack.push(chars[i]); //스택에 문자 push
					//스택의 담긴 모든 내용 pop하여 SB에 넣기
					while(!stack.isEmpty()) {
						sb.append(stack.pop());
					}
				} else { //문자가 공백이 아닐 경우
					stack.push(chars[i]); //스택에 문자 push
				}
			}
		}
		System.out.println(sb);
	}
}
