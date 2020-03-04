package genericClass2InstanceVariable;

public class CarGeneric<T>{
	private T wheel;
	private T color;
	
	public T getWheel() {
		return wheel;
	}
	
	public T getColor() {
		return color;
	}
	
	public void setColor(T c) {
		color = c;
	}
	
	public void setWheel(T w) {
		wheel = w;
	}

}
