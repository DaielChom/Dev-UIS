package ejercicio;

import java.awt.Color;

import tratamiento.Imagen;

public class ImagenTratada extends Imagen {

	public ImagenTratada(String nombreArchivo) {
		super(nombreArchivo);
		// TODO Auto-generated constructor stub
	}
	
	

	public ImagenTratada(int ancho, int alto) {
		super(ancho, alto);
		// TODO Auto-generated constructor stub
	}


	public void transformarGris() {

		for (int i = 0; i < getAncho(); i++) {
			for (int j = 0; j < getAlto(); j++) {

				Color Iluminancia = getColor(i, j);
				int b = (int) (Iluminancia.getBlue() * 0.114);
				int g = (int) (Iluminancia.getGreen() * 0.587);
				int r = (int) (Iluminancia.getRed() * 0.299);
				int popo = b + g + r;
				Color c = new Color(popo, popo, popo);

				setColor(i, j, c);

			}
		}
	}

	
	public void trasformarUmbral(int umbral) {

		for (int i = 0; i < getAncho(); i++) {
			for (int j = 0; j < getAlto(); j++) {

				Color Iluminancia = getColor(i, j);
				int b = (int) (Iluminancia.getBlue() * 0.114);
				int g = (int) (Iluminancia.getGreen() * 0.587);
				int r = (int) (Iluminancia.getRed() * 0.299);
				int popo = b + g + r;

				if (umbral < popo) {
					setColor(i, j, new Color(0, 0, 0));
				} else {
					setColor(i, j, new Color(popo, popo, popo));

				}

			}

		}

	}
	
	public void pintarLinea(int x1, int y1, int x2, int y2){
		
		int terminoy = y2-y1;
		int terminox = x2-x1;
		double pendiente = terminoy*1.0/terminox;
				
		
	for (int i = x1; i < x2; i++) {
				
			double y = pendiente*(i-x1)+y1;
			setColor(i,(int) y, new Color(255,255,255));
							
	}		
		
	}
	
	
	public void pintarCuadrado(){}
	
	
	
	
	
	
}