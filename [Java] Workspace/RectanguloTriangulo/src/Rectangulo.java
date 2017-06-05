

public class Rectangulo {
	
	private double ladoA , ladoB;
	
	
	
	public Rectangulo(double ladoA, double ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	


	public double getLadoA() {
		return ladoA;
	}




	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}




	public double getLadoB() {
		return ladoB;
	}




	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}




	public double calculaAre() {
		return ladoA*ladoB;

	}
	
	public double calcularpe() {
		return 2*ladoA+2*ladoB;

	}
	

}
