package programs;

public class MyThread2 {
PrintValues p;
	
	public MyThread2(PrintValues p) {
		// TODO Auto-generated constructor stub
		this.p=p;
	}
	
	public void run() throws InterruptedException{
		p.displayNumber();
	}
}
