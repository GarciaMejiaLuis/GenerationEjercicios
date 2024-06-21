
public class CiclosAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje="";
		for (int i =1; i<4;i++) {
			mensaje=i+ " ";
			for(int j=1;j<4;j++) {
				System.out.println(mensaje + j);
			}
			mensaje="";
		}
				
		for(int j=6;j>0;j--) {
				mensaje+="* ";
				System.out.println(mensaje);
			}
		System.out.println("\n");
		mensaje="";
		
int a=6;
		while(a>0) {
			for(int b=0;b<a;b++  ) {
				mensaje+="* ";
			} 
			System.out.println(mensaje);
			a--;
			mensaje="";
		}
		
		System.out.println("\n");
		mensaje="";
		
		for(int c=6 ;c>0;c--) {
			for(int b=0;b<c;b++  ) {
				mensaje+="s* ";
			} 
			System.out.println(mensaje);
			mensaje="";
		}
	}

}
