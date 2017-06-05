import java.util.ArrayList; 

public class Ferry {
	
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	
	private int numerobicicletas;
	private int numMotos;
	private int numCarros;
	
	public double registrarVehiculo(Vehiculo veh){
		
		veh.setNumeroRegistrados(vehiculos.size());
		vehiculos.add(veh);
		return veh.getTarifaAplicada();
		
	}
	
	public double calculaTotal() {
		double in = 0;
		for (int i = 0; i < vehiculos.size(); i++) {
			in = in + vehiculos.get(i).getTarifaAplicada();
			
		}
		return in;

	}

	public int getNumerobicicletas() {
		int cont =0;
		for (int i = 0; i < vehiculos.size(); i++) {
			if(vehiculos.get(i).getTipo()==1){
				cont++;
			}
			
		}return cont;
	}

	public int getNumMotos() {
		int cont =0;
		for (int i = 0; i < vehiculos.size(); i++) {
			if(vehiculos.get(i).getTipo()==2){
				cont++;
			}
			
		}return cont;
	}

	public int getNumCarros() {
		int cont =0;
		for (int i = 0; i < vehiculos.size(); i++) {
			if(vehiculos.get(i).getTipo()==3){
				cont++;
		//		vehiculos.
				
			}
			
		}return cont;
	}

	@Override
	public String toString() {
		return "Ferry [vehiculos=" + vehiculos + ", numerobicicletas="
				+ numerobicicletas + ", numMotos=" + numMotos + ", numCarros="
				+ numCarros + "]";
	}

	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}


	
}
