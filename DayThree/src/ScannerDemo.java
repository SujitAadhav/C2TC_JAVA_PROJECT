import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String name = sc.next();
		System.out.println("Enter your income:");
		int income = sc.nextInt();
		System.out.println("Enter your gender:");
		String gender = sc.next();
		System.out.println("Enter you age");
		int age = sc.nextInt();
		
		Person p = new Person();
		p.setName(name);
		p.setIncome(income);
		p.setGender(gender);
		p.setAge(age);
		
		System.out.println("Before tax calculation");
		System.out.println(p);
		
		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(p);
		System.out.println("After tax calculation");
		System.out.println(p);
	}

}
