package Ejemplo_Apuntes;
import java.util.Scanner;

public class PositivoNegativo {

	private static Scanner tECLADO;

	public static void main (String[]args){
		
		tECLADO = new Scanner(System.in);
		int numero;
		String textoResultado, textoSalida;
		
		System.out.println("Este programa evaluará si el número introducido es menor, mayor o igual que cero. \nIntroduce un número:");
		
		numero = tECLADO.nextInt();
		
		textoSalida=("El número");
		
		if (numero==0)
			textoResultado=" introducido es cero.";
		
		else if (numero>0)
			textoResultado=+numero+" es positivo.";
		
		else textoResultado=+numero+" es negativo.";
		
		textoSalida=textoSalida+textoResultado;
	
		System.out.println(textoSalida);
		
	}
	
}
