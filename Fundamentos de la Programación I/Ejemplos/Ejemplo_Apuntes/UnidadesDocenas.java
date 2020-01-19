package Ejemplo_Apuntes;

import java.util.Scanner;

public class UnidadesDocenas {
	final static Scanner TECLADO = new Scanner(System.in);

	public static void main (String[]args) {
		int unidades, docenas;
		
		System.out.println("Este programa pasará a docenas el número que introduzcas.");
		System.out.println("Introduce el número de unidades:");
		unidades= TECLADO.nextInt();
		System.out.println();
		
		docenas=unidades/12; int resto=unidades%12;
				
		System.out.println(unidades+ " unidades equivalen a " +docenas+ " docenas y "+resto+ " unidades. ");
	}

}
