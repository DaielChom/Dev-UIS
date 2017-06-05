package ejercicio;

import java.awt.Color;

public class PrincipalFiguras {

   public static void main(String[] args) {
	   
	   Tablero tab = new Tablero(500, 500);
	  
	   Rectangulo rec = new Rectangulo(8,9,30,50);
	   Triangulo tri = new Triangulo(50, 8, 30,50);
	   
	   tab.agregarFigura(rec);
	   tab.agregarFigura(tri);
	   tab.dibujarFigura();
	   tab.mostrar();
	   

   }

}
