package abstractfactory.factory.impl;

import abstractfactory.database.IDepartment;
import abstractfactory.database.IUser;
import abstractfactory.database.access.AccessDepartment;
import abstractfactory.database.access.AccessUser;
import abstractfactory.factory.IFactory;

public class AccessFactory implements IFactory {

	@Override
	public IDepartment getDepartmentInterfaceImpl() {
		return new AccessDepartment();
	}

	@Override
	public IUser getUserInterfaceImpl() {
		return new AccessUser();
	}

}
