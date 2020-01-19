package EjerciciosBasicos;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(metodoC(3));
	}

	public static int metodoC(int n) {
		int valor;
		if (n < -1)
			valor = 1;
		else
			valor = metodoC(n - 1) + n;
		return valor;
	}
}
