import java.util.Arrays;

public class Arreglos {
	public static void main(String[] args) {
		String[] months = {"Enero", "Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
	
		
		for(int i =0;i<months.length;i++) {
			System.out.println(months[i]);
		}
		System.out.println();
		
		for(String month : months) {
			System.out.println(month);
		}
		int[] nums = new int[5];
		nums[0]=1;
		nums[1]=20;
		nums[2]=8;
		nums[3]=12;
		nums[4]=36;
		// solo se puede agregar hasta el numero establecido anes
		//en este caso hasta 5
		
		//ahora si se crea una nueva lista con 6 si se podria agregar
		//un nuevo elemento pero todos los demas se pierden
		nums = Arrays.copyOf(nums, 6); // Aumenta la longitud del array en 6 elementos		nums[5]=1;
		
		nums[5]=1;
		
		//Arreglo tipo for each , no accede a los elemmentos adentr
		//solo toma el numero de elementos
		for(int n:nums) {
			System.out.println(n);
		}//foreach n
		
	}
}
