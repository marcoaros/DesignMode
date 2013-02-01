package state.myworkstate.impl;

import state.myworkstate.State;
import state.work.Work;

public class AfternoonState implements State {

	@Override
	public void writePragram(Work work) {
		
		if(work.getCurrentHour()>= 18){
			work.setState(new EveningState());
			work.writePragram();
			return;
		}
		
		System.out.println("下午精力充沛");
	}

}
