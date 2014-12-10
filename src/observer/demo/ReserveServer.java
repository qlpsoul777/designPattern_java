package observer.demo;

import java.util.Observable;
import java.util.Observer;

public class ReserveServer implements Observer {

	public void update(Observable o, Object arg) {
		System.out.println("从服务器得到消息："+arg.toString());
		System.out.println("从服务器开始接替主服务器继续工作");
		System.out.println("-------------");
	}

}
