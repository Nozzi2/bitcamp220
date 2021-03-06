package _interface;

public class ExaminationDTO {
	String name,dap;
	char[] ox;
	int score;
	public static final String JUNG = "11111";
	
	public ExaminationDTO(String name, String dap) {
		this.name = name;
		this.dap = dap;
		compare();
	}
	
	public void compare() {
		ox = new char[5];
		for(int i=0; i<ox.length; i++) {
			if(dap.charAt(i) == JUNG.charAt(i)) {
				score++;
				ox[i] = 'O';
			} else {
				ox[i] = 'X';
			}
		}
		score = score*20;
	}

	//setter
	public void setName(String name) {
		this.name = name;
	}

	public void setDap(String dap) {
		this.dap = dap;
	}

	//getter
	public String getName() {
		return name;
	}

	public String getDap() {
		return dap;
	}

	public char[] getOx() {
		return ox;
	}

	public int getScore() {
		return score;
	}
	
	@Override
	public String toString() {
		return name+"\t"+ox[0]+" "+ox[1]+" "+ox[2]+" "+ox[3]+" "+ox[4]+"   "+score;
	}
}

/*
클래스    : ExaminationDTO.java
			- 필드 : String name (이름)
					String dap
			      	char[] ox
			      	score 
			      	public static final String JUNG = "11111"; (미리 정답을 입력해놓기)
			- 메소드 : 생성자, setter / getter, compare()
*/