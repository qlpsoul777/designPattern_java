package proxy.cglibDynamic;

public class Test {

	public static void main(String[] args) {
		DynamicProxy proxy = new DynamicProxy();
		Man chineseMan = (Man)proxy.getInstance(new ChineseMan());
		chineseMan.talk();
		
		System.out.println("----------");
		
		Animal bird = (Animal)proxy.getInstance(new Bird());
		bird.sound();
		//缺少jar包，无法运行。
	}

}
