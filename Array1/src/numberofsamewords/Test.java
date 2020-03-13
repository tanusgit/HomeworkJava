package numberofsamewords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "php", "android", "sap", "php", "java", "win", "ios", "win", "hana",
				"android", "ios", "ios", "ios");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("java");
		list2.add("java");
		list2.add("java");
		list2.add("php");
		list2.add("php");
		list2.add("sap");
		

		Map<String, Integer> l = findWordCount(list2);
		System.out.println(l);
		
		count(list2);
		

	}

	private static Map<String, Integer> findWordCount(List<String> list) {
		Map<String, Integer> m = new HashMap<>();
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			boolean found = false;
			for (int j = 0; j < m.size(); j++) {
				if ((m.get(j).equals(list.get(i))) ){
					found = true;
				}
				if(!found) {
					//Keep p = new Keep(count++, list.get(i));
					m.put(list.get(i), count++);
				}
			}
		}
		return m;
	}
	
	public static void count(List<String> list) {
		
		int count =0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
			if(list.get(j).equals(list.get(i))) {
				count++;
			}
		}
		System.out.println(list.get(i)+ " " + count);
	}
	
	}
	
	
}
