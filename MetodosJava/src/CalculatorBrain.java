
public class CalculatorBrain {
	public static void main(String[] args) {
		CalculatorBrain cal = new CalculatorBrain();
		
		System.out.println("SUMA DE 10 +5: "+cal.suma(10,5));
		System.out.println("RESTA DE 10 - 5: "+cal.resta(10,5));
		System.out.println("DIVISION DE 10 / 5: "+cal.dividir(10.0,5.0));
		System.out.println("MULTIPLICACION DE 10 * 5: "+cal.multiplicacion(10,5));
		System.out.println("9 AL CUADRADO: "+cal.pow(9));
		System.out.println("RAIZ DE 9: "+cal.root(9));
		
	}
	
	public double suma(double a, double b) {
		return a+b;
	}
	
	public double resta(double a, double b) {
		return a-b;
	}
	
	public double dividir(double a, double b) {
		return a/b;
	}
	
	public double multiplicacion(double a, double b) {
		double c= a*b;
		return c;
	}
	
	public double pow(double a) {
		a=Math.pow(a,2);
		return a;
	}
	
	public double root(double a) {
		a=Math.sqrt(a);
		return a;
	}

}
