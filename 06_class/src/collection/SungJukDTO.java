package collection;

public class SungJukDTO implements Comparable<SungJukDTO> {
	//출력되는 순서대로 선언하는게 좋음
	private int no;
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	
	
	public SungJukDTO (int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		calc();
	}
	
	public void calc() {
		this.tot = kor+eng+math;
		this.avg = (double)tot/3;
	}

	
	//번호      이름      국어      영어      수학      총점      평균
	public int getNo() {
		return no;
	}
	
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
	
	public int getTotal() {
		return tot;
	}
	
	public String getAvg() {
		int intAvg = tot/3;
		if(avg == (double)intAvg) {
			return Integer.toString(intAvg);
		} else {
			return String.format("%.2f", avg);
		}
	}
	
	public String toString() { //상속개념
		return no+"\t"+name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+String.format("%.2f",avg);
	}

	@Override
	public int compareTo(SungJukDTO s1) {
		return this.getName().compareTo(s1.getName());
	}
	
	//총점으로 내림차순	
	/* 내 구현
	@Override
	public int compareTo(SungJukDTO s1) {
		//오름차순
//		if(this.age < p.age) return -1;
//		else if(this.age > p.age) return 1;
//		else return 0;
		
		//내림차순
		if(this.tot < s1.tot) return 1;
		else if(this.tot > s1.tot) return -1;
		else return 0;
	}
	*/
	
	
}


/*
1. 번호(no), 이름(name), 국어(kor), 영어(eng), 수학(math)점수를 입력하여 총점(tot)과 평균(avg)을 구하시오
번호 no
이름 name
국어 kor
영어 eng
수학 math
총점 tot
평균 avg
*/
