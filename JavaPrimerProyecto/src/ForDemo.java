
public class ForDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0;

		for( int i=0; i <10; i ++) {
			System.out.println(i);
		}
		System.out.println("=======================");
		while(cont<10) {
				if(cont==8) {
					cont++;
					break;
				}
				System.out.println(cont);
				cont++;
			}
			
		System.out.println("=======================");
		cont=0;
		while(cont<10) {
			if(cont==8) {
				cont ++;
				continue;
			}
			System.out.println(cont);
			cont ++;
		}
		System.out.println("=======================");
	}
}
