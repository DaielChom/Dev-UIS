package trabajoUDI;

import java.util.ArrayList;
import java.util.Scanner;

public class Paquetes {

	public static void main(String[] args) {
		
		boolean salir = true;
		ArrayList<String[]> pedidos = new ArrayList<String[]>();
		
		
		System.out.println("Bienvenido");
		Scanner ingreso = new Scanner(System.in);
		
		do {
			System.out.println("Porfavor ingrese la cedula del usuario: ");
			String[] pedido = new String[2];
			pedido[0] = ingreso.next();
			System.out.println("cantidad de pedidos: ");
			pedido[1] = ingreso.next();			
			pedidos.add(pedido);
			
			System.out.println("¿Finalizo el dia?");
			if("si".equals(ingreso.next())){
				salir = false;
			}			
		} while (salir == true);
		
		int mayor = 0;
		int aux = 0;
		int total = 0;
		
		for (int i = 0; i < pedidos.size(); i++) {
			
			System.out.println("Cliente: " + pedidos.get(i)[0] + " Cantidad" + pedidos.get(i)[1]);
			
			if(Integer.parseInt(pedidos.get(i)[1]) > mayor){
				mayor =  Integer.parseInt(pedidos.get(i)[1]);
				aux = i;
			}
			
			total = total + Integer.parseInt(pedidos.get(i)[1]);
		}
		
		System.out.println("Cliente que mas vendio: " + pedidos.get(aux)[0] + " Cantidad: " + mayor);
		System.out.println("Total de pedidos: " + total);
		System.out.println("Valor recibido " + total * 20000);
		
	}
}
