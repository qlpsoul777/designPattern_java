package templateMethod;

public class Bicycle extends AbstractCars {

	public void start() {
		System.out.println("用脚蹬，开始前进");
	}

	public void stop() {
		System.out.println("停止蹬车，车停下来");

	}
	
	protected boolean hookMethod(){
		return false;
	}

}
