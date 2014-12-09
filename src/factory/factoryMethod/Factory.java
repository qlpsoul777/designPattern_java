package factory.factoryMethod;

public class Factory extends AbstractFactory {

	@SuppressWarnings("unchecked")
	public <T extends Product> T getProduct(Class<T> clazz) {
		Product pro = null;
		try {
			pro = (Product)Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("暂时不生产该产品");
		} 
		return (T)pro;
	}

	@SuppressWarnings("unchecked")
	public <T extends Fruit> T getFruit(Class<T> clazz) {
		Fruit fru = null;
		try {
			fru = (Fruit)Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("暂时没有该水果");
		} 
		return (T)fru;
	}

	@SuppressWarnings("unchecked")
	public <T extends Human> T getHuman(Class<T> clazz) {
		Human hum = null;
		try {
			hum = (Human)Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("暂时没有这类人种");
		}
		return (T)hum;
	}

	

}
