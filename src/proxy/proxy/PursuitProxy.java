package proxy.proxy;

import proxy.subject.Pursuit;

public class PursuitProxy implements Pursuit {

	private Pursuit pursuit;
	
	public PursuitProxy(Pursuit pursuit) {
		this.pursuit = pursuit;
	}

	@Override
	public void giveGift() {
		pursuit.giveGift();
	}

	@Override
	public void sendMessage() {
		pursuit.sendMessage();
	}

}
