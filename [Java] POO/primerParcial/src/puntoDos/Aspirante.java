package puntoDos;

public class Aspirante {

	private String nombre;
	private int notNat, notSoc, notMat, notLeng;

	public Aspirante(String nombre, int notNat, int notSoc, int notMat,
			int notLeng) {

		this.nombre = nombre;
		this.notNat = notNat;
		this.notSoc = notSoc;
		this.notMat = notMat;
		this.notLeng = notLeng;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNotNat() {
		return notNat;
	}

	public void setNotNat(int notNat) {
		this.notNat = notNat;
	}

	public int getNotSoc() {
		return notSoc;
	}

	public void setNotSoc(int notSoc) {
		this.notSoc = notSoc;
	}

	public int getNotMat() {
		return notMat;
	}

	public void setNotMat(int notMat) {
		this.notMat = notMat;
	}

	public int getNotLeng() {
		return notLeng;
	}

	public void setNotLeng(int notLeng) {
		this.notLeng = notLeng;
	}

//	public double calSistem() {
//		double sis = (notNat * 0.25) + (notSoc * 0.20) + (notLeng * 0.20)
//				+ (notMat * 0.35);
//		return sis;
//	}
//
//	public double calIndus() {
//		double indu = (notNat * 0.20) + (notSoc * 0.15) + (notLeng * 0.35)
//				+ (notMat * 0.30);
//		return indu;
//	}
//
//	public double calMed() {
//		double med = (notNat * 0.30) + (notSoc * 0.25) + (notLeng * 0.25)
//				+ (notMat * 0.20);
//		return med;
//	}
//
//	public double calHist() {
//		double his = (notNat * 0.10) + (notSoc * 0.40) + (notLeng * 0.35)
//				+ (notMat * 0.15);
//		return his;
//	}
//
//	public double calEco() {
//		double eco = (notNat * 0.10) + (notSoc * 0.30) + (notLeng * 0.20)
//				+ (notMat * 0.40);
//		return eco;
//	}

	public double CalculaPuntaje(Carrera carrera){
		double nota=0;
		nota = (notMat*carrera.getPorMAt())+(notLeng*carrera.getPorLeng())+(notNat*carrera.getPorNAt())+(notSoc*carrera.getPorSoc());
		return nota;
	}
	
	
}
