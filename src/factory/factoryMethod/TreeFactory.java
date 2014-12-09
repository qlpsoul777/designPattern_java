package factory.factoryMethod;

public abstract class TreeFactory {
	
	public abstract <T extends Fruit> T createFruit(Class<T> clazz);

}
