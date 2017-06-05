package trabajoUDI;

import java.util.Scanner;

public class calificarExamen{	
	
	public static void main(String[] args) {
		
	
		int numero_preuntas;
		int[] notas = new int[5];
		
		//Ingresa al sistema el numero de preguntas del examen
		System.out.println("Por favor digite el numero de preguntas que tenia el examen");
		Scanner ingreso = new Scanner(System.in);
		numero_preuntas = ingreso.nextInt();
		
		//define vectores de caracteres para almacenar las respuestas de los estudantes y las preguntas correctas
		String[][] respuestas_estudiantes = new String[5][numero_preuntas];
		String[] respuestas_correctas = new String[numero_preuntas];
		
		//Almacenar los resutlados de los estudiantes
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < numero_preuntas; j++) {
				System.out.println("Porfavor ingrese la respuesta a la pregunta " + (j+1) + "del estudiante " + (i+1));
				respuestas_estudiantes[i][j] = ingreso.next();	
			}			
		}
		
		//Almacena las respuestas correctas
		for (int i = 0; i < numero_preuntas; i++) {
			System.out.println("Porfavor ingresar las respuestas correctas");
			respuestas_correctas[i] = ingreso.next();
		}
		
		//Verifica si el estudiante respondio bien o mal
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < numero_preuntas; j++) {
				if(respuestas_estudiantes[i][j].equals(respuestas_correctas[j])){
					respuestas_estudiantes[i][j] = "1";
				}
				else
					respuestas_estudiantes[i][j] = "0";
			}
		}
		
		//Califica a los estudiantes
		for (int i = 0; i <= 4; i++) {
			int contador = 0;
			for (int j = 0; j < numero_preuntas; j++) {
				if(respuestas_estudiantes[i][j]=="1"){
					contador++;
				}
			notas[i] = contador*5 /numero_preuntas;
					
			}
		}
		
		//Imprime las notas
		for (int i = 0; i <= 4; i++) {			
			System.out.print("Nota del estudiante "+(i+1)+": "+notas[i]);
			if(notas[i]>=3.2){
				System.out.println(" APROBO!!");
			}
			else{
				System.out.println(" REPROBO!!");
			}
				
			
		}
		
		
		
		
	}
}
