package facade.client;

import facade.facade.FundOperationOrg;

public class Student implements FundOperationOrg{

	private FundOperationOrg fundOperationOrg;
	
	public Student(FundOperationOrg fundOperationOrg) {
		this.fundOperationOrg = fundOperationOrg;
	}

	@Override
	public void fundOperation() {
		fundOperationOrg.fundOperation();
	}
	
	

}
