package proxy.jdkDynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
	
	private Object target;
	
	/** 
     * 绑定委托对象并返回一个代理类 
     * @param target 
     * @return 
     */  
    public Object bind(Object target) {  
        this.target = target;  
        //取得代理对象  
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),  
                target.getClass().getInterfaces(), this);   //要绑定接口(这是一个缺陷，cglib弥补了这一缺陷)  
    }  

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object obj = null;
		this.preTalk();
		obj = method.invoke(this.target, args);
		this.afterTalk();
		return obj;
	}
	
	private void preTalk() {
		System.out.println("专心听"+getName()+"说话");
	}

	private void afterTalk() {
		System.out.println("将"+getName()+"说的话翻译出来");
	}
	
	public String getName() {
		String str = "";
		if(this.target != null){
			Class<?> clazz = this.target.getClass();
			Method[] methods = clazz.getMethods();
			for (Method method : methods) {
				if("getName".equals(method.getName())){
					try {
						str = (String) method.invoke(this.target);
					} catch (Exception e) {
						str = "xxx";
					} 
				}
			}
		}else{
			str = "---";
		}
		return str;
	}

}
