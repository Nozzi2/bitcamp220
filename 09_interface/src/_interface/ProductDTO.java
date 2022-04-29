package _interface;

import java.text.DecimalFormat;

//데이터만 모아놨기 때문에 main메소드가 없음
public class ProductDTO {
	DecimalFormat df = new DecimalFormat();
	private String item;
	private int price,qty,total;
	
	public void setItem(String s) {
		item = s;
	}
	
	public void setPrice(int a) {
		price = a;
	}

	public void setQty(int a) {
		qty = a;
	}

	public void calc() {
		total = price*qty;
	}
	
	public String getItem() {
		return item;
	}

	public String getPrice() {
		
		return df.format(price);
	}

	public int getQty() {
		return qty;
	}

	public String getTotal() {
		return df.format(total);
	}
	
	

}


/*
item, price, qty, total	> c1
item, price, qty, total	> c2
item, price, qty, total	> c3
item, price, qty, total	> c4
item, price, qty, total	> c5

String item
int price, qty, total
 
 
 */
