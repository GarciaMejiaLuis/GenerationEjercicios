package ExcepcionesDemo;
import java.util.Scanner;

public class Excepciones2 {
public static void main(String[] args) {
	System.out.println(("Escribe un numero del 1 al 10:"));
	Scanner in = new Scanner(System.in);
	int num = in.nextInt();
	int count = 0;
	while(count<num) {
		System.out.println(num);
		//count++;
	}
	in.close();
}
}
