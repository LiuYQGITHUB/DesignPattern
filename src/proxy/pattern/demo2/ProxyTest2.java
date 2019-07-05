package proxy.pattern.demo2;


public class ProxyTest2 {

	public static void main(String[] args) {
		System.out.println("直接访问真实实现类中的方法：");
		Student stu = new Jack();
		stu.sing();
		stu.dance();
		stu.draw();
		
		System.out.println("---------------------------------------------------");
		System.out.println("通过代理对象访问：");
		Student proxy = (Student) ProxyFactory.getProxy(new Jack());
		proxy.sing();
		proxy.dance();
		proxy.draw();
	}
}
