package strategy.algorithm.impl;

import strategy.algorithm.ComputeAmount;

public class ComputeAmoutInDiscount extends ComputeAmount {

	private double discountRadio = 0.7;
	
	
	public double getDiscountRadio() {
		return discountRadio;
	}


	public void setDiscountRadio(double discountRadio) {
		this.discountRadio = discountRadio;
	}

	@Override
	public String computeAmount(double price) {
		return Double.toString(price * discountRadio);
	}

}
