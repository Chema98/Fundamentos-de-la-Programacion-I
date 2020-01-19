package EjerciciosBasicos;

public class Problema3 {
	public static void main(String[] args) {
		int i, j, funcion;
		i = Integer.parseInt(args[0]);
		j = Integer.parseInt(args[1]);
		if (i >= 0 && j >= 0) {
			funcion = recur(i, j);
			System.out.println(funcion);
		} else {
			System.out.println("Los números deben ser >=0");

		}
	}

	public static int recur(int i, int j) {
		int valor;
		if (i == j)
			valor = 1;
		else {
			if (j == 0 || i == 0)
				valor = 0;
			else
				valor = j * recur(i - 1, j) + recur(i - 1, j - 1);
		}
		return valor;
	}
}
