package observer.demo;

import java.util.Observable;
import java.util.Observer;

public class Alarm implements Observer {

	public void update(Observable o, Object arg) {
		System.out.println("报警器得到消息："+arg.toString());
		System.out.println("报警器开始报警");
		System.out.println("-------------");
	}

}
