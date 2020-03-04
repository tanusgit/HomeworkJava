package genericClass2InstanceVariable;



public class TestCar {
	public static void main(String[] args) {
		CarGeneric<String> data = new CarGeneric<String>();
		data.setWheel("Nissan");
		data.setColor("Blue");
		String str = data.getWheel();
		String str2 = data.getColor();
		System.out.println(str + " " + "\n" + str2);
		System.out.println("**************************************");
		CarGeneric<Integer> data1 = new CarGeneric<Integer>();
		data1.setWheel(23);
		data1.setColor(1);
		int d = data1.getWheel();
		int d1 = data1.getColor();
		System.out.println(d);
		System.out.println(d1);
		System.out.println("**************************************");
		CarGeneric<Tesla> t = new CarGeneric<Tesla>();
		Tesla e = new Tesla(4000, 50000);
		t.setWheel(e);
		t.setColor(e);
		Tesla p = t.getColor();
		Tesla p2 = t.getWheel();
		System.out.println(p);
		System.out.println(p2);
	}
	

}
