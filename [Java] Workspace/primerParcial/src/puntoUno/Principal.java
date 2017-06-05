package puntoUno;

public class Principal {

	public static void main(String[] args) {
		Imagen imagen = new Imagen(100, 100);
		for (int i = 0; i < 100; i=i+10) {
			for (int j = 0; j < 100; j=j+10) {
				Color c = new Color(0, 0, 0);
				imagen.modificar(c, i, i);
				imagen.modificar(c,j, i);
				
			}
			
		}
	}

}
