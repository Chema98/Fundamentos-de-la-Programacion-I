package Ejemplo_Apuntes;
import java.util.Scanner;

public class ParImpar {
	final  static Scanner TECLADO = new Scanner(System.in);

	public static void main (String[]args) {
		
		int numero;
		String textoSalida, resultado;
		
	System.out.println("Este programa diferenciar� entre n�meros pares e impares.\nIntroduce el n�mero a evaluar.");

		numero = TECLADO.nextInt();
		
		textoSalida = "El n�mero "+numero+" es ";
		 
			if (numero%2==0)
				
				resultado = "par";
			
		
			else resultado = "impar";
			
		textoSalida = textoSalida+resultado+"\n \n Fin del programa";
		System.out.println(textoSalida);
	
	}
}
