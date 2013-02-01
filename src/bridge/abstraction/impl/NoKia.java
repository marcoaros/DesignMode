package bridge.abstraction.impl;

import bridge.abstraction.CellPhoneBand;

public class NoKia extends CellPhoneBand {

	@Override
	public void run() {
		if(this.getCellPhoneSoft() != null){
			this.getCellPhoneSoft().run();
		}
		
	}

}
