package Logic;

public class ListaPotencial {

	private String NombrePotencial;
	private double potencial;

	public ListaPotencial() {
		// TODO Auto-generated constructor stub
	}
	
	public ListaPotencial(String nombrePo, double potenci) {

		super();
		this.NombrePotencial = nombrePo;
		this.potencial = potenci;

	}

	
	public String getNombrePotencial() {
		return NombrePotencial;
	}

	public void setNombrePotencial(String nombrePotencial) {
		NombrePotencial = nombrePotencial;
	}

	public double getPotencial() {
		return potencial;
	}

	public void setPotencial(double potencial) {
		this.potencial = potencial;
	}

	@Override
	public String toString() {
		return "ListaPotencial [NombrePotencial=" + NombrePotencial
				+ ", potencial=" + potencial + "]";
	}

}
