import java.util.Scanner;

public class ifElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese la califcación");
		Scanner in = new Scanner(System.in);
		double testScore = in.nextDouble();
		char grade;
		if (testScore>=90) {
			grade= 'A';
		}else if  (testScore>=80) {
			grade= 'B';
		}else if (testScore>=70) {
			grade= 'C';
		}else if (testScore>=60) {
			grade= 'D';
		} else {
			grade= 'F';
		}
		System.out.println("Grade = "+grade);
		in.close();
	}
}
