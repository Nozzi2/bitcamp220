package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	public static void main(String[] args) {
Collection<String> coll = new ArrayList<String>();
coll.add("호랑이 어흥"); //중복허용, 순서 정해져있음
coll.add("사자 캬오");
coll.add("기린 흠흠");
coll.add("호랑이 어흥");
coll.add("코끼리 뿌우");

Iterator<String> it = coll.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}




/*
interface
1. implements를 반드시 오버라이드 해줘야 한다.

2. 대신 Override 해주는 클래스


*/