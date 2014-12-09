package factory.factoryMethod;

public abstract class AbstractFactory {
	
	public abstract <T extends Product>T getProduct(Class<T> clazz);
	
	public abstract <T extends Fruit>T getFruit(Class<T> clazz);
	
	public abstract <T extends Human>T getHuman(Class<T> clazz);

}
