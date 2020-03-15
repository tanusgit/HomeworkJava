package multimapInJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;




public class MultimapinJava {
public static void main(String[] args) {
	Map<Employee, List<String>> map = new HashMap<>();
	 
	List<String> values = Arrays.asList("apple", "orange", "kiwi", "mango");
	Employee e1 = new Employee(1, "Mina", 5000, "D1");
	Employee e2 = new Employee(2, "Minali", 50000, "D2");
	Employee e3 = new Employee(3, "Adi", 5000, "D3");
	Employee e4 = new Employee(4, "Minali", 50000, "D2");
	 
	map.put(e1, values);
	map.put(e2, values);
	map.put(e3, values);
	map.put(e4, values);
	System.out.println(map);
	//printMap(map);
	
}

private static void printMap(Map< Employee, List<String>> map) {
	for (Entry<Employee, List<String>> entry : map.entrySet()) {
		Employee key = entry.getKey();
		List<String> value = entry.getValue();
		System.out.println("key= " + key + " , value=" + value);
	}
}
}
