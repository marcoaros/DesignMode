package bridge.abstraction;

import bridge.implementor.CellPhoneSoft;

public abstract class CellPhoneBand {
	
	private CellPhoneSoft cellPhoneSoft;
	
	public CellPhoneSoft getCellPhoneSoft() {
		return cellPhoneSoft;
	}



	public void setCellPhoneSoft(CellPhoneSoft cellPhoneSoft) {
		this.cellPhoneSoft = cellPhoneSoft;
	}



	public abstract void run();

}
