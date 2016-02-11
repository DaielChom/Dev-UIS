

public class Runner {
	

	
	
	
	public static void main(String[] args) {

		int contTRin=0, contREc=0;
		
		Rectangulo[] rect = new Rectangulo[5];
		rect[0] = new Rectangulo(11.2, 3);
		contREc++;
		rect[1] = new Rectangulo(8.9, 2.5);
		contREc++;
//		rect[2] = new Rectangulo(6, 2);
//		rect[3] = new Rectangulo(1, 2);
//		rect[4] = new Rectangulo(9, 2);
		
		
		Triangulo[] trian = new Triangulo[5];
		trian[0] = new Triangulo(13.3,8.5);
		contTRin++;
		trian[1] = new Triangulo(9.6,4);
		contTRin++;
//		trian[2] = new Triangulo(5,6);
//		trian[3] = new Triangulo(8,7);
//		trian[4] = new Triangulo(4,8);
		
		System.out.println("RECTANGULO");
		for (int i = 0; i < contREc; i++) {
			System.out.println("Area Del Rectangulo " + (i+1) + ":   " +rect[i].calculaAre());
			System.out.println("Perimetro Del Rectangulo " + (i+1) + ":   " +rect[i].calcularpe());
			System.out.println("");
		}
		
		
		System.out.println("TRIANGULO");
		for (int i = 0; i < contTRin; i++) {
			System.out.println("Area Del Triangulo " + (i+1) + ":   " +trian[i].calcularAR());
			System.out.println("Perimetro Del Triangulo " + (i+1) + ":   " +trian[i].calcularper());
			System.out.println("");
		}
		
		
		
		

	}

}
