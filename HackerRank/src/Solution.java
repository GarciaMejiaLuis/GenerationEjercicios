import java.util.*;
import java.io.*;
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            funncion(a,b,n);
        }
        in.close();
    }
    public static void funncion(int a, int b, int n){
        int start = 0;
    	int resultados=0;
        String mensaje="";
        
        while(start<n){
        	if (start==0) {
        		resultados =a + (int)(Math.pow(2,start)*b);
        		mensaje = String.valueOf( resultados) + "  ";
                start++;
        	}
        resultados = resultados + (int)(Math.pow(2, start)*b);
        mensaje+= String.valueOf( resultados) + "  ";
        start++;
        } 
        System.out.println(mensaje);
     }
 }