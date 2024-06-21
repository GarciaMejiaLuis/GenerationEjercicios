package Interfaz;

public class romboide implements FiguraGeometrica {
	String nombre;
	double base;
	double altura;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
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
	
	
	
	@Override
	public String toString() {
		return "romboide [base=" + base + ", altura=" + altura + ", nombre=" + nombre + "]";
	}
	
	public double calcularArea () {
		return (base*altura);
	}
	public double calculaPerimetro() {
		return (2*base+2*altura);
	}
	public romboide(String nombre, double base, double altura) {
		this.nombre = nombre;
		this.base = base;
		this.altura = altura;
	}
	
	
	
}
