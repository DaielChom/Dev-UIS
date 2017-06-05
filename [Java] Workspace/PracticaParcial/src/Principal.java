
public class Principal {
	public static void main(String[] args) {
		
		Ferry ferry = new Ferry();
		Bicicleta bic1 = new Bicicleta();
		Carro car1 = new Carro();
		Carro car2 = new Carro();
		Moto mot = new Moto();
		Bicicleta bic2 = new Bicicleta();
		
		ferry.registrarVehiculo(bic1);
		ferry.registrarVehiculo(car1);
		ferry.registrarVehiculo(car2);
		ferry.registrarVehiculo(mot);
		ferry.registrarVehiculo(bic2);
		System.out.println(ferry.calculaTotal());
		System.out.println(ferry.getNumCarros());
		System.out.println(ferry.getNumerobicicletas());
		System.out.println("Motos: "+ ferry.getNumMotos());
		for (int i = 0; i < ferry.getVehiculos().size(); i++) {
			System.out.println(ferry.getVehiculos().get(i));
			
		}
		
	}

}
