package proxy.pattern.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

	public static <T>Object getProxy(T t) {
		
		Object newProxyInstance = Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("++++++++++++方法执行前+++++++++++");
				Object obj = method.invoke(t, args);
				System.out.println("************方法执行后****************");
				return obj;
			}
		});
		
		
		
		return newProxyInstance;
		
	}
}
