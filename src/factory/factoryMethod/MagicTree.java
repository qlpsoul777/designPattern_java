package factory.factoryMethod;

public class MagicTree extends TreeFactory {

	@SuppressWarnings("unchecked")
	public <T extends Fruit> T createFruit(Class<T> clazz) {
		Fruit f = null;
		try {
			f = (Fruit)Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("这颗魔法树无法长出该水果");
		} 
		return (T)f;
	}

}
