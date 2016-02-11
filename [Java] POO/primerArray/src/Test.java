
public class Test {
	
	public static void main(String[] args) {
		GestionEstudiante estudiante = new GestionEstudiante();
		estudiante.agregar(new Estudiante("Juan", 3, 2.8));
		estudiante.agregar(new Estudiante("Pedrito", 7, 5));
		estudiante.agregar(new Estudiante("Pedrito", 7, 3));
		estudiante.agregar(new Estudiante("Pedrito", 2, 1));
		
		System.out.println(estudiante);
		
		double[] n = estudiante.calculaPromedio();
		for (int i = 0; i < n.length; i++) {
			System.out.println("nivel: "+(i+1) + " Promedio: "+n[i]);
			
		}
		
		
	}

}
