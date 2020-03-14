package numberofsamewords;

import java.util.HashMap;
import java.util.Map;

public class Test2HashMap {
public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<>();
	//Hashmap<key,value>
	map.put("Mango", 1);
	map.put("oragnge", 5);
	map.put("banana", 6);
	map.put("apple", 4);
	System.out.println(map);
	boolean res = map.containsKey("Mango");
	//map.get() takes key and return the value
	System.out.println(map.get("banana"));
	System.out.println(res);
	
	System.out.println("***********************************************");
	Map<Integer, String> map2 = new HashMap<>();
	//Hashmap<key,value>
	map2.put( 1, "java");
	map2.put( 5, "php");
	map2.put(6, "java");
	map2.put(4, "php");
	System.out.println(map2);
	boolean res2 = map2.containsKey(1);
	//map.get() takes key and return the value
	System.out.println(map2.get(5));
	System.out.println(res2);
	
}
}
