import java.util.Random;
public class Main {
 public static void main(String[] args) {
	 cicloThread t1 =new cicloThread("proceso1",15);
	 cicloThread t2 =new cicloThread("proceso2",10);
	 cicloThread t3 =new cicloThread("proceso3",20);
	 cicloThread t4 =new cicloThread("proceso4",5);
	t1.start();	t2.start(); t3.start();	t4.start();


 }
}

class cicloThread extends Thread{
	private int max;
	private Random random;
	public cicloThread(String name, int max) {
		this.max=max;
		this.setName(name);
		random=new Random();
	}//constructor
	
	public void run() {
		int cont =0;
		while (cont<this.max){
			System.out.println(this.getName() + ": " +cont++);
			
			try {
				Thread.sleep(random.nextInt(3000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//catch
		}//while
	System.out.println("Fin "+ this.getName());
	}//run
	
}//clasCicloThread