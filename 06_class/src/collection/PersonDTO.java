package collection;

public class PersonDTO implements Comparable<PersonDTO> {
	private String name;
	private int age;
	
	
	public PersonDTO(String name, int age) {// 우클릭 - Source - Generate Constructor
		this.name = name;
		this.age = age;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	@Override
	public int compareTo(PersonDTO p) {
		//오름차순
//		if(this.age < p.age) return -1;
//		else if(this.age > p.age) return 1;
//		else return 0;
		
		//내림차순
		if(this.age < p.age) return 1;
		else if(this.age > p.age) return -1;
		else return 0;
	}
	
	public String toString() {
		return "["+name+", "+age+"]" ;
		
	}
}
		