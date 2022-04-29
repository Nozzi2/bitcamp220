package constructor;

class Fruit {
	String pum;
	int jan, feb, mar, tot;
	static int sumJan, sumFeb, sumMar, sw;
	
	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
		calcTot();
	}
	
	public String getPum() {
		return this.pum;
	}
	
	public int getJan() {
		return this.jan;
	}

	public int getFeb() {
		return this.feb;
	}

	public int getMar() {
		return this.mar;
	}

	public int getTotal() {
		return this.tot;
	}

	public int getSumJan() {
		
		return Fruit.sumJan;
	}

	public int getSumFeb() {
		return Fruit.sumFeb;
	}

	public int getSumMar() {
		return Fruit.sumMar;
	}
	
	public void calcTot() {
		tot = jan+feb+mar;
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
	}
	public void output() {
		System.out.println("\t"+getSumJan()+"\t"+getSumFeb()+"\t"+getSumMar());
	}
	public void display() {
		if(sw==0) {
			System.out.println("----------------------------------------");
			System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
			System.out.println("----------------------------------------");
		}
		System.out.println(getPum()+"\t"+getJan()+"\t"+getFeb()+"\t"+
				           getMar()+"\t"+getTotal());
		sw++;
		if(sw==3) { //이부분을 sw==3이 아니라 배열의 마지막에서 출력되게 하는 방법이 없을까?
			System.out.println("----------------------------------------");
		}
	}
}

//------------------------------
public class FruitMain {
	public static void main(String[] args) {
		Fruit[] ar = {new Fruit("사과",100,80,75), 
					  new Fruit("포도",30,25,10), 
					  new Fruit("딸기",25,30,90)};
		for(int i=0; i<ar.length;i++) {
			ar[i].display();
		}
		ar[0].output();
		
	}

}


/*
[문제] 1사분기의 과일별 합계와 월별 합계를 구하시오.

클래스 : Fruit
필드  : pum, jan, feb, mar, tot
       sumJan, sumFeb, sumMar

메소드 : 생성자
 calcTot() 합계계산
 display() 출력
 output() 월별 출력

[실행결과]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
사과    100    80    75        255
포도     30    25    10        xxx
딸기     25    30    90        xxx
---------------------------------
     xxx   xxx   xxx 
     
     
데이터 입력할때 fruit(사과,100,80,75) 이렇게 넣기

*/