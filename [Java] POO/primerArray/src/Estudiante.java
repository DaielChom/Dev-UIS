
public class Estudiante {
	
	   private String nombre;
	   private int nivel;
	   private double promedio;

	   public Estudiante(String nombre, int nivel, double promedio) {
	      this.nombre = nombre;
	      this.nivel = nivel;
	      this.promedio = promedio;
	   }

	   public int getNivel() {
	      return nivel;
	   }

	   public void setNivel(int nivel) {
	      this.nivel = nivel;
	   }

	   public double getPromedio() {
	      return promedio;
	   }

	   public void setDir(double promedio) {
	      this.promedio = promedio;
	   }

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", nivel=" + nivel
				+ ", promedio=" + promedio + "]";
	}



}
