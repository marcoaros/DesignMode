package facade.subsystem.impl;

import facade.subsystem.Investment;

public class NationalDebt implements Investment {

	@Override
	public void investment() {
		System.out.println("买国债");
	}

}
