package findemployee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Findemployee {
public static void main(String[] args) {
	
	Employee e1 = new Employee(1, "Mina", 5000, "D1");
	Employee e2 = new Employee(2, "Minali", 50000, "D2");
	Employee e3 = new Employee(3, "Adi", 5000, "D3");
	Employee e4 = new Employee(4, "Minali", 50000, "D2");
	
	
	/*Map<String, String>map = new HashMap<>();
	map.put("Mina", "D1");
	map.put("Minali", "D2");
	map.put("Adi", "D3");
	map.put("Rith", "D2");*/
	
	List<Employee> list = new ArrayList<>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	
	find(list);
	
	
	
	
	
}







private static void find(List<Employee> list) {
	//keep value in a list and then keep the list in hashmap as a value
	Map<String, String>map = new HashMap<>();
	for(int i = 0; i < list.size(); i++) {
		if(map.containsKey(list.get(i).getDept())){
			map.put(list.get(i).getDept(), list.get(i).getName());
		}
		else {
			map.put(list.get(i).getDept(), list.get(i).getName());
		}
	}
	System.out.println(map);
}
}
