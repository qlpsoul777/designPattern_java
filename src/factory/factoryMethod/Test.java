package factory.factoryMethod;

public class Test {

	public static void main(String[] args) {
		TreeFactory factory = new MagicTree();
		Banana banana = factory.createFruit(Banana.class);
		banana.getName();
	}

}
