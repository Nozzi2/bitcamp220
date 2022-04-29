package _interface;

public class ProductMain {

	public static void main(String[] args) {
		Product ps = new ProductService_lect(); //부모=자식. 다형성
		
		ps.menu(); //강사님이 구현한 것
		
		System.out.println("프로그램을 종료합니다.");
	}
}
