package proxy.pattern.demo3;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;


public class CglibFactory {

	public static <T> Object getCglibProxy(T t) {
		Enhancer en = new Enhancer();
		en.setSuperclass(t.getClass());
		en.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				System.out.println("++++++++++++方法执行前+++++++++++");
//				Object invoke = methodProxy.invokeSuper(obj, args);
				Object invoke = method.invoke(t, args);
				System.out.println("************方法执行后****************");
				return invoke;
			}
		});
		Object proxyObj = en.create();
		return proxyObj;
	}
	
	
}
