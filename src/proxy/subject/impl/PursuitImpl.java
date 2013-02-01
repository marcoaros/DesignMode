package proxy.subject.impl;

import proxy.subject.Pursuit;

public class PursuitImpl implements Pursuit {

	@Override
	public void giveGift() {
		System.out.println("玫瑰给你");

	}

	@Override
	public void sendMessage() {
		System.out.println("我想你了");
	}

}
