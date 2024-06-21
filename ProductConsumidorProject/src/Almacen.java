import java.util.ArrayList;

//cuidado con la sincronizacion y el uso de informacion por eso synchronized

public class Almacen {
	public final static ArrayList<Integer> lista = new ArrayList<Integer>();
	public final static int max=100;
	public static void main(String[] args) {
		
		Productor prod1 = new Productor("Productor1");
		Consumidor cons1 = new Consumidor("Consumidor1");
		Thread t1 = new Thread(cons1);
		
		prod1.start();
		t1.start();  
		//ambos elementos acceden a la misma lista al mismo tiempo,
		
		//para iniciar thread con instancia se debe de hacer 
		//con un objeto Thread y la instancia
		// TODO Auto-generated method stub
	}//main
}//class Almacen 
