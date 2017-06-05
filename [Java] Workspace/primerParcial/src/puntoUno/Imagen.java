package puntoUno;

public class Imagen {

	private int ancho, alto;
	private Color[][] pixeles;

	public Imagen(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
		pixeles = new Color[ancho][alto];
		
		
		for (int i = 0; i <ancho; i++) {
			for (int j = 0; j <alto; j++) {
				pixeles[i][j] = new Color(255, 255, 255);				
			}
		}
	}
	
	public Color Obtener(int x, int y){
		Color temp = pixeles[x][y];
		return temp;
		
	}
	
	public void modificar(Color c, int x, int y){
		pixeles[x][y]=c;
		
		
	}

}
