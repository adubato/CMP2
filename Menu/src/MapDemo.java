import java.util.*;

public class MapDemo {

	public static Map<String, Integer> getMap(int t) {
		switch(t) {
			case 1:
				return new HashMap<String, Integer>();
			case 2:
				return new TreeMap<String, Integer>();
		}
		return new TreeMap<String, Integer>();
	}
	
	public static void popMap(Map<String, Integer> aMap) {
		aMap.put("John",		100);
		aMap.put("Alex",		95);
		aMap.put("Zoe",		88);
		aMap.put("Veronica",	63);
	}
	
	public static int getValue(Map<String, Integer> aMap, String key) {
		Integer value = aMap.get(key);
		if(value == null) return -9999;
		return value;
	}
	
	public static void mapDemo(int t) {
		Map<String, Integer> aMap = getMap(t);
		popMap(aMap);
		String key = "Zoe";
		int value = getValue(aMap, key);
		System.out.println(key + " " + value);
		printMap(aMap);
	}
	
	public static void printMap(Map<String, Integer> imap) {
		System.out.println("Map Type =" + imap.getClass());
		Iterator itr = imap.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> e = (Map.Entry<String, Integer>) itr.next();
			System.out.println(e.getKey() + " " + e.getValue());
		}
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String [] args) {
		mapDemo(1);
		mapDemo(2);
	}
}