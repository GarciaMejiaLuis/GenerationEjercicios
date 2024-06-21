
public class MatrizDemo {
public static void main(String[] args) {
	int matriz[][]= {
			{1,2,3,4,5},
			{6,7,8,9,10},
			{11,12,13,14}
	};
	
	for(int ren=0;ren <matriz.length;ren++)
	{
		for(int col=0;col < matriz[ren].length;col++) {
			System.out.println(matriz[ren][col]+", ");
		}
		System.out.println();
	}

	}
}
