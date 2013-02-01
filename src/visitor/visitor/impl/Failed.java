package visitor.visitor.impl;

import visitor.element.impl.Man;
import visitor.element.impl.Woman;
import visitor.visitor.Action;

public class  Failed extends Action{

	public Failed(String state) {
		super(state);
	}

	@Override
	public void getManConlusion(Man man) {
		
		System.out.println("做为" + man.getClass().getSimpleName() + "的" + man.getName() + ",在" + this.state + "时候，会继续努力");
		
	}

	@Override
	public void getWomanConlusion(Woman woman) {

		System.out.println("做为" + woman.getClass().getSimpleName() + "的" + woman.getName() + ",在" + this.state + "时候，会不离不弃");
	}

}
