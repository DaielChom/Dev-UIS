package leerArchivo;

import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;

public class test {

	// Ver http://stackoverflow.com/questions/2788080/reading-a-text-file-in-java
	public void leerArchivo(String nombreArchivo) {
		BufferedReader br = null;

		try {

			String linea;

			br = new BufferedReader(new FileReader(nombreArchivo));

			while ((linea = br.readLine()) != null) {
				String[] elementos = linea.split(",");
				System.out.println(linea);
				for (int i = 0; i < elementos.length; i++) {
					System.out.println(elementos[i]);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		test p = new test();
		p.leerArchivo("config.txt");
	}
}
