package com.cg.goshopping.application;

import com.cg.goshopping.framework.NormalAcc;
import com.cg.goshopping.framework.PrimeAcc;
import com.cg.goshopping.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNm, charges, isPrime);
		return gsprime;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharge) {
		NormalAcc gsnormal = new NormalAcc(accNo, accNm, deliveryCharge, deliveryCharge);
		return gsnormal;
	}

}
