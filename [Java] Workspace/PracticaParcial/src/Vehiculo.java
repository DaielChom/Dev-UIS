public abstract class Vehiculo {

	private int numeroRegistrados;
	private double porsentajeRecargo;
	private double tarifaAplicada;
	private int tipo;
	private int tarifaBase;
	
	public void setNumeroRegistrados(int numeroRegistrados) {
		this.numeroRegistrados = numeroRegistrados;		
	}

	public double getPorsentajeRecargo() {
		return porsentajeRecargo = numeroRegistrados*0.05;
	}
	
	public abstract double getTarifaAplicada();

	public abstract int getTipo();

	@Override
	public String toString() {
		return "Vehiculo [tarifaAplicada=" + getTarifaAplicada() + ", tipo=" + getTipo()
				+ "]";
	}

	

	
	
}
