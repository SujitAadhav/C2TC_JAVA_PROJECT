public class OperatorsDemo {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 10;
		System.out.println(a + " " + b);
//		String d = 2 + "4";
//		int i = 2 + 4;
//		String e = "2"+"4";
//		System.out.println(d);
//		System.out.println(i);
//		System.out.println(e);
		
		++a;
		int d = a++ + b + a--;
		System.out.println(d);
		int x = c++ + a + b--;
		System.out.println(x);
		
		// Ternary Operator
		int f = (c==a)? 1:0;
		System.out.println(f);
		
		// Pre Increment / Pre Decrement
		// 1. Increament/Decrement
		// 2. Assign the result to the variable or for further use
		
		// Post Increment / Post Decrement
		// 1. Assign the value to the variable or for further use
		// 2. Increment/Decrement
	}
}