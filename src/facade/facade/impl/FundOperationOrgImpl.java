package facade.facade.impl;

import facade.facade.FundOperationOrg;
import facade.subsystem.impl.NationalDebt;
import facade.subsystem.impl.Stock;

public class FundOperationOrgImpl implements FundOperationOrg {

	private NationalDebt nationalDebt = new NationalDebt();
	private Stock stock = new Stock();
	
	@Override
	public void fundOperation() {
		nationalDebt.investment();
		stock.investment();
	}

}
