package adapter.objectOriented;

import adapter.classOriented.User;

public class Test {

	public static void main(String[] args) {
		ObjectOrientedAdapter obj = new ObjectOrientedAdapter(new User());
		obj.sing();
		obj.dance();
		obj.magic();
	}

}
