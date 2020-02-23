package manyCustomException;

public class AgeException extends Exception {

	String msg;
	String error;

	public AgeException(String msg, String error) {
		super();
		this.msg = msg;
		this.error = error;
	}

	@Override
	public String toString() {
		return "AgeException [msg=" + msg + ", error=" + error + "]";
	}

}
