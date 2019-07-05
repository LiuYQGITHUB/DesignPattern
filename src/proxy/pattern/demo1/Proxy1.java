package proxy.pattern.demo1;

public class Proxy1 implements Person {
	
	private Person person;

	@Override
	public void description() {
		// TODO Auto-generated method stub
		System.out.println("下面有请一位工作人员为大家做介绍：");
		person.description();
		System.out.println("介绍结束，进入节目下一环节！");
	}

	public Proxy1(Person person) {
		super();
		this.person = person;
	}
	
	

}
