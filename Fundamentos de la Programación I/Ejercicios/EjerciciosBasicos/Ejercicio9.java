package EjerciciosBasicos;
public class Ejercicio9 {
public static void main(String[] args) {
		metodo1(4);
	}
public static void metodo1(int n){
	if (n<2)
		System.out.print('X');
	else{
		metodo1(n-1);
		System.out.print('0');
	}
}
}
