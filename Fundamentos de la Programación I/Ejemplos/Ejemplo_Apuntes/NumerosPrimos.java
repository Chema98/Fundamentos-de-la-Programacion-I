package Ejemplo_Apuntes;
import java.util.Scanner;

public class NumerosPrimos {

	final static Scanner TECLADO= new Scanner(System.in);
	
	public static void main (String[]args){
		
	//Datos
	int N;
	//Instrucciones
	System.out.println("Este programa va a mostrar los numeros primos que hay desde 0 hasta el número que insertes");
	System.out.println("Por favor,introduce un número mayor que cero");
	N=leervalorpositivo();
	}

	private static int mostrarycontarprimos(int N) {
		//datos
		int contador;
		//instrucciones
		contador=0;
		for (int i=0;i<=N;i++){
				if (numeroprimo(i)){
					System.out.println(i);
					contador=contador+1;
				}
		}
		return contador;
	}

	private static boolean numeroprimo(int i) {
		//datos
		boolean primo;
		//instrucciones
		primo=true;
		for (int divisor=2;divisor<=i;divisor++){
			if (i%divisor==0){
				primo=false;
			}
		}
		return primo;
	}

	private static int leervalorpositivo() {
		//datos
		int Num;
		//instrucciones
		Num=TECLADO.nextInt();
		while (Num<=0){
			System.out.println("Dato erróneo.Por favor,introduce un número mayor que cero");
			Num=TECLADO.nextInt();
		}
		return Num;
	}
	
}
