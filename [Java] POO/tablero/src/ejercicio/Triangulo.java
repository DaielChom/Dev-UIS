package ejercicio;

import java.awt.Color;

public class Triangulo extends Figura {

	int base;
	int altura;

	public Triangulo(int x, int y, int base, int altura) {
		super(x, y);
		// TODO Auto-generated constructor stub
		this.base = base;
		this.altura = altura;
	}

	@Override
	public void dibujar(Tablero tablero) {
		// TODO Auto-generated method stub
		super.dibujar(tablero);
		for (int i = 0; i <= base; i++) {
			tablero.setColor(getX() + i, getY(), new Color(0, 0, 0));

			for (int j = 0; j <= altura; j++) {
				tablero.setColor(getX(), getY() + j, new Color(0, 0, 0));
				//double pendiente = 

			}
		}
	}

}
