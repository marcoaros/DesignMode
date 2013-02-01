package composite.component.impl.leaf;

import composite.component.Company;

public class FinanceDepartment extends Company {

	public FinanceDepartment(String name) {
		super(name);
	}

	@Override
	public void displayDuty() {
		System.out.println(name + ": " + "财务");
	}

	@Override
	public void add(Company company) {
	}

	@Override
	public void displayOrganization(int depth) {
		System.out.println(drawDivisionLine(depth) + " " + name);
	}

	@Override
	public void remove(Company company) {
	}

}
