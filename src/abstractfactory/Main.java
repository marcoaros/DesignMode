package abstractfactory;

import abstractfactory.database.IDepartment;
import abstractfactory.database.IUser;
import abstractfactory.factory.IFactory;
import abstractfactory.factory.impl.SQLFactory;

public class Main {

	/**
	 * 抽象工厂模式，用哪个产品时只要实例化一次，即那个产品的工厂，产品的类名被具体工厂分离了，不会出现在客户代码中
	 * 固定情况：工厂内部实例化已实现的一些接口
	 * 扩展情况：增加一个接口的实现，相应的在工厂内部增加一个接口的实例化
	 * 例子：在表内容和访问表方式一样的前提下，访问不同数据库
	 */
	public static void main(String[] args) {
		
//		IFactory factory = new AccessFactory();
		IFactory factory = new SQLFactory();
		
		IUser user = factory.getUserInterfaceImpl();
		IDepartment department = factory.getDepartmentInterfaceImpl();
		
		user.getUser();
		department.getDepartment();
		
	}

}
