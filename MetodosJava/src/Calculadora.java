
public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora cal = new Calculadora();

		int res = cal.sum(8,45);
		System.out.println(res);

		System.out.println(cal.sum (10,20,30)); 
		System.out.println(cal.sum (10.2,30.2)); 
		
		res =cal.multiplica(10,100);
		System.out.println(res);
		res = cal.resta(2100, 100);
		System.out.println(res);
		
		
	}//main
	public int sum (int a, int b) {
		int c =(a+b);
		return c;
	}
	public double sum (double a, double b) {
		double c =(a+b);
		return c;
	}
	public int sum (int a, int b,int c) {
		int res =(a+b+c);
		return res;
	}
	public int resta (int a, int b) {
		int c =(a-b);
		return c;
	}
public int multiplica(int a, int b) {
	return a*b;
	}

}
