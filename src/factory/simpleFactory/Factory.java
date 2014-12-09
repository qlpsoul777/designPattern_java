package factory.simpleFactory;

public class Factory {
	
	public static Product createProduct(Class<?> clazz){
		Product product = null;
		try {
			product = (Product)Class.forName(clazz.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("暂时不生产该产品");
		} 
		return product;
	}
	
	public static Object create(Class<?> clazz) throws Exception{
		Object obj = Class.forName(clazz.getName()).newInstance();
		return obj;
	}

}
