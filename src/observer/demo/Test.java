package observer.demo;

import java.util.Observer;

public class Test {

	public static void main(String[] args) {
		//被观察者
		MainServer mainServer = new MainServer();
		
		//观察者
		Observer alarm = new Alarm();
		Observer reserve = new ReserveServer();
		mainServer.addObserver(reserve);
		mainServer.addObserver(alarm);
		
		mainServer.suddenlyDown();
	}

}
