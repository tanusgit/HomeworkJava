package homeworkException;
//new custom exception class must extend Exception
public class WrongData extends Exception {
	String msg;
	String error;
	public WrongData(String msg, String error) {
		super();
		this.msg = msg;
		this.error = error;
	}
	
	

}
