package templateMethod.carDemo;

public abstract class AbstractCars {
	
	public abstract void start();
	
	public abstract void stop();
	
	public  void alarm(){};
	
	protected final void action(){
		if(hookMethod()){
			this.start();
			this.alarm();
			this.stop();
		}else{
			this.start();
			this.stop();
		}
	}
	
	/**
	 * 钩子方法
	 * @return
	 */
	protected boolean hookMethod(){
		return true;
	}

}
