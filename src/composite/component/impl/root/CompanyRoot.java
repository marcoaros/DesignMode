package composite.component.impl.root;

import java.util.ArrayList;
import java.util.List;

import composite.component.Company;

public class CompanyRoot extends Company {

	public CompanyRoot(String name) {
		super(name);
	}

	private List<Company> children = new ArrayList<Company>();

	public void add(Company company) {
		children.add(company);
	}

	public void remove(Company company) {
		children.remove(company);
	}

	@Override
	public void displayOrganization(int depth) {
		
		System.out.println(drawDivisionLine(depth) + " " + name);
		
		for (Company company : children) {
			company.displayOrganization(depth + 2);
		}
	}

	@Override
	public void displayDuty() {
		for (Company company : children) {
			company.displayDuty();
		}
	}

}
