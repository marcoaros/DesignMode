package abstractfactory.database.access;

import abstractfactory.database.IDepartment;

public class AccessDepartment implements IDepartment {

	@Override
	public void getDepartment() {
		System.out.println("访问Access的Department表");

	}

}
