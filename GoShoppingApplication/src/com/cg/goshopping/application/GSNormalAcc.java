package com.cg.goshopping.application;

import com.cg.goshopping.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	
	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
	}
	
	public void bookProduct(float diliveryCharges) {
		System.out.println("Dear non-prime user...!!! Your charges: " + getCharges() + " delivery charges are: " + diliveryCharges);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
	
}
