package ExcepcionesDemo;

public class wxcpciones {
public static void main(String[] args) {
	int [] numeros = {2,4,8,1,32,64,128,256,512};
	int a=10, b=0;
	
	try {
		for (int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		System.out.println(a/b);
	} catch (ArrayIndexOutOfBoundsException e) {		//excepciones tienen jerarquia
		System.out.println("Se intento acceder a un indice incorrecto");
	}catch (ArithmeticException e) {				//segundo nivel de jerarquia
		System.out.println("No se puede dividir entre zero");
	}catch (Exception e) { 				//excepcion genera , esta sobre todas las demas
		System.out.println("Se ha producido un problema");
	}
	System.out.println(numeros.length);
	System.out.println("Prueba Errores en tiempo de ejecucion");
}
}
