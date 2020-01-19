package Ejemplo_Apuntes;
import java.util.Scanner;

public class Notas {
	final static Scanner TECLADO = new Scanner (System.in);

	public static void main (String []args){
		
		float cifra;
		String nota="";
		
	System.out.println("Este programa asignará a cada nota numérica una designación propia.\n Por favor, introduce una nota numérica.");
	
		cifra = TECLADO.nextFloat();
		
			if (cifra<0 || cifra>10)
				System.out.println("Introduce un número entre 0 y 10");
			    else if (cifra<5)
			    	nota=" suspenso.";
				else if (cifra<7)
					nota=" aprobado.";
				else if (cifra<9)
					nota=" notable.";
				else if (cifra<10)
					nota=" sobresaliente.";
				else 
					nota="a matrícula de honor. Enhorabuena.";
			
			System.out.printf("La nota %.2f corresponde a un"+nota,cifra);

					
			
	}
}
