package genericClass2Homework;

public class Student extends Person {
	@Override
	public String toString() {
		return "Student [sem=" + sem + ", id=" + id + "]";
	}

	String sem;

	public String getSem() {
		return sem;
	}

	public void setSem(String sem) {
		this.sem = sem;
	}
}
