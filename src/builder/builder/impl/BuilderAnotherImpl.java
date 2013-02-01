package builder.builder.impl;

import builder.builder.Builder;

public class BuilderAnotherImpl extends Builder {

	@Override
	public void buildBody() {
		System.out.println("画一个瘦脸");
	}

	@Override
	public void buildHead() {
		System.out.println("画一个瘦小的身体");

	}

}
