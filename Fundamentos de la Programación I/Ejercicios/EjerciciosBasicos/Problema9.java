package EjerciciosBasicos;
import java.util.Scanner;
public class Problema9 {
	final static  Scanner TECLADO =new Scanner(System.in);
public static void main(String[] args){
	int n,m;
	System.out.println("Este programa va a calcular una multiplicaci�n por medio de la recursividad");
	System.out.println("N�mero a multiplicar");
	n=TECLADO.nextInt();
	System.out.println("Otro n�mero");
	m=TECLADO.nextInt();
	System.out.println(multi(m,n));
}
public static int multi(int m,int n){
	int resultado;
	if (m==0 || n==0)
		resultado=0;
		else
			resultado=n+multi(m-1,n);
	return resultado;
	}
}
