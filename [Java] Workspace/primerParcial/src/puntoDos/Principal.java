package puntoDos;
import java.util.Random;


public class Principal {

   public static void main(String[] args) {
      Aspirante[] aspirantes = new Aspirante[2000];
      int numAspirantes = 0;
      Carrera carrera1 = new Carrera("Sistemas", 0.35, 0.20, 0.20, 0.25, 75.2);
      Carrera carrera2 = new Carrera("Industrial", 0.30, 0.35, 0.15, 0.20,74.5);
      Carrera carrera3 = new Carrera("Medicina", 0.20, 0.25, 0.25, 0.30, 81.5);
      Carrera carrera4 = new Carrera("Historia",0.15, 0.35,0.40,  0.10, 66.7);
      Carrera carrera5 = new Carrera("Economia",0.40, 0.20, 0.30, 0.10, 70.4);
      
      Random rn = new Random();
      numAspirantes = 800;
      
      for (int i=0;i<numAspirantes;i++) {
         Aspirante asp;
         
         String nombre = "Pedro Perez " + i;
         int cn = 10 + rn.nextInt(90);
         int cs = 10 + rn.nextInt(90);
         int len = 10 + rn.nextInt(90);
         int mat = 10 + rn.nextInt(90);
         
         
         if (i==200) {
            asp = new Aspirante(nombre, 99, 99, 99, 99);
         } else {
            if (i==400) {
               asp = new Aspirante(nombre, 1, 1, 1, 1);
            } else {
               asp = new Aspirante(nombre, cn, cs, len, mat);   
            }            
         }
         aspirantes[i] = asp;
         
         
      }
      
      
      
//      for (int i = 0; i <numAspirantes; i++) {
//    	  
//    	  System.out.println(aspirantes[i].getNombre());
//    	  System.out.println("Ingeneria de Sistemas: "+aspirantes[i].calSistem()+" Diferencia: "+(aspirantes[i].calSistem()-75.2));
//    	  System.out.println("Ingeneira Industrial: "+ aspirantes[i].calIndus()+" Diferencia: "+(aspirantes[i].calIndus()-74.5));
//    	  System.out.println("Medicina: "+ aspirantes[i].calMed() + " Difenrencia: "+(aspirantes[i].calMed()-81.5));
//    	  System.out.println("Historia: "+aspirantes[i].calHist()+" Diferencia: "+ (aspirantes[i].calHist()-66.7));
//    	  System.out.println("Economia: "+ aspirantes[i].calEco() + " Difenrecia: "+(aspirantes[i].calEco()-70.4));
//    	  System.out.println();	
//	}
//      
//      System.out.println("Ingenera de Sistemas");
//      
//      double aux =0;
//      double aux2=0;
//      double max=0;
//      double min = 999;
//      int maxsis=0;
//      int minSis = 0;
//      double promedio=0;
//      
//      for (int i = 0; i < numAspirantes; i++) {
//    	 aux = aspirantes[i].calSistem();
//    	 promedio = promedio + aspirantes[i].calSistem();
//    	 if(aux>max){
//    		 max= aux;
//    		 maxsis=i;    		 
//    	 }		
//	}
//      
//      for (int j = 0; j < numAspirantes; j++) {
//     	 aux2 = aspirantes[j].calSistem();
//     	 if(aux2<min){
//     		 min = aux2;
//     		 minSis = j; 
//     		 
//     	 }		
// 	}          
//      System.out.println("el estudiante con la mayor nota es: " + aspirantes[maxsis].getNombre());
//      System.out.println("el estudiante con la menor nota es: " + aspirantes[minSis].getNombre());
//      System.out.println("el promedio de la carrera es: "+ (promedio/numAspirantes));
//      System.out.println();	
//      
//      
//      
//      
//      System.out.println("Ingenera Industrial");
//      double auxIndu =0;
//      double auxIndu2=0;
//      double maxIndu=0;
//      double minIndu = 999;
//      int Indu=0;
//      int Indu2 = 0;
//      double promedioIndu=0;
//      
//      for (int i = 0; i < numAspirantes; i++) {
//    	 auxIndu = aspirantes[i].calIndus();
//    	 promedioIndu = promedioIndu + aspirantes[i].calIndus();
//    	 if(auxIndu>maxIndu){
//    		 maxIndu= auxIndu;
//    		 Indu=i;    		 
//    	 }		
//	}
//      
//      for (int j = 0; j < numAspirantes; j++) {
//     	 auxIndu2 = aspirantes[j].calIndus();
//     	 if(auxIndu2<minIndu){
//     		 minIndu = auxIndu2;
//     		Indu2 = j; 
//     		 
//     	 }		
// 	}          
//      System.out.println("el estudiante con la mayor nota es: " + aspirantes[Indu].getNombre());
//      System.out.println("el estudiante con la menor nota es: " + aspirantes[Indu2].getNombre());
//      System.out.println("el promedio de la carrera es: "+ (promedioIndu/numAspirantes));
//      System.out.println();	
//
//   
//      
//      
//      
//      System.out.println("Medicina");
//      double auxMed =0;
//      double auxMed2=0;
//      double maxMed=0;
//      double minMed = 999;
//      int Med=0;
//      int Med2 = 0;
//      double promedioMed=0;
//      
//      for (int i = 0; i < numAspirantes; i++) {
//    	 auxMed = aspirantes[i].calMed();
//    	 promedioMed = promedioMed + aspirantes[i].calMed();
//    	 if(auxMed>maxMed){
//    		 maxMed= auxMed;
//    		 Med=i;    		 
//    	 }		
//	}
//      
//      for (int j = 0; j < numAspirantes; j++) {
//     	 auxMed2 = aspirantes[j].calMed();
//     	 if(auxMed2<minMed){
//     		 minMed = auxMed2;
//     		Med2 = j; 
//     		 
//     	 }		
// 	}          
//      System.out.println("el estudiante con la mayor nota es: " + aspirantes[Med].getNombre());
//      System.out.println("el estudiante con la menor nota es: " + aspirantes[Med2].getNombre());
//      System.out.println("el promedio de la carrera es: "+ (promedioMed/numAspirantes));
//      System.out.println();	
//      
//      
//      
//      
//      
//      System.out.println("Historia");
//      double auxHis =0;
//      double auxHis2=0;
//      double maxHis=0;
//      double minHis = 999;
//      int His=0;
//      int His2 = 0;
//      double promedioHis=0;
//      
//      for (int i = 0; i < numAspirantes; i++) {
//    	 auxHis = aspirantes[i].calHist();
//    	 promedioHis = promedioHis + aspirantes[i].calHist();
//    	 if(auxHis>maxHis){
//    		 maxHis= auxHis;
//    		 His=i;    		 
//    	 }		
//	}
//      
//      for (int j = 0; j < numAspirantes; j++) {
//     	 auxHis2 = aspirantes[j].calHist();
//     	 if(auxHis2<minHis){
//     		 minHis = auxHis2;
//     		His2 = j; 
//     		 
//     	 }		
// 	}          
//      System.out.println("el estudiante con la mayor nota es: " + aspirantes[His].getNombre());
//      System.out.println("el estudiante con la menor nota es: " + aspirantes[His2].getNombre());
//      System.out.println("el promedio de la carrera es: "+ (promedioHis/numAspirantes));
//      System.out.println();	
//      
//      
//      
//      System.out.println("Econoimia");
//      double auxEco =0;
//      double auxEco2=0;
//      double maxEco=0;
//      double minEco = 999;
//      int Eco=0;
//      int Eco2 = 0;
//      double promedioEco=0;
//      
//      for (int i = 0; i < numAspirantes; i++) {
//    	 auxEco = aspirantes[i].calEco();
//    	 promedioEco = promedioEco + aspirantes[i].calEco();
//    	 if(auxEco>maxEco){
//    		 maxEco= auxEco;
//    		 Eco=i;    		 
//    	 }		
//	}
//      
//      for (int j = 0; j < numAspirantes; j++) {
//     	 auxEco2 = aspirantes[j].calHist();
//     	 if(auxEco2<minEco){
//     		 minEco = auxEco2;
//     		Eco2 = j; 
//     		 
//     	 }		
// 	}          
//      System.out.println("el estudiante con la mayor nota es: " + aspirantes[Eco].getNombre());
//      System.out.println("el estudiante con la menor nota es: " + aspirantes[Eco2].getNombre());
//      System.out.println("el promedio de la carrera es: "+ (promedioEco/numAspirantes));
//      System.out.println();	
      
      
      
      
      
      for (int i = 0; i <numAspirantes; i++) {
    	  System.out.println(aspirantes[i].getNombre());
    	  System.out.println(carrera1.getNombre()+" "+aspirantes[i].CalculaPuntaje(carrera1)+" Diferencia "+(aspirantes[i].CalculaPuntaje(carrera1)-carrera1.getNotCorte()));
    	  System.out.println(carrera2.getNombre()+" "+aspirantes[i].CalculaPuntaje(carrera2)+" Diferencia "+(aspirantes[i].CalculaPuntaje(carrera2)-carrera2.getNotCorte()));
    	  System.out.println(carrera3.getNombre()+" "+aspirantes[i].CalculaPuntaje(carrera3)+" Diferencia "+(aspirantes[i].CalculaPuntaje(carrera3)-carrera3.getNotCorte()));
    	  System.out.println(carrera4.getNombre()+" "+aspirantes[i].CalculaPuntaje(carrera4)+" Diferencia "+(aspirantes[i].CalculaPuntaje(carrera4)-carrera4.getNotCorte()));
    	  System.out.println(carrera5.getNombre()+" "+aspirantes[i].CalculaPuntaje(carrera5)+" Diferencia "+(aspirantes[i].CalculaPuntaje(carrera5)-carrera5.getNotCorte()));
    	  System.out.println();
	}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      

   }
   
      

}
