package trabajoUDI;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class calificarExamen{	
	
	public static void main(String[] args) {
		
	
		int numero_preuntas;
		int[] notas = new int[5];
		

		numero_preuntas = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite el numero de preguntas que tenia el examen"));
		
		String[][] respuestas_estudiantes = new String[5][numero_preuntas];
		String[] respuestas_correctas = new String[numero_preuntas];
		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < numero_preuntas; j++) {
				
				respuestas_estudiantes[i][j] = JOptionPane.showInputDialog("Porfavor ingrese la respuesta a la pregunta " + (j+1) + "del estudiante " + (i+1));
			}			
		}
		
		for (int i = 0; i < numero_preuntas; i++) {
			respuestas_correctas[i] = JOptionPane.showInputDialog("Porfavor ingresar las respuestas correctas");
		}
		
		for (int i = 0; i <= 4; i++) {
			
			int contador = 0;
			for (int j = 0; j < numero_preuntas; j++) {
				
				if(respuestas_estudiantes[i][j].equals(respuestas_correctas[j])){
					contador++;
				}
				
		}
			notas[i] = contador*5 /numero_preuntas;
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
