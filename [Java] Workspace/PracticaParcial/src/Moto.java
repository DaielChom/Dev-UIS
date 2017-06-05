
public class Moto extends Vehiculo {



	@Override
	public double getTarifaAplicada() {
		// TODO Auto-generated method stub
		
		return 20000+(20000*getPorsentajeRecargo());
	}

	@Override
	public int getTipo() {
		// TODO Auto-generated method stub
		return 2 ;
	}
	
}
