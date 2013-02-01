package decorator.decorator.impl;

import decorator.decorator.Dress;

public class Pants extends Dress {
	@Override
	public void getDressed() {
		System.out.println("裤子");
		super.getDressed();
	}
}
