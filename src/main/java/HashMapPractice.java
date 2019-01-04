import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {
	public static void main(String[] args) {
		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		hm.put(100, "Hundred");
		hm.put("Peal", 732);
		hm.put(6.7, "Rubel");
		Set<Entry<Object,Object>> khadija= hm.entrySet();
		Iterator<Entry<Object, Object>> i =khadija.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next().getKey() + "      " + i.next().getValue());
		}
		
	}

}
