package _for;

public class ForTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수 100개 발생하여 출력하시오.		
		int com = (int)(Math.random()*100);
		System.out.println(com);
		int cnt=0;
		
		// a ~ b 사이의 난수 만들기 그냥 공식임
		//(int)(Math.random() * (b-a+1))+a
		//100개의 문자중에서 'A'가 몇개 나왔는지 출력
		for(int i = 1; i<=100;i++) {
			com = (int)(Math.random() * (90-65+1))+65;
			System.out.print((char)com+" ");
			if(i%10==0) {
				System.out.println();
			}
			if(com=='A') {
				cnt++;
			}
		}
		System.out.println("A의 갯수는 "+cnt);
	}
}
