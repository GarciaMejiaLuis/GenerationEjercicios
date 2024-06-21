package Interfaz;
public class Main {
	public static void main(String[] args) {
		triangulo bermudas = new triangulo("Bermudas",20,10,15);
		triangulo t = new triangulo("TrianguloTE", 250,175,145);
		cuadrado c = new cuadrado("cuadrado",100);
		retangulo r = new retangulo("rectangulo",100,200);
		rombo rom = new rombo("rombo",100,200,50);
		romboide romboide = new romboide ("romboide",100,200);
		trapecio trapecio =new trapecio("trapecio",100,250,100,250,100,200,80);
		
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		imprimirCalculo(c);
		imprimirCalculo(r);
		imprimirCalculo(rom);
		imprimirCalculo(romboide);
		imprimirCalculo(trapecio);
	}
	
	public static void imprimirCalculo(FiguraGeometrica fig) {
	System.out.println(fig.toString());
	System.out.println("+=========================================+");
	System.out.println("|El area de [ "+ fig.getNombre() + " ] es : "+ fig.calcularArea());
	System.out.println("|El preimetro de [ "+ fig.getNombre() + "] es: "+ fig.calculaPerimetro());
	System.out.println("+=========================================+");
	}
	
}
