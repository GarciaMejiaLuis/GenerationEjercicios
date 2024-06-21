package org;
//import java.util.Date;
import org.clase.Employee;
import org.clase.Pagable;

public class Playroll {
public static void printReceipt(Pagable empleado) {
	System.out.println("+============================================================+");
	System.out.println("|Recibo de pago de "+ empleado.getName());
	System.out.println("| RFC "+ empleado.getRfc());
	System.out.println("| Departamento " + empleado.getDepartment());
	System.out.println("| por la cantidad de MXN $ "+ empleado.calculateSalary(30));
	System.out.println("| Numero de empleado "+ empleado.getId());
	//System.out.println("| Fecha "+ (new Date()));
	System.out.println("+============================================================+");
	}
}
