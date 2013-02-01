package iterator.iterator.impl;

import java.util.List;

import iterator.iterator.Iterator;

public class MyIterator implements Iterator {

	private List list;
	private int count;

	public MyIterator(List list) {
		this.list = list;
		count = 0;
	}

	@Override
	public Object currentItem() {
		if(hasNext()){
			return list.get(count);
		}
		return null;
	}

	@Override
	public Object first() {
		if(hasNext()){
			return list.get(0);
		}
		return null;
	}

	@Override
	public boolean hasNext() {
		if(count < list.size()){
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		count++;
		if(hasNext()){
			return list.get(count);
		}
		return null;
	}

}
