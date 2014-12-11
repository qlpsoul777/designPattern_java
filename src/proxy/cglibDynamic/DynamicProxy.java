package proxy.cglibDynamic;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


public class DynamicProxy implements MethodInterceptor {
	
	private Object target;
	
	/** 
     * 创建代理对象 
     *  
     * @param target 
     * @return 
     */  
    public Object getInstance(Object target) {  
        this.target = target;  
        Enhancer enhancer = new Enhancer();  
        enhancer.setSuperclass(this.target.getClass());  
        // 回调方法  
        enhancer.setCallback(this);  
        // 创建代理对象  
        return enhancer.create();  
    } 

	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		Object result = null;
		this.preTalk();
		result = proxy.invokeSuper(obj, args);
		this.afterTalk();
		return result;
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
