package abstractfactory.factory.impl;

import abstractfactory.database.IDepartment;
import abstractfactory.database.IUser;
import abstractfactory.database.sql.SQLDepartment;
import abstractfactory.database.sql.SQLUser;
import abstractfactory.factory.IFactory;

public class SQLFactory implements IFactory {

	@Override
	public IDepartment getDepartmentInterfaceImpl() {
		return new SQLDepartment();
	}

	@Override
	public IUser getUserInterfaceImpl() {
		return new SQLUser();
	}

}
