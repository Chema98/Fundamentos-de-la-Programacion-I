package EjerciciosBasicos;

public class Problema5 {
public static void main(String[] args){
	int posicion=7;
	String objetivamente;
//	System.out.println(imprimir(objetivamente,posicion));
}
public static void imprimir(String objetivamente, int posicion){
	if (posicion>=0){
		System.out.print(objetivamente.charAt(posicion));
		imprimir(objetivamente,posicion-1);
	}
}
}
