package factory;

import factory.factory.Factory;
import factory.object.Operation;

public class Main {

	/**
	 * 工厂模式，工厂方法模式
	 * 固定情况：父类的抽象方法,Java的反射机制
	 * 扩展情况：增加子类
	 * 例子：模拟简单计算器
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Operation operation = (Operation) Factory.createBeans("factory.object.impl.OperationPlus");
		
        double a = 1;
        double b = 1;
        
        String c = operation.getResult(a, b);
        
        System.out.println(c);
	}

}
