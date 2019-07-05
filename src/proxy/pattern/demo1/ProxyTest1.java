package proxy.pattern.demo1;

public class ProxyTest1 {

	public static void main(String[] args) {
		
		System.out.println("直接访问真实实现类中的方法：");
		Person person = new SoftwareEngineer();
		person.description();
		
		System.out.println("---------------------------------------------------");
		System.out.println("通过代理实现类访问：");
		Proxy1 proxy1 = new Proxy1(new SoftwareEngineer());
		proxy1.description();
	}
}
