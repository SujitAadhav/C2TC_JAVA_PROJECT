
public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Widening Casting (Automatically) - converting a smaller size to a larger type size
		byte a = 127; // 1 byte range - 128 to 128
		short b = a; 
		System.out.println(b);
		
		short c = 32767; // 2 bytes range -32,768 to 32,767
		int d = c;
		System.out.println(d);
		
		int e = 2147483647; // 4 bytes range -2,147,483,648 to 2,147,483, 647;
		long f = e;
		System.out.println(f);
	}

}
