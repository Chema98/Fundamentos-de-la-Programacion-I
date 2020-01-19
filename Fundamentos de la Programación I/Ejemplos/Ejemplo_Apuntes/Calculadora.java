package Ejemplo_Apuntes;
import java.util.Scanner;

public class Calculadora {
	private static Scanner tECLADO;

	public static void main(String[] args) {
	
	tECLADO = new Scanner (System.in);
			
	int a,b,c;
	double x1, x2;
  
	System.out.println("Este programa calcula las raíces reales de una ecuación de 2º grado de coeficientes enteros.");
	
	System.out.println("Porfavor, introduce el valor del coeficiente de x al cuadrado. Debe ser distinto de 0.");
	
	a=tECLADO.nextInt();
	
	System.out.println("Introduce el valor del coeficiente de x");
	
	b=tECLADO.nextInt();
	
	System.out.println("Introduce el valor del término independiente");
	
	c=tECLADO.nextInt();
	
	System.out.printf("\nLa ecuación que el programa va a resolver es %dx^2%dx+%d.", a,b,c);
	
	x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
	x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
	
	System.out.printf("Las soluciones de la ecuación son: \nX1=%.2f\nX2=%.2f", x1,x2);
	
	}
	
	
}
