package collection;

import java.util.ArrayList;

public class PersonMain {
	
	public PersonDTO[] init() { //직접 구현
		//---------------절 대 고 정 --------------
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("네오", 30);
		PersonDTO cc = new PersonDTO("프로도", 35);
		//---------------절 대 고 정 --------------
		
		PersonDTO[] A = new PersonDTO[3];
		A[0] = aa;
		A[1] = bb;
		A[2] = cc;
		return A;
	}
	
	public ArrayList<PersonDTO> init_lect() { //강사님 구현
		//---------------절 대 고 정 --------------
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("네오", 30);
		PersonDTO cc = new PersonDTO("프로도", 35);
		//---------------절 대 고 정 --------------
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa); //주소만 담기는 것임
		list.add(bb); //주소만 담기는 것임
		list.add(cc); //주소만 담기는 것임
		
		return list; //주솟값 반환
	}

	public static void main(String[] args) {
		PersonMain pm = new PersonMain();
		
		//직접 구현
		for(int i=0; i<pm.init().length; i++) {
			System.out.println(pm.init()[i].getName()+", "+pm.init()[i].getAge());
		}
		
		//강사님 구현
		ArrayList<PersonDTO> list = pm.init_lect(); //주솟값 반환된 것을 받아서 list에 저장
		
		System.out.println(list);
		//[collection.PersonDTO@1d8d30f7, collection.PersonDTO@3e57cd70, collection.PersonDTO@9a7504c]
		//      aa                              bb                            cc
		
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getName()+"+ "+list.get(i).getAge());
		}
		
		for(PersonDTO dto : list) { // ArrayList가 데이터형이 아니니까 DTO가 데이터형임
			System.out.println(dto.getName()+", "+dto.getAge());
		}
		
		

	}

}
