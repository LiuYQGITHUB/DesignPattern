package proxy.pattern.demo3;

import proxy.pattern.demo2.Jack;
import proxy.pattern.demo2.ProxyFactory;
import proxy.pattern.demo2.Student;

public class ProxyTest3 {

	public static void main(String[] args) {
		System.out.println("直接访问真实实现类中的方法：");
		Tom t = new Tom();
		t.sing();
		t.dance();
		t.draw();
		
		System.out.println("---------------------------------------------------");
		System.out.println("通过代理对象访问：");
		Tom proxy = (Tom) CglibFactory.getCglibProxy(new Tom());
		proxy.sing();
		proxy.dance();
		proxy.draw();
	}
}
