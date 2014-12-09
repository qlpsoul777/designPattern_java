package factory.abstractFactory;

public class Test {

	public static void main(String[] args) {
		AbstractFactory abs = new Factory();
		Tv tv = abs.getProduct(Tv.class);
		tv.getName();
		
		Orange orange = abs.getFruit(Orange.class);
		orange.getName();
		
		BlankMan man = abs.getHuman(BlankMan.class);
		man.getName();
	}

}
