package strategy.algorithm.impl;

import strategy.algorithm.ComputeAmount;

public class ComputeAmoutInOrignalPrice extends ComputeAmount {
	@Override
	public String computeAmount(double price) {
		return Double.toString(price);
	}

}
