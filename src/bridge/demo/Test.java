package bridge.demo;

public class Test {

	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.colorImpl = new Red();
		circle.draw();
		circle.colorImpl = new Blue();
		circle.draw();
		circle.colorImpl = new Green();
		circle.draw();
		
		circle = new Triangle();
		circle.colorImpl = new Red();
		circle.draw();
		circle.colorImpl = new Blue();
		circle.draw();
		circle.colorImpl = new Green();
		circle.draw();
		
		circle = new Rectangle();
		circle.colorImpl = new Red();
		circle.draw();
		circle.colorImpl = new Blue();
		circle.draw();
		circle.colorImpl = new Green();
		circle.draw();
	}

}
