package command.receiver.impl;

import command.receiver.Receiver;

public class Baker extends Receiver {

	public Baker(String name) {
		super(name);
	}

	@Override
	public void bakeChicken() {

		System.out.println(name + "烤鸡");
	}

	@Override
	public void bakeMutton() {

		System.out.println(name + "烤香菇");
	}

}
