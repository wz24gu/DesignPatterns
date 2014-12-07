package org.designpatterns.observer;

public interface Publisher {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();

}
