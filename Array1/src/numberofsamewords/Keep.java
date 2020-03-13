package numberofsamewords;

public class Keep {
	int count;
	String name;

	public int getNum() {
		return count;
	}

	public void setNum(int num) {
		this.count = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Keep(int num, String name) {
		super();
		this.count = num;
		this.name = name;
	}

	@Override
	public String toString() {
		return "[num=" + count + ", name=" + name + "]";
	}

}
