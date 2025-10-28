/*
 * Calcula la raíz cuadrada de un número natural mediante aproximaciones. En el caso 
 * de que no sea exacta, muestra el resto. Por ejemplo, para calcular la raíz cuadrada
 *  de 23,probamos 12 = 1, 22  = 4, 32  =9, 42  = 16, 52  = 25 (nos pasamos), 
 *  resultando 4 la raíz cuadrada de 23 con un resto (23 — 16) de 7.
 * 
*/


package Ejercicios;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el numero a: ");
		int num = sc.nextInt();
		int raiz = 0;
		
		for (int i=0;i<num;i++) {
			int cuadrado = i*i;
			if (cuadrado == num || cuadrado < num) {
				raiz = i;
			}
		}
		
		if (raiz*raiz == num) {
			System.out.print("La raiz cuadrada de "+ num+ " es: "+raiz);
		}else {
			int resto = num - raiz*raiz;
			System.out.println("La raiz cuadrada de "+num+ " no es exacta...");
			System.out.print("Aproximadamente es: "+raiz+" y de resto: "+resto);
		}
	}

}
