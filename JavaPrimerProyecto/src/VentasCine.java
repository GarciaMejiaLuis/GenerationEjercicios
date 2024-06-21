import java.util.Scanner;

public class VentasCine {
	public static void main(String[] args) {
		System.out.println("Que edad tienes: ");
		Scanner in = new  Scanner(System.in);
		byte edad = in.nextByte();
		float ticket=(float)7.0;
		
		if(edad<5) {
			ticket =(ticket - (ticket*0.60f));
		}else if(edad>60){
			ticket =(ticket - (ticket*0.55f));
		}else {
			System.out.println("Cuantos boletos quieres?");
			short cantidad = in.nextShort();
			if (cantidad>=2) {
				ticket =(float)((cantidad * ticket)*0.70);	
			}
		}
		System.out.println("El precio total  es: "+ ticket);
		System.out.println("El precio es :" +ticket );
		in.close();
	}
}
