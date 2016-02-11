package ejercicio;

import java.awt.Color;
import java.util.ArrayList;

import tratamiento.Imagen;


public class Tablero extends Imagen{

	private ArrayList<Figura> figuras;
	
	
	public Tablero(int ancho, int alto) {
		super(ancho, alto);
		// TODO Auto-generated constructor stub
		
		figuras = new ArrayList<>();
		
		for (int i = 0; i < ancho; i++) {
			for (int j = 0; j < alto; j++) {
				setColor(i, j, new Color(255,255,255));
			}
		}
	}

	public void agregarFigura(Figura figura) {
		// TODO Auto-generated method stub
		figuras.add(figura);

	}

	public ArrayList<Figura> getFiguras() {
		return figuras;
	}

	public void setFiguras(ArrayList<Figura> figuras) {
		this.figuras = figuras;
	}
	
	public void dibujarFigura() {
		// TODO Auto-generated method stub
		for (int i = 0; i < figuras.size(); i++) {
			figuras.get(i).dibujar(this);
		}

	}
	
	

}
