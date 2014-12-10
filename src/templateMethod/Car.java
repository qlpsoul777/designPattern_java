package templateMethod;

public class Car extends AbstractCars {

	public void start() {
		System.out.println("按按钮，一键启动，车开始前进");
	}

	public void stop() {
		System.out.println("踩刹车，车停止前进");
	}
	
	public void alarm(){
		System.out.println("转弯，鸣笛");
	}

}
