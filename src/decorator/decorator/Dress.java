package decorator.decorator;

import decorator.component.MakeUpAction;

public abstract class Dress implements MakeUpAction {

	public MakeUpAction makeUpAction;
	
	public void decorator(MakeUpAction makeUpAction){
		this.makeUpAction = makeUpAction;
	}
	@Override
	public void getDressed() {
		if(makeUpAction != null){
			makeUpAction.getDressed();
		}
	}

}
