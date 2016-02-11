import java.util.ArrayList;
import java.util.Iterator;

public class GestionEstudiante {

	private ArrayList<Estudiante> listaEstudiantes;

	public GestionEstudiante() {
		listaEstudiantes = new ArrayList();
	}

	public void agregar(Estudiante est) {
		listaEstudiantes.add(est);
	}

	public void imprimirLista() {
		for (int i = 0; i < listaEstudiantes.size(); i++) {
			Estudiante est = listaEstudiantes.get(i);
			System.out.println(est.getPromedio());
		}
	}

	
	

	public double[] calculaPromedio() {
		double[] nivel  = new double[10];
		for (int i = 1; i <= 10; i++) {
			int cont = 0;
			double promedio = 0;
			double pomedioFinal = 0;
			for (int j = 0; j < listaEstudiantes.size(); j++) {

				if (listaEstudiantes.get(j).getNivel() == i) {

					promedio = promedio + listaEstudiantes.get(j).getPromedio();
					cont++;

				}

			}
			pomedioFinal = promedio/cont;
			nivel[i-1] = pomedioFinal;
		}return nivel;

	}

	@Override
	public String toString() {
		return "GestionEstudiante [listaEstudiantes=" + listaEstudiantes + "]";
	}

}
