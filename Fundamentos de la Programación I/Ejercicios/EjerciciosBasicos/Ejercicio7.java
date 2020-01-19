package EjerciciosBasicos;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println(ejemplo(7));
	}

	public static int ejemplo(int n) {
		int resultado = 2;
		if (n != 4)
			resultado = ejemplo(n - 2) + n;
		else
			resultado = 0;
		return resultado;
	}

}
// va a dar error