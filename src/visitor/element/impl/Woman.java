package visitor.element.impl;

import visitor.element.Person;
import visitor.visitor.Action;

public class Woman extends Person {

	public Woman(String name) {
		super(name);
	}

	@Override
	public void acceptVisitors(Action action) {

		action.getWomanConlusion(this);
	}


}
