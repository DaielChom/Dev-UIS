package error;

import java.util.Scanner;

public class Error {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner baka = new Scanner(System.in);
		double datos[];
		double media = 0;
		double aux = 0;
		double promedio = 0;
		double resultado=0;
		int n = 0;
		System.out.println("Ingrese cantidad de datos");
		n = baka.nextInt();
		datos = new double[n];
		
		System.out.println("ingrese los datos");
		for (int i = 0; i < n; i++) {
			
			
			datos[i] = baka.nextDouble();
			media = media + datos[i];	
						
		}
		aux = media/n;
		
		for (int i = 0; i < n; i++) {
			
			promedio = ((aux-datos[i])*(aux-datos[i]))/n;
		}
		resultado = Math.sqrt(promedio);
		System.out.println("suma" + media);
		System.out.println("media" + aux);
		System.out.println("error" + resultado);

	}

}

