package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GestionEventos implements ActionListener{
	
	private VentanaPrincipal principal;
	public static final String CALCULAR="agregar";

	public GestionEventos(VentanaPrincipal ventana) {
		this.principal = ventana;
		// TODO Auto-generated constructor stub
	}

	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals(CALCULAR)) {
			  principal.calcular();
			}
	}

}
