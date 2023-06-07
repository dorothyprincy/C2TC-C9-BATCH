package day13;

public class ChildThread extends Thread {
	int n;
	String msdg;
	
	public ChildThread(int n, String msdg)
	{
		this.n=n;
		this.msdg=msdg;
	}
public void run()
{
	for(int i=1; i<=n; i++) {
		System.out.println(msdg+i);
}
}
}
