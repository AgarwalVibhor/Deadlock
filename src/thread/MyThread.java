package thread;

public class MyThread extends Thread {
	
	A a = new A();
	B b = new B();
	
	public void m1()
	{
		this.start();
		a.d1(b);
	}
	
	@Override
	public void run()
	{
		b.d2(a);
	}

}
