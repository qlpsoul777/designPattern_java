package prototype.deep;


/**
 * 
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
		
//		User user1 = (User) user.deepClone();
		User user1 = null;
		try {
			user1 = user.cloneObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		user1.setId(2);
		user1.setName("李四");
		user1.getCard().id=2;
		user1.getCard().name="c2";
		System.out.println("克隆后源对象："+user+"---"+user.getId()+"|"+user.getName()+"|"+user.getCard()+"---"+"|"+user.getCard().id+"|"+user.getCard().name);
		System.out.println(user1+"---"+user1.getId()+"|"+user1.getName()+"|"+user1.getCard()+"---"+"|"+user1.getCard().id+"|"+user1.getCard().name);
	}

}
