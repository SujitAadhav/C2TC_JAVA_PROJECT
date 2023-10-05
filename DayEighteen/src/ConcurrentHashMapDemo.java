import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<>();
		chm.put(100, "Hello");
		chm.put(101, "How are you?");
		chm.put(102, "Fine");
		
		System.out.println(chm);
		
		chm.putIfAbsent(103, "Hello");
		System.out.println(chm);
		
		chm.remove(101, "How are you?");
		System.out.println(chm);
		
		chm.replace(100, "Hello", "For");
		System.out.println(chm);
	}

}
