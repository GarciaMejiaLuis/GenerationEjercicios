
public class Productor extends Thread {

	public Productor(String name) {
		this.setName(name);
	}

	@Override
	public void run() {
		System.out.println("INICIO del Productor");
		int cont =0;
		while (cont<Almacen.max) {
			int num= (int) (Math.random()*500);
			
			synchronized(Almacen.lista) {
				Almacen.lista.add(num);  //lista y agrego numero aleatoio 0-500				
			}
			System.out.println(cont + "Producto" + this.getName()+  "  "+
			num+ " tamaño: " + Almacen.lista.size() ); //muestra informacion 
			try {
				Thread.sleep(num); //manda a dormir x tiempo
			} catch (InterruptedException e) { //capta las excepciones 
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//catch
			cont++; //aumentamos el contador
		}//while
		System.out.println("*******************FIN de Productor "+ this.getName());
	}//run
}
