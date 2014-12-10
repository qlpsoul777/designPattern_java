package observer.demo;

import java.util.Observable;

public class MainServer extends Observable {
	
	public void suddenlyDown(){
		System.out.println("主服务器突然宕机了");
		super.setChanged();
		super.notifyObservers("主服务器突然宕机了");
	}

}
