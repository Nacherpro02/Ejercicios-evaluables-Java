/*
 * Realiza un programa para que el usuario pueda introducir un 
 * número en binario y el programa muestre su conversión a decimal.
 * 
 *
*/


package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el binario para convertirlo a decimal: ");
		int num = sc.nextInt();
		int num_respaldo = num;
		int longitud = 0;
		int num_final = 0;
		
		while (num_respaldo > 0) {
			num_respaldo = num_respaldo / 10;
			longitud++;
		}
		
		for(int i = 0; i<longitud;i++) {
			int digito = num % 10;
			if (digito == 1) {
				num_final += Math.pow(2, i);
			}
			num = num / 10;
		}
		System.out.print("Tu binario es el numero: "+num_final);
	}

}
