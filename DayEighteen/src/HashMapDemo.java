import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<>();
		//key should be unique, value - can be duplicate
		hm.put("Let us C", 320);
		hm.put("The complete reference C++", 450);
		hm.put("The complete reference Java", 487);
		hm.put("Python Programming", 599);
		hm.put("Application Development using Spring Boot", 600);
		System.out.println(hm);
		
		Set set=hm.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
//			System.out.println(me.getValue());
//			System.out.println(me.getKey());
			System.out.println(me);
		}
		
		Map<String, String> hmOne = new HashMap();
		hmOne.put("Sujit", "sujit@gmail.com");
		hmOne.put("John", null);
		hmOne.put(null, "rohan@gmail.com");
		hmOne.put("Harish", "harish@gmail.com");
		hmOne.put(null, null);
		System.out.println(hmOne);
		
		
		Map<String, Student> hmTwo = new HashMap();
		hmTwo.put("Sujit", new Student(1, "Amit"));
		hmTwo.put("Gaurav", new Student(1, "Pranav"));
		hmTwo.put("Sindu", new Student(1, "Devangi"));
		System.out.println(hmTwo);
	}

}
