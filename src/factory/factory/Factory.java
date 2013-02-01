package factory.factory;

public class Factory {

	static public Object createBeans(String beanName) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		 return  Class.forName(beanName).newInstance();
	}
	
}