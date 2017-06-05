
public class Bicicleta extends Vehiculo{

	

	

	@Override
	public double getTarifaAplicada() {
		// TODO Auto-generated method stub
		
		return 5000+(5000*getPorsentajeRecargo());
	}

	@Override
	public int getTipo() {
		// TODO Auto-generated method stub
		return 1;
	}

	
	
	

}
