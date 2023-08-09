
public class Customer {
	private int customerId;
	private String customerName;
	private String customerCity;
	
	
	void display() {
		
	}
	
	// User Defined Constructor - no argument  
	Customer(){
		System.out.println("In user defined no argument constructor");
	}
	
	// User Defined Constructor - parameterised/argumented constructor
	Customer(int id, String name, String city){
		customerId=id;
		customerName=name;
		customerCity=city;
	}
	
	// Constructor:
	// 1. Special Method
	// 2. Methods - Has return type; Constructor doesn't return type
	// 3. Method name - can be any valid name; constructor name- always be same as your class name
	// 4. Method - manually invoked using object reference; constructor automatically invoked
	// 5. Constructor - automatically invoked at the time of object creation
	// 6. Default - no argument constructor
	// 7. User Defined - no argument constructor and parameterised constructor/argumented constructor
	
	// Methods
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + ", getCustomerId()=" + getCustomerId() + ", getCustomerName()=" + getCustomerName()
				+ ", getCustomerCity()=" + getCustomerCity() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
