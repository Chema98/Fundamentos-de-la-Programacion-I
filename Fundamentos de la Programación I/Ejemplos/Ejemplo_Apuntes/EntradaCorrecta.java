package Ejemplo_Apuntes;
import java.util.Scanner;

public class EntradaCorrecta {
	final static Scanner TECLADO = new Scanner(System.in);
	public static void main(String[]args) {
	
	int n;

	
	System.out.println("Introduce un número positivo.");
	
	n=TECLADO.nextInt();
	
	while (n<=0) {
		
		System.out.println("Valor incorrecto, vuelva a intentarlo");
		
		n=TECLADO.nextInt();
		
	}
		System.out.println("Dato correcto. Gracias por su aporte.");
	}	
}
	
