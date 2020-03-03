package genericClass2Homework;

public class Employee extends Person{
	

	@Override
	public String toString() {
		return "Employee [pan=" + pan + ", id=" + id + "]";
	}

	String pan;

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

}
