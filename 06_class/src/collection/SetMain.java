package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set<String>	set = new HashSet<String>();
		set.add("호랑이 어흥");
		set.add("사자 캬오");
		set.add("기린 흠흠");
		set.add("호랑이 어흥"); //중복허용X , 순서X
		set.add("코끼리 뿌우");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
