import java.util.Scanner;

public class SwitchDemo {
public static void main(String[] args) {
	System.out.println("Escribe el numero del  mes: ");
	Scanner in = new Scanner(System.in);
	int month = in.nextInt();
	 
	/*
	String monthString;
	switch (month) {
	case 1: monthString = "January";
		break;
	case 2: monthString = "February";
		break;
	case 3: monthString = "March";
		break;
	case 4: monthString = "Abril";
		break;
	case 5: monthString = "May";
		break;
	case 6: monthString = "June";
		break;
	case 7: monthString = "July";
		break;
	case 8: monthString = "August";
		break;
	case 9: monthString = "September";
		break;
	case 10: monthString = "October";
		break;
	case 11: monthString = "November";
		break;
	case 12: monthString = "December";
		break;
	default: monthString = "Invalid Month";
		break;
	}*/
	
	String monthString = switch (month) {
	case 1 -> "Enero";
	case 2 -> "Febrero";
	case 3 -> "Marzo";
	case 4 -> "Abril";
	case 5 -> "Mayo";
	case 6 -> "Junio";
	case 7 -> "Julio";
	case 8 -> "Agosto";
	case 9 -> "Septiembre";
	case 10 -> "Octubre";
	case 11 -> "Noviembre";
	case 12 -> "Diciembre";
	default -> "Mes incorrecto";
	};
	
	
	System.out.println(monthString);
	in.close();
	}
}

