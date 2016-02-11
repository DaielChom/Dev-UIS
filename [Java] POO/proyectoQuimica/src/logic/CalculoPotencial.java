package logic;

public class CalculoPotencial {

	private double potecialSubCero, numMoles, exponenteA,
			exploneteB, exponenteC, exponenteD, consentracionA, consentracionB,
			consentracionC, consentracionD;
	

	public CalculoPotencial() {
		// TODO Auto-generated constructor stub
	}

	public CalculoPotencial(double resultado, double potecialSubCero,
			double numMoles, double ConstK, double exponenteA, double exploneteB,
			double exponenteC, double exponenteD, double consentracionA,
			double consentracionB, double consentracionC, double consentracionD) {
		super();
		this.potecialSubCero = potecialSubCero;
		this.numMoles = numMoles;
		this.exponenteA = exponenteA;
		this.exploneteB = exploneteB;
		this.exponenteC = exponenteC;
		this.exponenteD = exponenteD;
		this.consentracionA = consentracionA;
		this.consentracionB = consentracionB;
		this.consentracionC = consentracionC;
		this.consentracionD = consentracionD;
	}	

	public double getPotecialSubCero() {
		return potecialSubCero;
	}

	public void setPotecialSubCero(double potecialSubCero) {
		this.potecialSubCero = potecialSubCero;
	}

	public double getNumMoles() {
		return numMoles;
	}

	public void setNumMoles(double numMoles) {
		this.numMoles = numMoles;
	}

	public double getExponenteA() {
		return exponenteA;
	}

	public void setExponenteA(double exponenteA) {
		this.exponenteA = exponenteA;
	}

	public double getExploneteB() {
		return exploneteB;
	}

	public void setExploneteB(double exploneteB) {
		this.exploneteB = exploneteB;
	}

	public double getExponenteC() {
		return exponenteC;
	}

	public void setExponenteC(double exponenteC) {
		this.exponenteC = exponenteC;
	}

	public double getExponenteD() {
		return exponenteD;
	}

	public void setExponenteD(double exponenteD) {
		this.exponenteD = exponenteD;
	}

	public double getConsentracionA() {
		return consentracionA;
	}

	public void setConsentracionA(double consentracionA) {
		this.consentracionA = consentracionA;
	}

	public double getConsentracionB() {
		return consentracionB;
	}

	public void setConsentracionB(double consentracionB) {
		this.consentracionB = consentracionB;
	}

	public double getConsentracionC() {
		return consentracionC;
	}

	public void setConsentracionC(double consentracionC) {
		this.consentracionC = consentracionC;
	}

	public double getConsentracionD() {
		return consentracionD;
	}

	public void setConsentracionD(double consentracionD) {
		this.consentracionD = consentracionD;
	}

	@Override
	public String toString() {
		return "CalculoPotencial [potecialSubCero=" + potecialSubCero
				+ ", numMoles=" + numMoles + ", exponenteA=" + exponenteA
				+ ", exploneteB=" + exploneteB + ", exponenteC=" + exponenteC
				+ ", exponenteD=" + exponenteD + ", consentracionA="
				+ consentracionA + ", consentracionB=" + consentracionB
				+ ", consentracionC=" + consentracionC + ", consentracionD="
				+ consentracionD + "]";
	}

	public double CaalculoPotencial(double potecialSubCero, double numMoles,
			double exponenteA, double exploneteB, double exponenteC,
			double exponenteD, double consentracionA, double consentracionB,
			double consentracionC, double consentracionD) {
		double resultado = 0;
		double Constk = 0;
		
		Constk = ((Math.pow(consentracionC, exponenteC))*(Math.pow(consentracionD, exponenteD)))/((Math.pow(consentracionA, exponenteA))*(Math.pow(consentracionB, exploneteB)));
		resultado = potecialSubCero-((0.0592/numMoles)*(Math.log10(Constk)));

		return resultado;
	}
	
	
	
	
	public static void main(String[] args) {
		CalculoPotencial calculo = new CalculoPotencial();
		System.out.println(calculo.CaalculoPotencial(-0.16,2, 1,1, 1, 1, 0.68,1,0.15, 1));
	}

}
