package trabajoUDI;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Paquetes {

	public static void main(String[] args) {
		
		boolean salir = true;
		ArrayList<String[]> pedidos = new ArrayList<String[]>();
		
		
		JOptionPane.showMessageDialog(null, "Bienvenido");
		
		
		do {
			
			String[] pedido = new String[2];
			
			pedido[0] = JOptionPane.showInputDialog("Porfavor ingrese la cedula del usuario: ");
			pedido[1] = JOptionPane.showInputDialog("cantidad de pedidos: ");
			
			pedidos.add(pedido);
			
		
			if("si".equals(JOptionPane.showInputDialog("¿Finalizo el dia?"))){
				salir = false;
			}			
		} while (salir == true);
		
		int mayor = 0;
		int aux = 0;
		int total = 0;
		
		for (int i = 0; i < pedidos.size(); i++) {
			
			JOptionPane.showMessageDialog(null, "Cliente: " + pedidos.get(i)[0] + " Cantidad" + pedidos.get(i)[1]);
			
			if(Integer.parseInt(pedidos.get(i)[1]) > mayor){
				mayor =  Integer.parseInt(pedidos.get(i)[1]);
				aux = i;
			}
			
			total = total + Integer.parseInt(pedidos.get(i)[1]);
		}
		
		JOptionPane.showMessageDialog(null, "Cliente que mas vendio: " + pedidos.get(aux)[0] + " Cantidad: " + mayor);
		JOptionPane.showMessageDialog(null, "Total de pedidos: " + total);
		JOptionPane.showMessageDialog(null, "Valor recibido " + total * 20000);
		
	}
}
