package org;
import org.clase.Person;
import org.clase.Consultor;
import org.clase.Employee;
import Excepciones.EmailFormatException;


public class Main {
public static void main(String[] args) {
	Employee andrea = new Employee ("andrea Ortiz",21,"andreaOrtiz@gmail.com","XAXX000000","Domicilio conocido","IT",450.00);
	Employee arturo = new Employee ("arturo Guzman",23,"arturoGuzman@gmail.com","XAXX000000","Domicilio conocido","IT",600.00);
	Employee braulio = new Employee ("braulio Guzman",23,"BraulioGG@gmail.com","XAXX000000","Domicilio conocido","IT",575.00);
//no se puede instanciar clases abstractas , solo se permite heredar y hacer uso de metodos staticos
	try {
		arturo.setEmail("arturo@gmail.com");
	}catch(EmailFormatException e){
		System.out.println(e.getMessage());
	}
	//catch
	
	System.out.println(andrea.toString());
	System.out.println(arturo.toString());
	
//	arturo.setEmail("corgmail.com");
	System.out.println(arturo.getEmail());
	System.out.println(andrea.getSalary());
	System.out.println(Person.getTotal()+ " personas en total ");
	
	Consultor dania = new Consultor ("Dania Cornejo SA de CV de RL", "XAXX000000", 850);
	
	Playroll.printReceipt(andrea);
	Playroll.printReceipt(arturo);
	Playroll.printReceipt(braulio);
	Playroll.printReceipt(dania);

	
	System.out.println();
	/*
	EL constructor vacio o por default solo se puede usar
	cuando no existe algun constructor definido
	andrea.name="andrea";
	andrea.age=21;
	andrea.email="andreaOtiz@gmail.com";
	andrea.rfc="XAXX000000";
	andrea.address="Domicilio conocido";
	System.out.println(andrea.name + " "+ andrea.age+ "\nemail:"+ andrea.email+ "\n"+ andrea.address);  */
}
}
