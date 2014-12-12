package prototype.shallow;


/**
 * 被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用都仍然指向原来的对象。换言之，浅复制仅仅复制所考虑的对象
 * 而不复制它所引用的对象。
 * @author qlp
 *
 */
public class Test {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setName("张三");
		user.setCard(new Card());
		System.out.println("克隆前源对象："+user+"---"+user.getId()+"|"+user.getName()+"|"+user.getCard()+"---"+"|"+user.getCard().id+"|"+user.getCard().name);
		
		User user1 = (User) user.clone();
		user1.setId(2);
		user1.setName("李四");
		user1.getCard().id=2;
		user1.getCard().name="c2";
		System.out.println("克隆后源对象："+user+"---"+user.getId()+"|"+user.getName()+"|"+user.getCard()+"---"+"|"+user.getCard().id+"|"+user.getCard().name);
		System.out.println(user1+"---"+user1.getId()+"|"+user1.getName()+"|"+user1.getCard()+"---"+"|"+user1.getCard().id+"|"+user1.getCard().name);
	}

}
