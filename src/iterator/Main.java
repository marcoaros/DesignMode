package iterator;

import iterator.aggregate.impl.MyAggregate;
import iterator.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * 迭代模式，提供一种方法顺序访问一个聚合对象中的各个元素，而又不暴露对象的内部表示
	 * 固定情况：每个想被统一的聚集对象内应该提供一个迭代器，迭代器有些基本的访问方法
	 * 扩展情况：迭代器可以有不同的实现
	 * 例子：统一访问一个列表
	 */
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String> ();
		list.add("孙悟空");
		list.add("猪八戒");
		list.add("沙和尚");
		
		MyAggregate myAggregate = new MyAggregate(list);
		Iterator iterator =  (Iterator) myAggregate.creatIterator();
		
		while(iterator.hasNext()){
			String name = (String) iterator.currentItem();
			System.out.println(name);
			
			iterator.next();
		}
		
	}

}
