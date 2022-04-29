package _class;

class SungJuk {
	//필드
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	
	
	//메소드
	//setName, setJumsu(kor,eng,mat)
	public void setName(String n) {
		name = n;
	}
	
	public void setKor(int a) {
		kor =a;
	}
	public void setEng(int a) {
		eng =a;
	}
	public void setMath(int a) {
		math =a;
	}
	
	//tot, avg 계산
	public void calc() {
		tot = kor+eng+math;
		avg = (double)tot/3;
	}
	
	
	//getName, getJumsu, getTot, getAvg
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTot() {
		return tot;
	}
	
	public String getAvg() { //소수 둘째자리에서 자르기 위해서 반환 데이터형을 String으로 바꿨음
		return String.format("%.2f", avg);
	}
}

//---------------------------------------------------------------
public class SungJukMain {

	public static void main(String[] args) {
		
		SungJuk hong = new SungJuk();
		hong.setName("홍길동");
		hong.setKor(90);
		hong.setEng(96);
		hong.setMath(100);
		hong.calc();
		
		
		SungJuk lion = new SungJuk();
		lion.setName("라이언");
		lion.setKor(100);
		lion.setEng(89);
		lion.setMath(75);
		lion.calc();
		
		
		SungJuk apeach = new SungJuk();
		apeach.setName("어피치");
		apeach.setKor(75);
		apeach.setEng(80);
		apeach.setMath(48);
		apeach.calc();
		
		
		System.out.println("이름\t"+"국어\t"+"영어\t"+"수학\t"+"총점\t"+"평균\t");
		System.out.println(hong.getName()+"\t"+
						   hong.getKor()+"\t"+
						   hong.getEng()+"\t"+
						   hong.getMath()+"\t"+
						   hong.getTot()+"\t"+
						   hong.getAvg()+"\t");
		System.out.println(lion.getName()+"\t"+
						   lion.getKor()+"\t"+
						   lion.getEng()+"\t"+
						   lion.getMath()+"\t"+
						   lion.getTot()+"\t"+
						   lion.getAvg()+"\t");
		System.out.println(apeach.getName()+"\t"+
						   apeach.getKor()+"\t"+
						   apeach.getEng()+"\t"+
						   apeach.getMath()+"\t"+
						   apeach.getTot()+"\t"+
						   apeach.getAvg()+"\t");
	}

}


/*
---------------------------------------------------
이름      국어      영어      수학      총점      평균   
---------------------------------------------------
홍길동     90       96      100						>>> p1
라이언     100      89      75						>>> p2
어피치     75       80      48						>>> p3
---------------------------------------------------
클래스로 구현해보기

클래스는 무조건 1인분으로 설정한다.
그러니까 SungJuk p1은 홍길동
그러니까 SungJuk p2은 라이언
그러니까 SungJuk p3은 어피치



*/