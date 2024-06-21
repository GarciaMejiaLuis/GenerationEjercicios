package Interfaz;

public class rombo  implements FiguraGeometrica{
	String nombre;
	double lado;
	double dmenor;
	double Dmayor;
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getDmenor() {
		return dmenor;
	}
	public void setDmenor(double dmenor) {
		this.dmenor = dmenor;
	}
	public double getDmayor() {
		return Dmayor;
	}
	public void setDmayor(double dmayor) {
		Dmayor = dmayor;
	}
	@Override
	public String toString() {
		return "rombo [lado=" + lado + ", dmenor=" + dmenor + ", Dmayor=" + Dmayor + "]";
	}
	
	public double calcularArea () {
		return (Dmayor*dmenor)/2;
	}
	public double calculaPerimetro() {
		return 4*lado;
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}
	public rombo(String nombre, double lado, double dmenor, double dmayor) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		this.dmenor = dmenor;
		Dmayor = dmayor;
	}
	
	

}
