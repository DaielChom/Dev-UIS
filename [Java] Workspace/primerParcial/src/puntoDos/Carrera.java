package puntoDos;
public class Carrera {

	private String nombre;
	private double porMAt;
	private double porLeng;
	private double porSoc;
	private double porNAt;
	private double notCorte;
	
	
	public Carrera(String nombre, double porMAt, double porLeng, double porSoc,
			double porNAt, double notCorte) {
		this.nombre = nombre;
		this.porMAt = porMAt;
		this.porLeng = porLeng;
		this.porSoc = porSoc;
		this.porNAt = porNAt;
		this.notCorte = notCorte;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPorMAt() {
		return porMAt;
	}
	public void setPorMAt(double porMAt) {
		this.porMAt = porMAt;
	}
	public double getPorLeng() {
		return porLeng;
	}
	public void setPorLeng(double porLeng) {
		this.porLeng = porLeng;
	}
	public double getPorSoc() {
		return porSoc;
	}
	public void setPorSoc(double porSoc) {
		this.porSoc = porSoc;
	}
	public double getPorNAt() {
		return porNAt;
	}
	public void setPorNAt(double porNAt) {
		this.porNAt = porNAt;
	}
	public double getNotCorte() {
		return notCorte;
	}
	public void setNotCorte(double notCorte) {
		this.notCorte = notCorte;
	}
	

}
