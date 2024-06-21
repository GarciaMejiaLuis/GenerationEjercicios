package Interfaz;

public class cuadrado implements FiguraGeometrica {
	int lado;
	String nombre;

	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double calcularArea () {
		return (lado*lado);
	}
	public double calculaPerimetro() {
		return (lado*4);
	}
	
	@Override
	public String toString() {
		return "cuadrado [lado=" + lado + ", nombre=" + nombre + "]";
	}
	public cuadrado(String nombre, int lado) {
		super();
		this.lado = lado;
		this.nombre = nombre;
	}
	
	
	
}
