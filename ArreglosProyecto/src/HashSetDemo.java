import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet<String> autos = new HashSet <String>();
	System.out.println(autos.add("Volvo"));
	System.out.println(autos.add("BMW"));
	System.out.println(autos.add("VM"));
	System.out.println(autos.add("FORD"));
	System.out.println(autos.add("Audi"));
	System.out.println(autos.add("Volvo"));
	
	System.out.println("BMV".hashCode());
	System.out.println(autos.size()); 
	
	
	for(String auto:autos) {
		System.out.println(auto);
	}
	
    autos.forEach((auto) -> mostrarAutos(auto));
	
	autos.clear();
	System.out.println(autos.isEmpty());
}//main

	public static void mostrarAutos(String auto) {
		System.out.println("+--------------------+");
		System.out.println("| "+ auto);
		System.out.println("+-------------------------------+");
	}
}//mostrarAutos
