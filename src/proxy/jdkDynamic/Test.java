package proxy.jdkDynamic;

public class Test {

	public static void main(String[] args) {
		DynamicProxy proxy = new DynamicProxy();
		Man chineseMan = (Man)proxy.bind(new ChineseMan());
		chineseMan.talk();
		
		System.out.println("----------");
		
		Animal bird = (Animal)proxy.bind(new Bird());
		bird.sound();
	}

}
