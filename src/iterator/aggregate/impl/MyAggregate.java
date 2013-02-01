package iterator.aggregate.impl;

import java.util.List;

import iterator.aggregate.Aggregate;
import iterator.iterator.Iterator;
import iterator.iterator.impl.MyIterator;;

public class MyAggregate implements Aggregate {

	private List list;
	public MyAggregate(List list){
		this.list = list;
	}
	@Override
	public Iterator creatIterator() {
		Iterator it = (Iterator) new MyIterator(list);
		return it;
	}

}
