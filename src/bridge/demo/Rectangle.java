package bridge.demo;

public class Rectangle extends Shape {

	public void draw() {
		this.colorImpl.setColor();
		System.out.println("矩形");
	}

}
