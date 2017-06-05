package Logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class GestionListaPotencial {
	
	
	private File archivo;
	private String separator, ruta;
	private ArrayList<ListaPotencial> listaPotenciales;
	
	public GestionListaPotencial() {
		
		listaPotenciales = new ArrayList<ListaPotencial>();
	}
	
	public GestionListaPotencial(ArrayList<ListaPotencial> listas){
		this.listaPotenciales = new ArrayList<ListaPotencial>();
	}
	
	
	
	
	public ArrayList<ListaPotencial> getListaPotenciales() {
		return listaPotenciales;
	}

	public void setListaPotenciales(ArrayList<ListaPotencial> listaPotenciales) {
		this.listaPotenciales = listaPotenciales;
	}
	

	
	
	
	
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public double calcularPotecnial(double potencialUno, double potencialDos, int ORUno, int ORDos){
		double resultado=0;
		
		//if (ORUno == 0){potencialUno= potencialUno*-1;}
		//if(ORDos==0){potencialDos = potencialDos*-1;}
		resultado = potencialUno + potencialDos;		
		return resultado;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String readerArchivo() throws IOException {

		archivo = new File(ruta);
		String salida = new String();
		FileReader lectura = new FileReader(archivo);
		BufferedReader linea = new BufferedReader(lectura);
		String aux = new String();
		while ((aux = linea.readLine()) != null) {
			salida += aux + "\n";
		}
		return salida;
	}

	public ArrayList<String> reader() throws IOException {

		ArrayList<String> datos = new ArrayList<String>();
		String contenido = readerArchivo();
		StringTokenizer tokens = new StringTokenizer(contenido, "\n");

		while (tokens.hasMoreTokens()) {

			String linea = tokens.nextToken();
			datos.add(linea);
		}

		return datos;
	}

	public ArrayList<ListaPotencial> readArchivo(String rutita) throws IOException {

		setRuta(rutita);
		
		
		ArrayList<String> lineas = reader();
		separator = "%";

		for (String s : lineas) {

			StringTokenizer t = new StringTokenizer(s, separator);
			ListaPotencial llamada = new ListaPotencial();
     		llamada.setPotencial(Double.parseDouble(t.nextToken()));
			llamada.setNombrePotencial(t.nextToken());
			listaPotenciales.add(llamada);
			

			
          
		}
		//System.out.println(llamadas);
		return listaPotenciales;
		
	}

	

	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "GestionListaPotencial [listaPotenciales=" + listaPotenciales
				+ "]";
	}
	
	

}
