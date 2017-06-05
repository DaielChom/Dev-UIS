package Logic;

import java.io.IOException;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GestionListaPotencial potencial = new GestionListaPotencial();
		
		try {
			potencial.readArchivo("archivos/datos.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0; i < potencial.getListaPotenciales().size(); i++){
			System.out.println(potencial.getListaPotenciales().get(i).getNombrePotencial());
		}
		
		
		System.out.println(potencial.calcularPotecnial(0,-1.52, 0,0));
		
	}

}
