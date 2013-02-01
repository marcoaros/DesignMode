package decorator.decorator.impl;

import decorator.decorator.Dress;

public class Jacket extends Dress {

	@Override
	public void getDressed() {
		System.out.println("夹克");
		super.getDressed();
	}

}
