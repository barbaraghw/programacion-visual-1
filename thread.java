package sql;

public class thread extends Thread
{
	@Override
	public void run () {
		System.out.println(this.getName());
	}
	
	public static void main (String[] args)
	{
		for (int=0; i<10; i++)
		{
			thread a = new thread();
			a.setName("hilo"+1);
			a.start();
		}
	}
}
