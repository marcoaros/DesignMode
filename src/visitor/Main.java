package visitor;

import java.io.IOException;

import visitor.element.Person;
import visitor.element.impl.Man;
import visitor.element.impl.Woman;
import visitor.objectstructure.ObjectStructure;
import visitor.visitor.Action;
import visitor.visitor.impl.Failed;
import visitor.visitor.impl.Success;

public class Main {

	/**
	 * 访问者模式，当被访问的类数据结构稳定时，对其的新操作又经常增加，可以把数据结构和作用于该数据结构上的操作进行耦合
	 * 固定情况：被访问者的数据结构
	 * 扩展情况：在访问者数据结构之上的新操作
	 * 例子：模拟男人与女人之间的差别，假如男人与女人的这个类只会有姓名和性别这两个属性
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		ObjectStructure objectStructure = new ObjectStructure();	
		
		Person man = new Man("小明");
		Person woman = new Woman("小红");
		
		objectStructure.addPerson(man);
		objectStructure.addPerson(woman);
		
		Action action1 = new Success("成功");
		objectStructure.display(action1);
		
		Action action2 = new Failed("失败");
		objectStructure.display(action2);
	}
	

}
