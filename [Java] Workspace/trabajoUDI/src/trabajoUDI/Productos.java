package trabajoUDI;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Productos {

	public static void main(String[] args) {
		

		
		int n= Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de productos a registrar: "));
		
				double P []= new double [n];
				for(int i=0; i<n; i++){
					
					
					double num = Double.parseDouble(JOptionPane.showInputDialog("Producto "+i+" Digite el valor de la venta: "));
					P[i]= num;
					
					
				}
				
				
				double menor=100000;
				int pos=0;
				for (int j=0; j<n; j++){
					if(P[j]<menor){
						menor=P[j];
						pos=j;
					}
					
				}
				JOptionPane.showMessageDialog(null, "El producto:  "+ pos + " tiene la menor venta con "+ menor );
				
				// se recorre el vectro para encotrar la mayor venta de producto
				
				double mayor=1;
				int posicion=0;
				for (int j=0; j<n; j++){
					if(P[j]>mayor){
						mayor=P[j];
						posicion=j;
					}
					
				}
				JOptionPane.showMessageDialog(null, "El producto:  "+ posicion + " tiene la mayor venta con "+ mayor );
				
				// se suman las ventas para obtener el promedio 
				double total=0;
				for(int i=0; i<n; i++){
					total=total+P[i];
				}
				double promedio= total / n;
				
				JOptionPane.showMessageDialog(null, "El promedio de las ventas es: "+ promedio);
				
				// ordenamiento del vector de ventas
				// se utiliza el ordenamiento de burbuja
				
				for(int i=1; i<n; i++){
					for(int j=0 ;j<(n-i); j++){
						
						if(P[j] < P[j+1]){
							double aux=P[j];
							P[j]= P[j+1];
							P[j+1]=aux;
						}
					}
				}
				
				// imprimiendo las ventas
				JOptionPane.showMessageDialog(null, "Ventas ordenadas de mayor a menor: ");
				for(int i=0; i<n; i++){
					JOptionPane.showMessageDialog(null, P[i]+ "//");
				}
	}

}