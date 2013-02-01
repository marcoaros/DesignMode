package mediator.colleague;

import mediator.mediator.UnitedNations;

public abstract class Country {

	protected UnitedNations unitedNations;
	
	public Country(UnitedNations unitedNations){
		this.unitedNations = unitedNations;
	}
	
	public abstract void sendMessage(String message);
	
	public abstract void readMessage(String message);
}
