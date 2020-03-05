package genericClass2InstanceVariable;



public class TestCar {
	public static void main(String[] args) {
		CarGeneric<String, Integer> data = new CarGeneric<>();
		data.setWheel("Nissan");
		data.setColor(4565);
		String str = data.getWheel();
		Integer str2 = data.getColor();
		System.out.println(str);
		//System.out.println(str + " " + "\n" + str2);
		System.out.println("**************************************");
		CarGeneric<Integer, Integer> data1 = new CarGeneric<>();
		data1.setWheel(23);
		data1.setColor(1);
		int d = data1.getWheel();
		int d1 = data1.getColor();
		System.out.println(d);
		System.out.println(d1);
		System.out.println("**************************************");
		CarGeneric<Tesla, Integer> t = new CarGeneric<>();
		Tesla e = new Tesla(4000, 50000);
		//we have use both the set method in the generic class otherwise it says null
		//do we have to use both the set methods in generic class?
		//ans:no
		
		t.setWheel(e); //Tesla from <Tesla, Integer>
		t.setColor(12); //Integer from <Tesla, Integer>
		Integer p = t.getColor();
		Tesla p2 = t.getWheel();
		System.out.println(p);
		System.out.println(p2);
	}
	

}
