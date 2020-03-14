package numberofsamewords;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java", "php", "android", "sap", "php", "java", "win", "ios", "win", "hana",
				"android", "ios", "ios", "ios");
		
			find(list);
	}

	private static void find(List<String> list) {
		Map<String, Integer>map = new HashMap<>();
		int count = 1;
		for(int i = 0; i <list.size(); i++) {
			if(map.containsKey(list.get(i))) {
				map.put(list.get(i), count+1);
			}
			else {
				map.put(list.get(i), count);
			}
		}
		System.out.println(map);
		
	}
	
}
