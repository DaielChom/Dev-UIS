package trabajoUDI;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Fabrica {
	
		public static void main(String[] args) {
						
			
			int n= Integer.parseInt(JOptionPane.showInputDialog("Escriba el numero de fabricas a registrar: "));
			int f []= new int [n];
			
			
			for(int i=0; i<n; i++){
				
				int num = Integer.parseInt(JOptionPane.showInputDialog("Fabrica "+i+" Escriba el numero de productos: "));
				f[i]= num;				
			}
			
			int resp=1;
			while(resp>0){
				JOptionPane.showMessageDialog(null, "Estadisticas de los productos \n ///////////////////////////////// \n 1. Fabrica de mayor produccion \n 2. Fabrica de menor produccion \n 3. Promedio de los productos \n 4. Fabricas superiores al promedio e inferiores \n  5. Salir ");
				resp = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opcion"));
				
				switch (resp){
				
				case 1:
					int mayor=1;
					int posicion=0;
					
					for (int j=0; j<n; j++){
						
						if(f[j]>mayor){
							mayor=f[j];
							posicion=j;
						}
						
					}
					JOptionPane.showMessageDialog(null, "La fabrica:  "+ posicion + " tiene la mayor produccion con "+ mayor +" productos");
					break;
				
				case 2:
					int menor=100000;
					int pos=0;
					for (int j=0; j<n; j++){
						if(f[j]<menor){
							menor=f[j];
							pos=j;
						}
						
					}
					JOptionPane.showMessageDialog(null, "La fabrica:  "+ pos + " tiene la menor produccion con "+ menor +" productos");
					break;
					
				case 3: 
					int total=0;
					for(int i=0; i<n; i++){
						total=total+f[i];
					}
					float promedio= total / n;
					
					JOptionPane.showMessageDialog(null, "El promedio de productos es: "+ promedio);
					break;
				
				
				case 4: 
					int todas=0;
					for(int i=0; i<n; i++){
						todas=todas+f[i];
					}
					float prom= todas / n;
					
					String fabricassup="Las fabricas superiores al promedio son: ";
					String fabricasinf="Las fabricas inferiores al promedio son: ";
					
					for(int j=0; j<n; j++){
						if (f[j]>prom){
							fabricassup += j+ ", ";
						}else{
							fabricasinf += j+ ", ";
						}
						
					}
					JOptionPane.showMessageDialog(null, fabricassup);
					JOptionPane.showMessageDialog(null, fabricasinf);
					break;
				
				case 5: 
					
				    break;
					
				
				
			}

		}

	}
	}

	
