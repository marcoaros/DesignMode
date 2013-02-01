package mediator.colleague.impl;

import mediator.colleague.Country;
import mediator.mediator.UnitedNations;

public class Iraq extends Country {

	public Iraq(UnitedNations unitedNations) {
		super(unitedNations);
	}

	@Override
	public void readMessage(String message) {

		System.out.println("伊拉克获得对方信息 ：" + message);
	}

	@Override
	public void sendMessage(String message) {

		this.unitedNations.sendMessage(this, message);
	}

}
