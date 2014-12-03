package bridge.demo;

public class Triangle extends Shape{

	public void draw() {
		this.colorImpl.setColor();
		System.out.println("三角形");
	}

}
