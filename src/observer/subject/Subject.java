package observer.subject;

import observer.observer.Observer;

public abstract class Subject {

	public abstract void addObserver(Observer o);
	public abstract void removeObserver(Observer o);
	public abstract void notifyAllObserver(String info);
	
}
