package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionEventos implements ActionListener{
	
	private VentanaPrincipal principal;
	public static final String AGREGAR="agregar";
	public static final String LIMPIAR="limpiar";
	public static final String CALCULAR="calcular";
	
	public GestionEventos(VentanaPrincipal ventana) {
		this.principal = ventana;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getActionCommand().equals(AGREGAR)) {
		  principal.agregar();
		}
		
		if (arg0.getActionCommand().equals(LIMPIAR)) {
			  principal.limpiar();
			}
		if (arg0.getActionCommand().equals(CALCULAR)) {
			  principal.calcular();
			}
		
		
	}

}
