package templateMethod;

public class Test {

	public static void main(String[] args) {
		AbstractCars bicycle = new Bicycle();
		bicycle.action();
		
		System.out.println("--------------------------");
		
		AbstractCars car = new Car();
		car.action();
	}

}
