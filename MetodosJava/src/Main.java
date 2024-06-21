
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner console = new Scanner( System.in );
        System.out.println( "Enter your name:  " );
        String name = console.next();
        printNameCharacters( name);
        printNameLength( name );
        System.out.println( "Enter your Last name:  " );
        String LastName=console.next();
        LastName(name,LastName);
        console.close();
    }

    private static void printNameLength( String name )
    {
      //TODO implement this code
    	System.out.println("Longitud del nombre: "+name.length());
    }

    private static void printNameCharacters( String name )
    {
      //TODO implement this code
    	System.out.println("Caracteres");
    	int numero=name.length();
    	for (int i =0;i<numero;i++) {
    		System.out.println(name.charAt(i));
    	}
    }
    
    private static void LastName(String name, String LastName) {
    	System.out.println("Numero de Letras nombre : " + name.length());
    	System.out.println("Numero de Letras Apellido : " + LastName.length());
    	
    	System.out.println("Caracteres en nombre ");
    	int numero=name.length();
    	for (int i =0;i<numero;i++) {
    		System.out.println(name.charAt(i));
    	}
    
    	System.out.println("Caracteres apellido");
    	numero=LastName.length();
    	for (int i =0;i<numero;i++) {
    		System.out.println(LastName.charAt(i));
    	}
    	
    	System.out.println("Nombre Completo: "+ name+ " "+LastName);
    }
}