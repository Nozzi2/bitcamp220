package _class;

public class SungJukMain2 {

	public static void main(String[] args) {
		
		SungJuk[] ar = new SungJuk[3]; //데이터형이 객체인 '배열'생성 (객체 생성 아님!)
		System.out.println(ar);
		ar[0] = new SungJuk(); //객체 생성. 새로 메모리 할당 후 메모리 주솟값 ar[0]에 저장
		ar[1] = new SungJuk(); //객체 생성. 새로 메모리 할당 후 메모리 주솟값 ar[1]에 저장
		ar[2] = new SungJuk(); //객체 생성. 새로 메모리 할당 후 메모리 주솟값 ar[2]에 저장
		
		ar[0].setName("홍길동");
		ar[0].setKor(90);
		ar[0].setEng(96);
		ar[0].setMath(100);

		ar[1].setName("라이언");
		ar[1].setKor(100);
		ar[1].setEng(89);
		ar[1].setMath(75);
		
		ar[2].setName("어피치");
		ar[2].setKor(75);
		ar[2].setEng(80);
		ar[2].setMath(48);

		System.out.println("이름\t"+"국어\t"+"영어\t"+"수학\t"+"총점\t"+"평균\t");
		for(int i=0; i<ar.length;i++) {
			ar[i].calc();
			System.out.println(ar[i].getName()+"\t"+
							   ar[i].getKor()+"\t"+
							   ar[i].getEng()+"\t"+
							   ar[i].getMath()+"\t"+
							   ar[i].getTot()+"\t"+
							   ar[i].getAvg()+"\t");
		}
		
		
		
	}

}
