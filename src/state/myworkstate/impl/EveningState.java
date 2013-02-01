package state.myworkstate.impl;

import state.myworkstate.State;
import state.work.Work;

public class EveningState implements State {

	@Override
	public void writePragram(Work work) {
		
		if(!work.isFinished()){
			System.out.println("继续工作");
			return;
		}
		System.out.println("下班回家");

	}

}
