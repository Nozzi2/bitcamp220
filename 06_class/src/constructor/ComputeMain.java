package constructor;

class Compute {
	//필드
	private int x,y,sum,sub,mul;
	private double div;
	
	//메소드
	//setter 없이 생성자로 데이터 입력
	public Compute(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public void calc() {
		this.sum = this.x + this.y;
		this.sub = this.x - this.y;
		this.mul = this.x * this.y;
		this.div = (double)this.x / this.y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public int getSum() {
		return sum;
	}
	
	public int getSub() {
		return sub;
	}
	
	public int getMul() {
		return mul;
	}
	
	public String getDiv() {
		return String.format("%.3f", div);
	}
}

//---------------
public class ComputeMain {

	public static void main(String[] args) {
		Compute[] c1 = new Compute[3];
		
		c1[0] = new Compute(320,258);
		c1[1] = new Compute(125,110);
		c1[2] = new Compute(578,312);
		
		
		System.out.println("x\ty\tsum\tsub\tmul\tdiv");
		for(int i=0; i<c1.length;i++) {
			c1[i].calc();
			System.out.print(c1[i].getX()+"\t");
			System.out.print(c1[i].getY()+"\t");
			System.out.print(c1[i].getSum()+"\t");
			System.out.print(c1[i].getSub()+"\t");
			System.out.print(c1[i].getMul()+"\t");
			System.out.print(c1[i].getDiv()+"\t");
			System.out.println();
		}
		
		for(Compute c : c1) {
			c.calc();
			System.out.print(c.getX()+"\t");
			System.out.print(c.getY()+"\t");
			System.out.print(c.getSum()+"\t");
			System.out.print(c.getSub()+"\t");
			System.out.print(c.getMul()+"\t");
			System.out.print(c.getDiv()+"\t");
			System.out.println();
		}
	}
}


/*
[문제] x,y의 합, 차, 곱, 몫

[실행결과]
	x		y		sum		sub		mul		div
	320		258
	125		110
	578		312

sum 합
sub 차
mul 곱
div 몫

*/