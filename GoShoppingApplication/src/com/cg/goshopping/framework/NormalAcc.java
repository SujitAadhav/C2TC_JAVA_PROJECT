package com.cg.goshopping.framework;

public class NormalAcc extends ShopAcc{
	
	private final float deliveryCharge;
	
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge=deliveryCharge;
	}

	public float getDeliveryCharge() {
		return deliveryCharge;
	}

	public void bookProduct(float deliveryCharge) {
		System.out.println("Charges: " + deliveryCharge);
	}
	
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + "]";
	}




	
}
