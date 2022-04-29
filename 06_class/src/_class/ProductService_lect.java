package _class;

import java.util.Scanner;

public class ProductService_lect {

	private ProductDTO[] ar = new ProductDTO[5]; 
	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		
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
		for(int i=0; i<ar.length; i++) { //객체 생성 안된것부터 한번 수행하고 break로 끝나게 됨.
			if(ar[i]!=null) { //객체 생성이 안되었으면 아래를 수행한다.
				ar[i] = new ProductDTO(); //여기서 객체 생성 쨘!
				
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
				
				break;
			}//if
		} //for i
	}//insertProduct()

	private void displayProduct() { //담겨있는 상품 출력
		System.out.println("제품명\t"+"수량\t"+"가격\t"+"총계");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=null) {
				System.out.println(ar[i].getItem()+"\t"+ar[i].getQty()+"\t"+ar[i].getPrice()+"\t"+ar[i].getTotal());
			} //if
		} //for i
	} //displayProduct()
	

}
