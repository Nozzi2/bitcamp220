package zoo.safari;

import zoo.Zoo;

public class Safari extends Zoo{
	public static void main(String[] args) {
		Zoo z= new Zoo(); //부모
		z.tiger();
		//z.giraffe();
		//z.elephant();
		//z.lion();
		
		Safari s =new Safari(); //자녀
		s.tiger();
		s.giraffe();
		//s.elephant();
		//s.lion();
	}
}
