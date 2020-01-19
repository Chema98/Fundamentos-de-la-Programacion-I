package Ejemplo_Apuntes;
import java.util.Scanner;
public class SumaPositivos {
	final static Scanner TECLADO = new Scanner (System.in);
	public static void main(String[]args)  {
	
		System.out.println("Introduce la cantidad de números positivos que quieres sumar");
		int N=TECLADO.nextInt();
		
	
	int suma=0;
	int numero=0;
	
	do{
		
	suma=suma+numero;
	numero++;
	
	}while (numero<=N);
	
	System.out.println("La suma de los "+N+" primeros números positivos es "+suma);

	}
} 