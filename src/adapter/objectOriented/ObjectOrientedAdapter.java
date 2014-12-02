package adapter.objectOriented;

import adapter.classOriented.Performance;
import adapter.classOriented.User;
/**
 * java中是单继承，如果该类像ClassOritedAdapter一样的话就不能继承其它类了。
 * @author soul
 *
 */
public class ObjectOrientedAdapter implements Performance {
	
	User user;
	
	public ObjectOrientedAdapter(User user){
		this.user = user;
	}

	public void sing() {
		user.sing();
	}

	public void dance() {
		user.dance();
	}

	public void magic() {
		System.out.println("我会魔术");
	}

}
