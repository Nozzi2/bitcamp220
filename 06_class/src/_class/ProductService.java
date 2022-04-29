package _class;

import java.util.Scanner;

public class ProductService {
	private ProductDTO[] ar = new ProductDTO[5];  //객체 배열을 선언하면 칸만 만들어지고 칸 안에 주솟값은 생성되지 않았기 때문에 값을 넣을 수 없음.
	Scanner sc = new Scanner(System.in);
	int productNum;
	boolean init;
	
	public void menu() {
		int num;
		
		if(!init) {
			for(int i=0; i<ar.length; i++) {
				//ar[i] = new ProductDTO();
			}
			init = true;
		}
		
		
		while(true) {
			System.out.println();
			System.out.println("************************");
			System.out.println("    1. 물건 담기");
			System.out.println("    2. 담은 물건 보기");
			System.out.println("    3. 종료");
			System.out.println("************************");
			System.out.print("   번호 선택 : ");
			num = sc.nextInt();
			sc.nextLine();
			if(num==3) break;
			
			if(num==1) {
				insertProduct();
			} else if (num==2) {
				displayProduct();
			}
			
		} //while
	} //munu()

	private void insertProduct() { //상품의 정보 입력
		//입력받아서 n번째 수정할 수도 있고, 상품 하나씩 등록 또는 수정할 수 있음
		int i = productNum%5; //
		productNum++; 
		
		String s;
		int input;
		
		//제품명 입력
		System.out.println("제품명 "+(i+1)+" 입력 : ");
		s = sc.nextLine();
		ar[i].setItem( s );
		
		//해당 제품의 수량 입력
		System.out.println("제품 "+(i+1)+"의 수량 입력 : ");
		input = sc.nextInt();
		ar[i].setQty( input );
		
		//해당 제품의 가격 입력
		System.out.println("제품 "+(i+1)+"의 가격 입력 : ");
		input = sc.nextInt();
		ar[i].setPrice( input );
		
		ar[i].calc();
	}

	private void displayProduct() { //담겨있는 상품 출력
		System.out.println("제품명\t"+"수량\t"+"가격\t"+"총계");
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i].getItem()+"\t"+ar[i].getQty()+"\t"+ar[i].getPrice()+"\t"+ar[i].getTotal());
		}
	}
	
	
}
