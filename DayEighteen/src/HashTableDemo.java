import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		Map<String, String> ht = new Hashtable<>();
		ht.put("Sujit", "sujit@gmail.com");
//		ht.put("John", null);
//		ht.put(null, "rohan@gmail.com");
		ht.put("Harish", "harish@gmail.com");
//		ht.put(null, null);
		System.out.println(ht);
	}

}
