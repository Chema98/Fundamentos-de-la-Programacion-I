package Ejemplo_Apuntes;
import java.util.Scanner;

public class NumerosAmigos {

	final static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		// datos
		int N, M;
		int[] divisoresN, divisoresM;
		// Instrucciones
		System.out.println("Introduce un valor positivo");
		N = leerenteropositivo();
		System.out.println("Introduce otro valor positivo");
		M = leerenteropositivo();
		divisoresN= new int [N];
		divisoresM= new int [M];
		if (amigos(N, M, divisoresN, divisoresM)) {
			mostrardivisores(divisoresN);
			mostrardivisores(divisoresM);
		} else
			System.out.println("No son amigos");

	}

	private static void mostrardivisores(int[] divisores) {
		for (int i=1;i<divisores.length;i++){
			if (divisores[i]!=0){
				System.out.println(divisores[i]+ "+");
			}
		}
		
	}

	static boolean amigos(int N, int M, int[] divisoresN, int[] divisoresM) {
		boolean Amigos = false;
		int sumadivisoresN, sumadivisoresM;
		divisoresN = obtenerdivisores(N);
		divisoresM = obtenerdivisores(M);
		sumadivisoresN = obtenersuma(divisoresN);
		sumadivisoresM = obtenersuma(divisoresM);
		if (sumadivisoresN == sumadivisoresM) {
			Amigos = true;
		} else
			Amigos = false;
		return Amigos;
	}

	private static int obtenersuma(int[] divisores) {
		int suma = 0;
		for (int i = 1; i < divisores.length; i++) {
			if (divisores[i] != 0) {
				suma = suma + divisores[i];
			}
		}
		return suma;
	}

	private static int[] obtenerdivisores(int n) {
		int[] divisores;
		int posicion = 1;
		divisores = new int[n];
		for (int i = 1; i < n / 2; i++) {
			if (n % i == 0) {
				divisores[posicion] = i;
				posicion++;
			}
		}
		return divisores;
	}

	static int leerenteropositivo() {
		// datos
		int Num;
		// Instrucciones
		Num = TECLADO.nextInt();
		while (Num <= 0) {
			System.out.println("Dato incorrecto,por favor, introduce un valor positivo");
			Num = TECLADO.nextInt();
		}
		return Num;
	}
}
