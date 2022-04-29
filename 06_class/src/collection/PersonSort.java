package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = {"orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.println("정렬 전 = ");
		for(String str : ar) {
			System.out.println(str + " ");
		}
		System.out.println();
		
		Arrays.sort(ar); //배열에 있는걸 정렬할때
		
		System.out.println("정렬 후 = ");
		for(String str : ar) {
			System.out.println(str + " ");
		}
		System.out.println();
		
		System.out.println("객체 소트");
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("네오", 30);
		PersonDTO cc = new PersonDTO("프로도", 28);
		
		System.out.println("기준을 나이로 설정했다");
		List<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		System.out.println("정렬 전 = " +list);

		Collections.sort(list); //리스트에 담겨있는걸 소트시켜주는게 Collections
		
		System.out.println("정렬 후 = " +list);

		System.out.println("다른 기준으로 정렬 - 이름");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
				//오름차순
				//return p1.getName().compareTo(p2.getName());
				
				//내림차순
				return p1.getName().compareTo(p2.getName()) * -1 ;
			}
		};
Collections.sort(list, com);
		System.out.println("정렬 후 = "+list);
	}

}
