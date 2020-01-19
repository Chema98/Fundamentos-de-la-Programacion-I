package Ejemplo_Apuntes;
//Dadas las edades de una población de 100 personas, que se leerán por teclado, determinar cuántos son menores que 15, cuántos mayores que 35 y cuántos están
//comprendidos entre 18 y 55.

	import java.util.Scanner;
	public class MediaEdades {
		final static Scanner TECLADO=new Scanner(System.in);
		
		public static void main(String []args) {
			
			// Declaramos las variables:
			
		int edad, menor15=0, mayor35=0, entre1855=0, suma15=0, suma35=0, suma1855=0, sumatotal=0;
		float media15, media35, media1855, mediatotal;
		final float poblacion=5;
		
		
			// Para cada persona desde 1 hasta 100 hacer:
		
			for (int persona=1; persona <=poblacion; persona++){
			
			// Introducimos las edades de toda la población:
				
				System.out.println("Introduce la edad de la persona número "+persona);
				edad=TECLADO.nextInt();
				
			// Controlamos que se introduzca una edad correcta:
				
				while (edad<=0){
					System.out.println("Edad incorrecta, introduce un valor válido");
					edad=TECLADO.nextInt();	
				}
			
			// Procesamos las edades:
				
				sumatotal=sumatotal+edad;
				if (edad<15){
					menor15++;
					suma15=suma15+edad;
				}
				else {
					if (edad>=18 &&edad<=55){
						entre1855++;
						suma1855=suma1855+edad;
					}
					if (edad>=35){
						mayor35++;
						suma35=suma35+edad;
						
					}
				
				}
				
				// Calculamos las medias:
				
				if (menor15!=0){
					media15=suma15/menor15;
				}
				else media15=0;
				if (entre1855!=0){
					media1855=suma1855/entre1855;
				}
					else media1855=0;
				if (mayor35!=0){
					media35=suma35/mayor35;
				}
					else media35=0;
					
				mediatotal=sumatotal/poblacion;
				
					
				// Mostramos los resultados:
				
						System.out.printf("El número de personas que hay menores que 15 son %d;"
						 + "\nel número de personas que hay mayores que 35 es %d;"
						 + "\ny el número de personas entre 18 y 55 es de %d.\n", menor15, mayor35,
						entre1855);
						
						 System.out.printf("\nLa media de edad de los menores que 15 es %.1f;"
						 + "\nla media de la edad de los mayores que 35 es %.1f;"
						 + "\ny la media de la edad de los que están entre 18 y 55 es de %.1f.\n",
						media15, media35, media1855);
						
						 System.out.printf("\nLa media de edad de toda la población es de %.1f.\n",
						mediatotal);
						
						 
				
				
				
					 
			
					}
				
				} 
		
			}
		
	
