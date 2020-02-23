package manyCustomException;

public class SalaryException extends Exception{
	String msg;
	String error;
	public SalaryException(String msg, String error) {
		super();
		this.msg = msg;
		this.error = error;
	}
	@Override
	public String toString() {
		return "SalaryException [msg=" + msg + ", error=" + error + "]";
	}
	

}
