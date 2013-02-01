package mediator.mediator;

import java.util.HashMap;
import java.util.Map;

import mediator.colleague.Country;

public class UnitedNations {

//	private Country accuser;
//
//	private Country defendant;
//	
//	public Country getAccuser() {
//		return accuser;
//	}
//
//	public void setAccuser(Country accuser) {
//		this.accuser = accuser;
//	}
//
//	public Country getDefendant() {
//		return defendant;
//	}
//
//	public void setDefendant(Country defendant) {
//		this.defendant = defendant;
//	}
	
	public void sendMessage(Country country,String message){
		
		Country c = (Country) controller.get(country);
		
		if(c != null){
			c.readMessage(message);
		}
		
//		if(country == accuser){
//			defendant.readMessage(message);
//		}else if(country == defendant){
//			accuser.readMessage(message);
//		}
	}
	
	private Map controller = new HashMap();
	
	
	public Map getController() {
		return controller;
	}

	public void setController(Map controller) {
		this.controller = controller;
	}

	public void addCommand(Country country1, Country country2){
		controller.put(country1, country2);
	}
    


}
