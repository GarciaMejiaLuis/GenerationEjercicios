public class TiposPrimiticos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte edad=127, edad2;
		short suma=10 ,resta;
		short multiplica, division,raiz;
		int min=18;
		char incial='A';
		boolean flag = true;
		suma= 80+20;
		edad= (byte) suma;
		System.out.println(edad);
		edad= (byte) min; //conversion explicita, de otro modo se desborda o marca error
		System.out.println(edad);

	}
}
 