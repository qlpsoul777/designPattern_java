package adapter.objectOriented;

import adapter.classOriented.Performance;
import adapter.classOriented.User;
/**
 * java���ǵ��̳У����������ClassOritedAdapterһ���Ļ��Ͳ��ܼ̳��������ˡ�
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
		System.out.println("�һ�ħ��");
	}

}
