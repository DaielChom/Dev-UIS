package ejercicio;

import tratamiento.Imagen;



public class PrincipalGris {

   public static void main(String[] args) {
 
	   
//	   ImagenTratada im = new ImagenTratada("padre.jpg");
//	   im.transformarGris();
//	   im.mostrar();
//	   
//	   im.trasformarUmbral(100);
//	   im.mostrar();

	   ImagenTratada im = new ImagenTratada(300,300);
	   im.pintarLinea(50, 10, 290, 150);
	   im.mostrar();
   }

}
