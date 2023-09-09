
public class Validation {

	public static void validate(int age, int weight) throws InvalidBloodDonateException{
		if(age<18 || weight<60)
			throw new InvalidBloodDonateException("Not eligible");
		else
			System.out.println("You are eligible to donate blood");
	}
}
