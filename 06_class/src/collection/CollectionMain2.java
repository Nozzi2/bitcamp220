package collection;

import java.util.ArrayList;

public class CollectionMain2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); 
		//list.add(25); 입력가능한 데이터형은 String
		//list.add(43.8); 입력가능한 데이터형은 String
		list.add("호랑이 어흥"); //중복허용, 순서 정해져있음
		list.add("사자 캬오");
		list.add("기린 흠흠");
		list.add("호랑이 어흥");
		list.add("코끼리 뿌우");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for(String data : list) { //ArrayList는 데이터형이 아닌 자료구조 이므로 String이 입력되야함
			System.out.println(data);
		}
		System.out.println(list);
	}
}
