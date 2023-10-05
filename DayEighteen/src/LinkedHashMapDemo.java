import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, String> lhm = new LinkedHashMap<>();
		lhm.put("Sujit", "sujit@gmail.com");
		lhm.put("John", null);
		lhm.put(null, "rohan@gmail.com");
		lhm.put("Harish", "harish@gmail.com");
		lhm.put(null, null);
		System.out.println(lhm);
	}

}
