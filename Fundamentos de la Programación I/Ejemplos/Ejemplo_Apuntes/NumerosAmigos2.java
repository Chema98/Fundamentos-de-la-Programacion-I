package Ejemplo_Apuntes;
 

 import java.util.Scanner;

 public class NumerosAmigos2 {

	 static final Scanner TECLADO=new Scanner(System.in);

 static boolean amigos(int N, int M, int[] divisoresN, int[] divisoresM){
 boolean sonAmigos=false;
 divisores(N, divisoresN);
 divisores(M, divisoresM);
 sonAmigos=suma(divisoresN)==M && suma(divisoresM)==N;
 return sonAmigos;
 }

 static void divisores(int num, int[] divisoresNum){
 int posDivisor=0;
 for (int d=1; d<=num/2; d++)
 if (num%d==0){
 divisoresNum[posDivisor]=d;
 posDivisor++;
 }
 }

 static int suma(int[] divisores){
 int sumaTotal=0;
 for (int s=0; s<divisores.length; s++)
 sumaTotal=sumaTotal+divisores[s];
 return sumaTotal;
 }

 static void muestraDivisores(int[] divisores){
 for (int d=0; d<divisores.length; d++){
 if (divisores[d]!=0)
 System.out.print(divisores[d]+" + ");
 }
 System.out.println(" = "+suma(divisores));
 }

 public static void main(String[] args){
 System.out.println("Introduce un número entero positivo");
 int N=TECLADO.nextInt();
 int[] divisoresN=new int[N];
 System.out.println("Introduce otro número entero positivo");
 int M=TECLADO.nextInt();
 int[] divisoresM=new int[M];
 if (amigos(N,M, divisoresN, divisoresM)){
 System.out.println(N+" y "+M+" son amigos");
 System.out.println("Divisores de "+N);
 muestraDivisores(divisoresN);
 System.out.println("Divisores de "+M);
 muestraDivisores(divisoresM);
 }
 }
 }
