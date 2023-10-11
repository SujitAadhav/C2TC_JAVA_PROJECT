package com.cg.goshopping.client;

import com.cg.goshopping.application.GSNormalAcc;
import com.cg.goshopping.application.GSPrimeAcc;
import com.cg.goshopping.application.GSShopFactory;
import com.cg.goshopping.framework.NormalAcc;
import com.cg.goshopping.framework.PrimeAcc;
import com.cg.goshopping.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		ShopFactory sf = new GSShopFactory();
		
		PrimeAcc pa = new GSPrimeAcc(1, "Sujit", 5000, true);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		
		NormalAcc na = new GSNormalAcc(1, "Shiva", 4000, 300);
		na.bookProduct(na.getDeliveryCharge());
		na.toString();
	}

}
