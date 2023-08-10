
public class TaxCalculation {
	
	public void calculateTax(Person person) {
		if(person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
			person.setTax(0);
			System.out.println("Tax is not applicable");
		}else {
//			The tax rates for FY 2023-24, as per the new tax regime
			if(person.getIncome() <= 300000) {
				person.setTax(0);
			}
			else if(person.getIncome() > 300000 && person.getIncome() <= 600000) {
				person.setTax((person.getIncome() - 300000) * 5/100);
			}
			else if(person.getIncome() > 600000 && person.getIncome() <= 900000) {
				person.setTax((person.getIncome() - 600000) * 10/100);
			}
			else if(person.getIncome() > 900000 && person.getIncome() <= 1200000) {
				person.setTax((person.getIncome() - 900000) * 15/100);
			}
			else if(person.getIncome() > 1200000 && person.getIncome() <= 1500000) {
				person.setTax((person.getIncome() - 1200000) * 20/100);
			}
			else {
				person.setIncome((person.getIncome() - 1500000) * 30/100);
			}
		}
	}
}
