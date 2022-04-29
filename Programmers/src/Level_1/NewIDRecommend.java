package Level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NewIDRecommend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String input = bf.readLine();
		
		ArrayList<Character> chars = new ArrayList<Character>();
		for (char c : input.toCharArray()) {
			  chars.add(c);
		}

		//1단계 대문자 > 소문자 전환
		System.out.println("\n1단계");
		for(int i = 0; i<chars.size();i++) {
			if(chars.get(i)>=65 && chars.get(i)<=90) {
				chars.set(i, (char)(chars.get(i)+32));
			}
			System.out.print(chars.get(i));
		}
		
		//2단계 소문자,숫자,-,_,. 빼고 다 삭제
		System.out.println("\n2단계");
		for(int i = 0; i<chars.size();i++) {
			if((chars.get(i)>=97 && chars.get(i)<=122) || 
				(chars.get(i)>=48 && chars.get(i)<=57) ||
				chars.get(i) == '-' ||
				chars.get(i) == '_' ||
				chars.get(i) == '.') {
			} else {
				chars.remove(i);
				i--;
			}
		}

		for(int i = 0; i<chars.size();i++) {
			System.out.print(chars.get(i));
		}
		
		
		//3단계 두번 연속으로 된 .은 한번만 나오도록
		System.out.println("\n3단계");
		boolean conti=false;
		for(int i = 0; i<chars.size();i++) {
			if(chars.get(i) == '.') {
				if(conti) {
					chars.remove(i);
					i--;
				} else {
					conti = true;
				}
			} else {
				conti = false;
			}
		}
		
		for(int i = 0; i<chars.size();i++) {
			System.out.print(chars.get(i));
		}
		
		//4단계 마침표가 처음이나 끝에 있으면 제거
		System.out.println("\n4단계");
		if(chars.size()!=0) {
			if(chars.get(0)=='.') {
				chars.remove(0);
			}
			if(chars.get(chars.size()-1)=='.') {
				chars.remove(chars.size()-1);
			}
		}
		
		
		for(int i = 0; i<chars.size();i++) {
			System.out.print(chars.get(i));
		}
		
		//5단계 빈문자열이라면 'a'삽입
		System.out.println("\n5단계");
		if(chars.size()==0) {
			chars.add('a');
		}
		for(int i = 0; i<chars.size();i++) {
			System.out.print(chars.get(i));
		}
		
		//6단계 길이가 16자 이상이면 나머지 모두 제거
		System.out.println("\n6단계");
		if(chars.size()>=16) {
			for(int i=15; i<chars.size();i++) {
				chars.remove(0);
				i--;
			}
		}
		
		for(int i = 0; i<chars.size();i++) {
			System.out.print(chars.get(i));
		}
		
		
		//7단계 길이가 2자 이하이면 마지막 문자를 길이가 3이 될때까지 채우기
		System.out.println("\n7단계");
		for(int i = chars.size(); i<3;i++) {
			chars.add( chars.get(chars.size()-1) );
		}
		for(int i = 0; i<chars.size();i++) {
			System.out.print(chars.get(i));
		}
		
	}

}
