package state.work;

import state.myworkstate.State;

public abstract class Work {

	protected State state;
	protected short currentHour;
	protected boolean finished;
	
	public void  setCurrentHour(short currentHour){
		this.currentHour = currentHour;
	}
	public  short getCurrentHour(){
		return currentHour;
	}
	public  void  setState(State state){
		this.state = state;
	}
	
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	public abstract void  writePragram();
	
	
}
