package thread;

public class A {
	
	public synchronized void d1(B b)
	{
		System.out.println("Thread1 executing d1() method.");
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Thread1 trying to call B's last() method.");
		b.last();
	}
	
	public synchronized void last()
	{
		System.out.println("Inside A's last() method.");
	}

}
