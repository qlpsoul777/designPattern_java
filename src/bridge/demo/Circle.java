package bridge.demo;

public class Circle extends Shape {

	public void draw() {
		this.colorImpl.setColor();
		System.out.println("圆形");
	}

}
