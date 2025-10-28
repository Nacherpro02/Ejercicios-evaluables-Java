/*
 * Realiza un programa que convierta un número decimal(base 10) 
 * en su representación binaria. Hay que tener en cuenta que 
 * desconocemos cuántas cifras tiene el número que introduce el Usuario.
 * 
 * 
*/


package Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numero para convertirlo a binario: ");
		int num = sc.nextInt();
		String binario = "";
		
		while (num > 0) {
			int resto = num % 2;
			binario = resto + binario;
			num = num/2;
		}
		System.out.print(binario);
	}

}

