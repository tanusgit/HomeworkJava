package manyCustomException;

public class PhoneException extends Exception{
	String msg;
	String error;
	public PhoneException(String msg, String error) {
		super();
		this.msg = msg;
		this.error = error;
	}
	@Override
	public String toString() {
		return "PhoneException [msg=" + msg + ", error=" + error + "]";
	}
	
	

}
