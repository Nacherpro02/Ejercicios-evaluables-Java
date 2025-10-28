/*
 * Para dos números dados, a y b, es posible buscar el máximo común divisor 
 * (el número más grande que divide a ambos) mediante un algoritmo ineficiente 
 * pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente, 
 * el primer número que divide a ambos simultáneamente. Realiza un programa 
 * que calcule el máximo común divisor de dos números.
 *  
*/



package Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numero a: ");
		int a = sc.nextInt();
		System.out.print("Introduce el numero b: ");
		int b = sc.nextInt();
		int num_f = 0;
		int divisor = 0;
		
		if (a < b) {
			num_f = a;
		}else {
			num_f = b;
		}
		
		for (int i=num_f; i>0;i--) {
			if (a % i == 0 && b % i == 0) {
				divisor = i;
				break;
			}
		}
		System.out.print("El maximo comun divisor es el: "+divisor);
		
	}

}
