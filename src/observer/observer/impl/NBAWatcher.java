package observer.observer.impl;

import observer.observer.Observer;

public class NBAWatcher extends Observer {

	@Override
	public void reaction(String info) {
		System.out.println("To NBAWatcher:" + info);
	}

}
