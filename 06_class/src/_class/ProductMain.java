package _class;

public class ProductMain {

	public static void main(String[] args) {
		ProductService productService = new ProductService();
		ProductService_lect productService2 = new ProductService_lect();
		//개발자 사이의 약속임. 객체 첫 글자는 소문자
		
		productService.menu(); //내가 구현한 것
		productService2.menu(); //강사님이 구현한 것
		
		System.out.println("프로그램을 종료합니다.");
	}

}
