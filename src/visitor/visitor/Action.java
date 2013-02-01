package visitor.visitor;

import visitor.element.impl.Man;
import visitor.element.impl.Woman;

public abstract class Action {
	
	protected String state;
	
	public Action(String state){
		this.state = state;
	}
	
	

	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public abstract void getManConlusion(Man man);
	public abstract void getWomanConlusion(Woman woman);
	
}
