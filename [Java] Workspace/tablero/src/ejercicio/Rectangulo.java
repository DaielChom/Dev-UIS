package ejercicio;

import java.awt.Color;

public class Rectangulo extends Figura{
	int ancho, alto;
	
	public Rectangulo(int x, int y,int ancho, int alto) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.ancho = ancho;
		this.alto = alto;
	
	}

	@Override
	public void dibujar(Tablero tablero) {
		// TODO Auto-generated method stub
		super.dibujar(tablero);
		for (int i = 0; i <=ancho; i++){
			tablero.setColor(getX()+i,getY(),new Color(0,0,0));
			tablero.setColor(getX()+i,getY()+alto,new Color(0,0,0));			
		}
		
		for (int i = 0; i <=alto; i++){
			tablero.setColor(getX(),getY()+i,new Color(0,0,0));
			tablero.setColor(getX()+ancho,getY()+i,new Color(0,0,0));			
		}
		
		
		
	}
}
