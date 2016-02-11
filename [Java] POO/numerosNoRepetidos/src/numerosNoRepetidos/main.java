package numerosNoRepetidos;
import java.util.ArrayList;


public class main {
	public static void main(String[] args) {
		
		String d = new String();
		//ArrayList m = new ArrayList();
		char[] n = new char[4];
		int p,x=0;
		for (int i = 1000; i <=9999; i++) {
			
			d =d.valueOf(i);
			
			p = d.length();
			for (int j = 0; j <p; j++) {
				n[j]= d.charAt(j);
				}
			
			
			for (int j = 0; j <p; j++) {
					for (int j2 = j+1; j2 < p; j2++) {
					if(n[j]==n[j2]){x++;}
					
				}
				
				
			}
			
			
			
		}
	}

}
