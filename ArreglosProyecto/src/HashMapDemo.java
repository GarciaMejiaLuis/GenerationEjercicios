import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> colores = new HashMap<String, String>();
		colores.put("RED","#FF0000");
		colores.put("GREEN","#00FF00");
		colores.put("BLUE","#0000FF");
		colores.put("FUSHIA","#FF00FF");
		colores.put("BLACK","#000000");
		colores.put("WHITE","#FFFFFF");
		colores.put("PINK","#FFC8CB");
		colores.put("CYAN","#00FFFF");
		colores.put("YELLOW","#FFFF00");

		System.out.println(colores.put("Navy","000080"));
		System.out.println(colores.put("Navy","000088"));
		System.out.println(colores.get("CYAN"));
		System.out.println(colores.size());
		System.out.println();
		
		for (String v : colores.values() ) {
			System.out.println(v);
		}
	
		for (String k : colores.keySet() ) {
			System.out.println(k);
		}
		
		colores.forEach((k,v)->mostrar(k,v));
		
	}

	private static void mostrar(String k, String v) {
		// TODO Auto-generated method stub
	System.out.println("+-------------------------------+");	
	System.out.println("| "+ k + " --> "+ v );
	System.out.println("+-------------------------------+");	
	}
}
