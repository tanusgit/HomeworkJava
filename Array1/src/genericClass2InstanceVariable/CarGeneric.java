package genericClass2InstanceVariable;
//generic class with 2 instance variables
public class CarGeneric<T,E>{
	//if T means String then color and and wheel both would be string
	//solved the problem with <T,E>
	private T wheel;
	private E color;
	
	public T getWheel() {
		return wheel;
	}
	
	public E getColor() {
		return color;
	}
	
	public void setColor(E c) {
		color = c;
	}
	
	public void setWheel(T w) {
		wheel = w;
	}

}
