package composite.component.impl.leaf;

import composite.component.Company;

public class HRDepartment extends Company {

	public HRDepartment(String name) {
		super(name);
	}

	@Override
	public void displayDuty() {
		System.out.println(name + ": " + "招聘");
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
