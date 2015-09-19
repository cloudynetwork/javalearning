package tut53;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

//		testMap(hashMap);
//		testMap(linkedHashMap);
		testMap(treeMap);
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(3, "swan");
		map.put(8, "llama");
		map.put(1, "bear");
		map.put(5, "snake");
		map.put(2, "dog");
		map.put(0, "mammoth");
		
		for (Integer key: map.keySet()) {
			String value = map.get(key);
			
			System.out.println(key + " Value: " + value);
			
		}
		
	}

}
