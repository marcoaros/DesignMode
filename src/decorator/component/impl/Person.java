package decorator.component.impl;

import decorator.component.MakeUpAction;

public class Person implements MakeUpAction {

	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Person(String name){
		this.name = name;
	}
	
	@Override
	public void getDressed() {
		
		System.out.println(name);
	}

}
