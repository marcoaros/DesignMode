package facade.subsystem.impl;

import facade.subsystem.Investment;

public class Stock implements Investment{

	@Override
	public void investment() {
		System.out.println("买股票");
	}

}
