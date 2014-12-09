package factory.simpleFactory;

public class Test {

	public static void main(String[] args) {
		/**
		 * 如果增加其他种类的产品就需要在工厂类中增加相应的判断逻辑
		 */
		Product pro = (Product)Factory.createProduct(Test.class);
		if(pro != null){
			pro.create();
		}
		
		/**
		 * 工厂类不关心生产何种产品，具体判断逻辑延迟到调用时
		 */
		try {
			Product tv = (Product)Factory.create(Tv.class);
			if(tv != null){
				tv.create();
			}
		} catch (Exception e) {
			System.out.println("暂时不生产该产品");
		}
		
	}

}
