package exception;

public class MakeException extends Exception { //개발자가 만든 Exception 클래스
	private String errorMsg;
	
	public MakeException() {}

	public MakeException(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	@Override
	public String toString() {
		return errorMsg;
	}

}
