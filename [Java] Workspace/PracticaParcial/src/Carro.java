
public class Carro extends Vehiculo {

	
	@Override
	public double getTarifaAplicada() {
		// TODO Auto-generated method stub
		
		return 60000+(getPorsentajeRecargo()*60000);
	}

	@Override
	public int getTipo() {
		// TODO Auto-generated method stub
		return 3;
	}
	
}
