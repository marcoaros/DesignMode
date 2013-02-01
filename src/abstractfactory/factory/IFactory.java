package abstractfactory.factory;

import abstractfactory.database.IDepartment;
import abstractfactory.database.IUser;

public interface IFactory {

	public IUser getUserInterfaceImpl();
	
	public IDepartment getDepartmentInterfaceImpl();
}
