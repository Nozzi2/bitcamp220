package constructor;
class Fruit_lect {
	private String pum;
	private int jan, feb, mar, tot;
	private static int sumJan, sumFeb, sumMar, sw;
	
	public Fruit_lect(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		calcTot();
	}
	
	public void calcTot() {
		tot = jan+feb+mar;
		
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
	
	public void display() {
		System.out.println(pum+"\t"+jan+"\t"+feb+"\t"+mar+"\t"+tot);
	}
	
	public void output() {
		System.out.println("\t"+sumJan+"\t"+sumFeb+"\t"+sumMar);
	}
		
}

//--------------------------------------
public class FruitMain_lect {

	public static void main(String[] args) {
		Fruit_lect[] ar = {new Fruit_lect("사과",100,80,75), 
				  new Fruit_lect("포도",30,25,10), 
				  new Fruit_lect("딸기",25,30,90)};
		
		for(Fruit_lect f : ar) {
			f.display();
		}
		ar[0].output();
		
		

	}

}
