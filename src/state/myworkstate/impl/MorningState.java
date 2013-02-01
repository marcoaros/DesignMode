package state.myworkstate.impl;

import state.myworkstate.State;
import state.work.Work;

public class MorningState implements State {

	@Override
	public void writePragram(Work work) {

		if(work.getCurrentHour() >= 12){
			work.setState(new AfternoonState());
			work.writePragram();
			return;
		}
		
		System.out.println("上午思路清晰");
	}

}
