import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public  class Main {
    public static void main(String[] args) {
   	
    	Scanner in = new Scanner(System.in);
    	int c = 0;
    	Map<String, Map<String, Integer>> arr = new TreeMap<String, Map<String, Integer>>();
    	while (in.hasNext()) {
    		c++;
    		String name = in.next();
    		String item = in.next();
    		Integer count = in.nextInt();
    		if (arr.containsKey(name)) {
    			if (arr.get(name).containsKey(item)) {
    				//System.out.println(arr.get(name));
    				int temp = arr.get(name).get(item).intValue();
    				arr.get(name).remove(item);
    				arr.get(name).put(item, temp + count);
    			} else {
    				arr.get(name).put(item, count);
    				//System.out.println(arr.get(name));
    			}
    		} else {
    			arr.put(name, new TreeMap<String, Integer>());
    			arr.get(name).put(item, count);
    		}
    	}
    	
    	for (Map.Entry<String, Map<String, Integer>> item : arr.entrySet()) {
    		System.out.println(item.getKey() + ":");
    		for (Map.Entry<String, Integer> e : item.getValue().entrySet()) {
    			System.out.println(e.getKey() + " " + e.getValue());
    		}
    	}
    }
}