package trabajoUDI;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Estudiante {

	public static void main(String[] args) {
		
		
		
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de estudiantes a registrar: "));
		
				double E[]= new double [n];
				
				for(int i=0; i<n; i++){
					
			double num;		
				 num = Double.parseDouble(JOptionPane.showInputDialog("Estudiante "+i+" Escriba la nota: "));
					E[i]= num;
					
					
				}
		
				double menor = 100000;
				int pos=0;
				for (int j=0; j<n; j++){
					if(E[j]<menor){
						menor=E[j];
						pos=j;
					}
					
				}
				JOptionPane.showMessageDialog(null, "El estudiante:  "+ pos + " tiene la menor nota con "+ menor );
				
				
				double mayor=1;
				int posicion=0;
				for (int j=0; j<n; j++){
					if(E[j]>mayor){
						mayor=E[j];
						posicion=j;
					}
					
				}
				
				JOptionPane.showMessageDialog(null, "El estudiante:  "+ posicion + " tiene la mayor nota con "+ mayor);
				 
				double total=0;
				for(int i=0; i<n; i++){
					total=total+E[i];
				}
				double promedio= total / n;
				
				JOptionPane.showMessageDialog(null, "El promedio de notas es: "+ promedio);
	}

}
