package com.cg.goshopping.framework;

public abstract class ShopAcc {
	
	private int accNo;
	private String accNm;
	private float charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.setCharges(charges);
	}

	public void bookProduct(float charges) {
		System.out.println("Product is booked and charges are: " + charges);
	}
	
	public void items(float charges) {
		System.out.println("Item is delivered and chages are: " + charges);
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + getCharges() + "]";
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	
}
