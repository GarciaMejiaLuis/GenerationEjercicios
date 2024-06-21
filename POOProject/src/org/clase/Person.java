package org.clase; 
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Excepciones.EmailFormatException;

public abstract class Person {
	private String name;
	private int age;
	private String email;
	private String rfc;
	private String address;
	private int id;
	private static int total=0;

	public Person(String name, int age,String email, String rfc, String address) {
		this.name=name.toUpperCase();
		this.email=email.toLowerCase();	
		this.age=(age<18)?18:age;
		this.rfc=rfc;
		this.address=address;
		//checar los dos de abajo
		this.id=total;
		total++;
	}//constructor 
	
	//Se manda a llamar al otro constructor de arriba y se completa 
	//disminuye codigo, cambios mas rapidos, reutilizamos codigo
	public Person(String name, int age,String email) {
		this(name,age,email,"XAXX000000","Sin domicilio");
	}
	
	public Person(String name) {
		this(name,0,"Sincorreo@correo.com");
	}
	
	public static int getTotal() { 
		//total es una propiedad de clase porque solo se puede hacer referencia mediante la clase Person
		//las otras propiedades son de instancia porque cada objeto de la clase generado se puede acceder
		// para ver la edad andrea.edad  para ver el total de objetos  
		return total;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) throws EmailFormatException{  //arroja la excepcion que nosotros generamos
		this.email="sin@correo.com";
		Pattern regex = Pattern.compile("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+");
		Matcher m = regex.matcher(email);
		if (m.matches()) {
			this.email=email;
		}else {
			throw new EmailFormatException(email+ "no es un formato valido"); //genera una nueva excepcion  generada al momento
		}
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age){
		this.age=(age>18)?18:age;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "Person [name= "+name + ", age= "+ age + 
				", email " + email+ ", rfc=" +rfc + ", address= "+ address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
}//class Person
