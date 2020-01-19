package Ejemplo_Apuntes;
import java.util.Scanner;

public class Examen2016 {
	final static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {
		float perimetro;
		int opcion;
		System.out.println("Este programa va a calclular el per�metro de varias figuras geom�tricas");
		System.out.println("Por favor, di que figura quiere calcular:\n [1]Cuadrado\n [2]Rect�ngulo\n [3]C�rculo\n [0]Salir");
		do {
			opcion=leeropcion();
			switch (opcion){
			case 1:
				perimetro=calcularperimetrodelcuadrado();
				System.out.println("El per�metro del cuadrado es "+perimetro);
				break;
			case 2:
				perimetro=calcularperietrodelrectangulo();
				System.out.println("El per�metro del rectangulo es "+perimetro);
			break;
			case 3:
				perimetro=circuloperimetro();
				System.out.println("El per�metro del circulo es "+perimetro);
				break;
			}
		}while (opcion!=0);
		}

	private static float circuloperimetro() {
		float radio;
		float Pi = (float) 3.14;
		System.out.println("Introduce la longitud del radio del circulo a calcular");
		radio = leerrealpositivo();
		return 2 * Pi * radio;
	}

	private static float calcularperietrodelrectangulo() {
		float base, altura;
		System.out.println("Introduce la longitud de la base");
		base = leerrealpositivo();
		System.out.println("introduce la longitud de la altura");
		altura = leerrealpositivo();
		return 2 * base + 2 * altura;
	}

	private static float calcularperimetrodelcuadrado() {
		float lado;
		System.out.println("Introduce la longitud del lado");
		lado = leerrealpositivo();
		return 4 * lado;
	}

	private static float leerrealpositivo() {
		float longitud;
		longitud = TECLADO.nextFloat();
		while (longitud <= 0) {
			System.out.println("Data err�neo, por favor introducelo de nuevo");
			longitud = TECLADO.nextFloat();
		}
		return longitud;
	}

	private static int leeropcion() {
		int num;
		System.out.println("Di que figura quiere calcular");
		num = TECLADO.nextInt();
		while (num < 0 && num > 3) {
			System.out.println("Dato err�neo, por favor, introduce un dato entre el 0 y el tres");
			num = TECLADO.nextInt();
		}
		return num;
	}

}
