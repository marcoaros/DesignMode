package observer.observer.impl;

import observer.observer.Observer;

public class PhoneCaller extends Observer {

	@Override
	public void reaction(String info) {
		System.out.println("To PhoneCaller:" + info);
	}

}
