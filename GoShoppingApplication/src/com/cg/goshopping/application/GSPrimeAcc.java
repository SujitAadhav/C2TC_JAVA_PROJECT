package com.cg.goshopping.application;

import com.cg.goshopping.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}

	public void bookProduct(float charges) {
		System.out.println("Dear prime user...!!! Your charges: " + charges + " delivery chages are: " + getDeliverycharges());
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
