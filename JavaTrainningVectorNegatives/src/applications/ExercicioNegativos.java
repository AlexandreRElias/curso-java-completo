package applications;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNegativos {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you type? Quantity: ");
		int n;
		n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {

			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}

		System.out.printf("NUMEROS NEGATIVOS:\n");

		for (int i = 0; i <= vect.length - 1; i++) {

			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}
}
