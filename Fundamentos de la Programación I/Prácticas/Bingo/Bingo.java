package Bingo;
// Bingo creado por Antonio Manjavacas Lucas y Jose Maria Muñoz Martinez 

// Fecha de inicio: 17/10/2016
// Fecha de finalizacion: 16/10/2016

import java.util.Scanner;

public class Bingo {

	static Scanner TECLADO = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion = 0, empezar = 0;
		boolean jugar = false;

		// Introducción de jugadores por línea de argumentos
		String primero, segundo;
		primero = args[0];
		segundo = args[1];

		// Inicializaci�n de cartones y bombo
		int filascarton = 3, columnascarton = 5;
		int[][] carton1 = new int[filascarton][columnascarton];
		int[][] carton2 = new int[filascarton][columnascarton];

		boolean cartonGenerado = false;
		boolean lineaCantada1 = false;
		boolean lineaCantada2 = false;
		boolean bingoCantado1 = false;
		boolean bingoCantado2 = false;

		int[] bombo = new int[90];
		for (int i = 0; i < bombo.length; i++) {
			bombo[i] = i + 1;
		}

		System.out.println("Nombre del jugador 1: " + primero);
		System.out.println("Nombre del jugador 2: " + segundo);
		System.out.println("\n Bienvenidos al bingo " + primero + " y " + segundo + "!");

		do { // Bucle que permite el inicio del juego

			System.out.println(" Empezar a jugar?\n\n [1] Si.\n [2] No.");
			empezar = TECLADO.nextInt();

			if (empezar == 1)
				jugar = true;
			else
				jugar = false;

		} while (jugar == false);

		do { // Menú en bucle que permite la selección del usuario

			System.out.println("\n Por favor, elija una acción: \n\n " + "[1] Repartir cartones \n [2] Sacar bola \n "
					+ "[3] Imprimir cartones \n [4] Imprimir bombo \n [5] Salir");

			opcion = TECLADO.nextInt();
			switch (opcion) {

			case 1:// REPARTIR CARTONES

				System.out.println("\n Repartiendo cartones...");

				// Se generan los cartones
				carton1 = RepartirCarton(primero, carton1);
				carton2 = RepartirCarton(segundo, carton2);

				bombo = new int[90]; // Se resetea el bombo
				for (int i = 0; i < bombo.length; i++) {
					bombo[i] = i + 1;
				}

				cartonGenerado = true; // Indica que los cartones se han
										// repartido
				break;

			case 2:// SACAR BOLA, TACHAR NÚMERO, COMPROBAR LÍNEA Y BINGO

				if (cartonGenerado == true) { // Se pide haber repartido antes
												// los cartones

					System.out.println("\n Sacando bola...");

					int bola = (int) (Math.random() * 90 + 1);

					// Se evita la repetici�n de valores de 'bola'
					bola = ComprobarBolaRepetida(bola, bombo);

					// Se comprueban las coincidencias de 'bola'
					carton1 = BolaCarton(bola, carton1);
					carton2 = BolaCarton(bola, carton2);
					bombo = BolaBombo(bola, bombo);

					// Se comprueba 'l�nea' en los dos cartones
					if (lineaCantada1 == false) {
						lineaCantada1 = CantarLinea(carton1, primero);
					}

					if (lineaCantada2 == false) {
						lineaCantada2 = CantarLinea(carton2, segundo);
					}

					// Se comprueba 'bingo' en los dos cartones
					bingoCantado1 = CantarBingo(carton1, bingoCantado1);
					bingoCantado2 = CantarBingo(carton2, bingoCantado2);

					if (bingoCantado1 == true && bingoCantado2 == true) { // Notificar
																			// empate
						System.out.println("EMPATE! Ambos jugadores ganan. Enhorabuena!");
						jugar = false;
					}

					if (bingoCantado1 == true || bingoCantado2 == true) {
						if (bingoCantado1 == true) { // Gana JUGADOR 1
							System.out.println("\n" + primero + ":�BINGO!");
							System.out.println("\n" + primero + " HA GANADO, ENHORABUENA!");
							jugar = false;
						} else { // Gana JUGADOR 2
							System.out.println("\n" + segundo + ": �BINGO!");
							System.out.println("\n" + segundo + " HA GANADO, ENHORABUENA!");
							jugar = false;
						}
					}

				} else
					System.out.println("Inicia antes el juego repartiendo los cartones.");

				break;

			case 3:// MOSTRAR CARTONES

				if (cartonGenerado == true) { // Se pide haber repartido antes
												// los cartones

					System.out.println("\n Imprimiendo cartones...\n");

					// Se imprimen los cartones
					ImprimirCarton(primero, carton1);
					ImprimirCarton(segundo, carton2);

				} else
					System.out.println("Inicia antes el juego repartiendo los cartones.");

				break;

			case 4:// MOSTRAR BOMBO

				if (cartonGenerado == true) { // Se pide haber repartido antes
												// los cartones

					System.out.println("\n Imprimiendo bombo...");

					// Se imprime el bombo
					ImprimirBombo(bombo);

				} else
					System.out.println("Inicia antes el juego repartiendo los cartones.");
				break;

			case 5:// TERMINAR JUEGO

				System.out.println("\n\n -Fin del juego- \n Gracias por jugar!");

				// Se termina el juego
				jugar = false;
				break;

			default:// NOTIFICACI�N DE ERROR EN ENTRADA POR TECLADO

				System.out.println("\n Seleccione una opci�n de entre las anteriores para jugar.");

			}

		} while (jugar == true); // El menú se muestra mientras el juego no ha
									// terminado
	}

	// Método encargado de generar los cartones [1]
	private static int[][] RepartirCarton(String jugador, int[][] carton) {

		int numero = (int) (Math.random() * 90 + 1); // Genera un número
														// aleatorio

		System.out.println("__________________________________");
		System.out.println("        Cart�n de " + jugador + " \n");

		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[i].length; j++) {

				// Se comprueba si el número está repetido
				carton[i][j] = ComprobarRepetido(numero, carton);

				System.out.print(carton[i][j]); // Si no está repetido, se
												// imprime
				if (j != carton[i].length)
					System.out.print("\t"); // Se muestran los cartones
											// generados con tabulaciones entre
											// los n�meros
			}
			System.out.println();
		}
		System.out.println("__________________________________\n");

		return carton;
	}

	// Método encargado de comprobar el valor de bola en los cartones [2]
	private static int[][] BolaCarton(int bola, int[][] carton) {

		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[i].length; j++) {
				if (carton[i][j] == bola) { // Se comprueba la coincidencia con
											// un número del cartón
					carton[i][j] = -1; // Se sustituye por un -1 (este no esta
										// incluido en el rango del carton)
				}
			}
		}
		return carton;
	}

	// M�todo encargado de comprobar el valor de bola en el bombo [2]
	private static int[] BolaBombo(int bola, int[] bombo) {
		for (int i = 0; i < bombo.length; i++) {
			if (bombo[i] == bola) { // Se comprueba la coincidencia con un
									// número del bombo
				bombo[i] = -1; // Se sustituye por un -1 (este no esta incluido
								// en el rango de bombo)
			}
		}
		return bombo;
	}

	// Método encargado de imprimir los cartones [3]
	private static void ImprimirCarton(String jugador, int[][] carton) {

		System.out.println("__________________________________");
		System.out.println("        Cartón de " + jugador + " \n");
		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[i].length; j++) {
				if (carton[i][j] == -1) { // Se comprueba si en la posición hay
											// un -1
					System.out.print("X"); // Se imprime una X en dicha posición
											// (se "tacha")
				} else
					System.out.print(carton[i][j]); // Si no hay coincidencia,
													// no se "tacha"
				if (j != carton[i].length)
					System.out.print("\t"); // Se introducen tabulaciones entre
											// los números
			}
			System.out.println();
		}
		System.out.println("__________________________________");
	}

	// M�todo encargado de imprimir el bombo [4]
	private static void ImprimirBombo(int[] bombo) {

		int contador = 0;

		for (int i = 0; i < bombo.length; i++) {
			contador = i + 1;

			if (bombo[i] == -1) { // Se comprueba si en la posición hay un -1
				System.out.print("X"); // Se imprime una X en dicha posición (se
										// "tacha")
			}

			else
				System.out.print(bombo[i]); // Si no hay coincidencia, no se
											// "tacha"

			System.out.print("\t"); // Se introducen tabulaciones entre los
									// números

			if (contador % 10 == 0) { // Cada diez números se cambia de línea
				System.out.println("");
			}
		}
	}

	// Método encargado de comprobar y cantar línea [2]
	private static boolean CantarLinea(int[][] carton, String jugador) {

		int contador = 0;
		boolean lineaCantada = false;

		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[i].length; j++) {
				if (carton[i][j] == -1) {
					contador++; // Cada vez que se percibe un -1, contador++
					if (contador == 5) {
						lineaCantada = true; // Si se encuentran 5 seguidos en
												// linea, se notifica
						System.out.println("\n" + jugador + ": �L�NEA!");

					}
				}
			}
			contador = 0; // El contador se resetea
		}
		return lineaCantada; // Se evita la repetición del evento
	}

	// Método encargado de comprobar y cantar bingo [2]
	private static boolean CantarBingo(int[][] carton, boolean bingoCantado) {

		int contador = 0;

		for (int i = 0; i < carton.length; i++) {
			for (int j = 0; j < carton[i].length; j++) {
				if (carton[i][j] == -1) {
					contador++; // Cada vez que se percibe un -1, contador++
				}
				if (contador == 15) { // Si todos los números son -1, bingo y
										// fin del juego
					return true; // Se devuelve el valor l�gico que finaliza el
									// juego
				}
			}
		}
		return false; // Se devuelve el valor l�gico que continúa el juego
	}

	// Método encargado de evitar bolas repetidas [2]
	private static int ComprobarBolaRepetida(int bola, int[] bombo) {

		boolean repetido = true;

		while (repetido) { // Mientras la bola está repetida, generar una nueva

			if (bombo[bola - 1] == -1) {
				repetido = true;
				bola = (int) (Math.random() * 90 + 1);

			} else
				repetido = false; // Si la bola no se repite, se imprime
		}

		System.out.println("\n El " + bola + "!\n");

		return bola; // Se devuelve el valor de bola
	}

	// Método encargado de evitar números repetidos en una matriz [2]
	private static int ComprobarRepetido(int numero, int[][] carton) {

		boolean repetido = true;

		while (repetido == true) { // Mientras el número se repita, generar otro

			for (int x = 0; x < carton.length && true; x++) {
				for (int y = 0; y < carton[x].length; y++) {

					if (carton[x][y] == numero) {
						numero = (int) (Math.random() * 90 + 1);
						repetido = true;
					} else
						repetido = false; // Si el número no se repite, se
											// devuelve
				}
			}

		}

		return numero; // Número devuelto
	}
}
