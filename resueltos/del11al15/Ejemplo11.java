package del11al15;

import java.util.Scanner;

//Diseña un algoritmo que lea dos valores y los muestre en orden ascendente.
public class Ejemplo11 {
	public static void main(String argv[]) {
		int numero;
		int numero2;
		Scanner miScanner;
		
		System.out.println("Introduce un número entero:");

		// Leer un carácter como int desde el teclado
		miScanner = new Scanner(System.in);
		numero = miScanner.nextInt();

		System.out.println("Introduce otro número entero:");
		numero2 = miScanner.nextInt();
		
		// Si las condiciones son mutuamente excluyentes, se usa if .. else
		if (numero > numero2) {
			System.out.println(numero + " " + numero2);
		} else {
			System.out.println(numero2 + " " + numero);
		}
		
		miScanner.close();
	}
}
