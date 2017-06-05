import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Acrosaleatvector {

	public static void main(String[] args) throws IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		char vector[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char vector2[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		String vector3[] = new String[26];
		for (int i = 0; i <= 25; i++) {
			System.out.println("por favor digite la palabra por " + vector[i] + " o " + vector2[i] + " : ");
			vector3[i] = leer.readLine();

		}
		System.out.println(" ");
		System.out.println("por favor digite la palabra para realizar el acrostico ");
		String palabra = leer.readLine();
		System.out.println("por favor digite la segunda  palabra para realizar el acrostico ");
		String palabra2 = leer.readLine();
		System.out.println("por favor digite la tercera  palabra para realizar el acrostico ");
		String palabra3 = leer.readLine();
		int valor = palabra.length();
		int valor1 = palabra2.length();
		int valor2 = palabra3.length();
		char aux, aux2, aux3;
		int aleatorio = (int) Math.floor(Math.random() * 3);

		if (aleatorio == 0) {

			for (int j = 0; j < valor; j++) {

				aux = palabra.charAt(j);

				for (int a = 0; a <= 25; a++) {

					if ((vector[a] == aux) || (vector2[a] == aux)) {

						System.out.println(vector3[a]);
					}

				}
			}

		}

		else if (aleatorio == 1) {
			for (int j = 0; j < valor1; j++) {

				aux2 = palabra2.charAt(j);

				for (int a = 0; a <= 25; a++) {

					if ((vector[a] == aux2) || (vector2[a] == aux2)) {

						System.out.println(vector3[a]);
					}

				}
			}

		}

		else if (aleatorio == 2) {

			for (int j = 0; j < valor2; j++) {

				aux3 = palabra3.charAt(j);

				for (int a = 0; a <= 25; a++) {

					if ((vector[a] == aux3) || (vector2[a] == aux3)) {

						System.out.println(vector3[a]);
					}

				}
			}

		}

	}
}