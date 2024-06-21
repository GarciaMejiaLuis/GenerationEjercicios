import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ventas obtenidas: ");
		Scanner in = new  Scanner(System.in);
		
		double sale= in.nextDouble();
		double comision;
		
		if (sale>=10000) {
			comision  = sale * 0.3 ;
			System.out.println("La comision es de: " + comision);
		}else if(sale>=5000) {
			comision  = sale * 0.2 ;
			System.out.println("La comision es de:  " + comision);
		}else if(sale>=1000) {
			comision  = sale * 0.1 ;
			System.out.println("La comision es de:  " + comision);
		} else{
			System.out.println("Comision de N/A");
		}  	
	}

}
