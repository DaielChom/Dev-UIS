 
public class Triangulo extends Figura implements FiguraMediable, FiguraPosicionable {

	private int lado;
	private int x;
	private int y;
	
	public Triangulo(int lado){
		this.lado=lado;		
	}
	
	
	public void setposicion(int x, int y) {
		// TODO Auto-generated method stub
		this.x = x;
		this.y = y;
	}

	public double area() {
		// TODO Auto-generated method stub
		return (Math.pow(lado, 2))*(Math.sqrt(3)/4);
	}

	public double perimetro() {
		// TODO Auto-generated method stub
		return 3*lado;
	}

	public void dibujar() {
		// TODO Auto-generated method stub
		
	}

	
}
