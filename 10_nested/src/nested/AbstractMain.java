package nested;

/* 1. implements
public class AbstractMain implements InterA {

	@Override
	public void aa() {
		
	}

	@Override
	public void bb() {
		
	}

}
*/

//2. 대신 override한 클래스를 객체 생성한다.
/*
public class AbstractMain {

	public static void main(String[] args) {
		InterA in = new InterAImpl();
		in.aa();
	}
}*/

//3
public class AbstractMain {
	public static void main(String[] args) {
		InterA in = new InterA() { //익명 inner 클래스
			public void aa() {}
			public void bb() {}
		};
		in.aa();
		
		//AbstractTest at = new AbstractTest(); 추상클래스로는 객체 생성할 수 없다!
		//생성하려고 1. 자식클래스
		//   2. 익명 Inner Class
		
		AbstractTest at = new AbstractTest() {

			@Override
			public void setName(String name) {
				// TODO Auto-generated method stub
				this.name = name;
			}
		};
		
		AbstractExam ae = new AbstractExam() {};
		
		
		
	}
}
