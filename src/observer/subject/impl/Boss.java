package observer.subject.impl;

import java.util.ArrayList;
import java.util.List;

import observer.observer.Observer;
import observer.subject.Subject;

public class Boss extends Subject {


	List<Observer> observerList = new ArrayList<Observer>();
	@Override
	public void addObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void notifyAllObserver(String info) {
        for(int i = 0; i < observerList.size(); i++){
        	observerList.get(i).reaction(info);
        }
	}

	@Override
	public void removeObserver(Observer o) {
		observerList.remove(o);
	}

}
