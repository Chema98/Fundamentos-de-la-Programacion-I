package Ejemplo_Apuntes;
import java.util.Scanner;
public class SumaPositivos2 {
	final  static Scanner TECLADO = new Scanner (System.in);
	
	public static void main (String[]args) { 
		
		
		System.out.println("Introduce la cantidad de números positivos que quieres sumar");
		
		int N=TECLADO.nextInt();
		int suma;
		
	suma=0;
	
	for (int numero=0; numero<=N; numero++)
	suma=suma+numero;
	System.out.println("La suma de los "+N+" primeros números positivos es "+suma);
	
	}
}