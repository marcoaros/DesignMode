package decorator;

import decorator.component.impl.Person;
import decorator.decorator.Dress;
import decorator.decorator.impl.Jacket;
import decorator.decorator.impl.Pants;

public class Main {

	/**
	 * 装饰模式
	 * 固定情况：装饰者和被装饰者完成某些相同的动作
	 * 扩展情况：可以任意为被装饰者扩展特定的功能，被扩展的功能有顺序的执行
	 * 例子：模拟动态的搭配衣
	 */
	public static void main(String[] args) {

		Person person = new Person("小明");

		Dress jacket = new Jacket();
		Dress pants = new Pants();
		
		jacket.decorator(person);
		pants.decorator(jacket);
		
		pants.getDressed();
	}

}
