
public class Consumidor implements Runnable {
	private String name;
	
	
	public Consumidor(String name) {
		this.name = name;
	}


	public void run() {
		System.out.println("Inicio de consumidor");
		int cont=0;
		while(cont<Almacen.max) {
		if(Almacen.lista.size()==0) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}//if
		synchronized (Almacen.lista) {
			System.out.println(cont + "Consumidor" + this.getName()+  "  "+
					 Almacen.lista.remove(0)+ "tamaño "+Almacen.lista.size() );	
		}
		cont++;
		}
		System.out.println("**************FIN CONSUMIDOR");
	}


	private int getName() {
		// TODO Auto-generated method stub
		return 0;
	}
}