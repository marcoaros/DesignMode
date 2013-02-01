package visitor.element.impl;

import visitor.element.Person;
import visitor.visitor.Action;

public class Man extends Person {

	public Man(String name) {
		super(name);
	}

	@Override
	public void acceptVisitors(Action action) {

		action.getManConlusion(this);
	}

}
