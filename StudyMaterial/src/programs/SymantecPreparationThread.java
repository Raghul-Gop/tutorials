package programs;

public class SymantecPreparationThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SymantecPreparationThread sym = new SymantecPreparationThread();
		sym.start();
		
	}
	
	public void run(){
		for(int i=1;i<=10;i++){
		System.out.println(i);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
