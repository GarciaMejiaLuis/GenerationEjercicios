package Interfaz;

public class retangulo  implements FiguraGeometrica{
	String nombre;
	double base;
	double altura; 
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double calcularArea () {
		return (base*altura)/2;
	}
	public double calculaPerimetro() {
		return (base*2+altura*2);
	}
	@Override
	public String toString() {
		return "retangulo [base=" + base + ", altura=" + altura + ", nombre=" + nombre + "]";
	}
	public retangulo(String nombre, double base, double altura) {
		super();
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}
	
	
}
