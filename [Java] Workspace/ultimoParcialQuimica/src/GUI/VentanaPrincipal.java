package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.color.CMMException;
import java.io.IOException;

import javax.management.modelmbean.ModelMBeanConstructorInfo;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Logic.GestionListaPotencial;
import Logic.ListaPotencial;

public class VentanaPrincipal extends JFrame {

	private GestionEventos eventos;
	private int contadorAgregar = 0;
	private GestionListaPotencial potencial;
	private int PUno, PDos;
	private double resultado;
	private JLabel lbTitulo, lbspacio;
	private JRadioButton reduce, oxida;
	private JTextArea taResultado;
	private JButton btAgregar, btCAlcular, btLimpiar;
	private JTextField txNombreUno, txNombreDos, txPotencialUno,
			txPotencialDos, txOxiReduceUno, txOxiREducDos;
	private JPanel panel;
	private JTable jtNombres;
	private DefaultTableModel mtNombres;
	private GridBagConstraints quimLayout;

	public VentanaPrincipal() {

		setTitle("Parcial - Quimica - Daniel Carvajal");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		setIconImage(new ImageIcon("imagenes/quimica.png").getImage());
		setSize(670, 500);
		setResizable(false);

		eventos = new GestionEventos(this);
		potencial = new GestionListaPotencial();
		quimLayout = new GridBagConstraints();

		lbTitulo = new JLabel("Calculo De Reduccion Estandar");
		lbTitulo.setFont(new Font("Andalus", 0, 23));
		quimLayout.gridx = 0;
		quimLayout.gridy = 0;
		quimLayout.gridwidth = 5;
		quimLayout.gridheight = 1;
		quimLayout.weightx = 0.4;
		// quimLayout.weighty = 0.5;
		add(lbTitulo, quimLayout);

		String columnas[] = { "Reaccion", "Potencial" };
		mtNombres = new DefaultTableModel(columnas, 30);

		jtNombres = new JTable(mtNombres);
		jtNombres.setPreferredScrollableViewportSize(new Dimension(250, 350));
		quimLayout.gridx = 0;
		quimLayout.gridy = 1;
		quimLayout.gridwidth = 1;
		quimLayout.gridheight = 9;
		add(new JScrollPane(jtNombres), quimLayout);

		txNombreUno = new JTextField(20);
		txNombreUno.setDisabledTextColor(Color.BLACK);
		txNombreUno.setEnabled(false);
		quimLayout.gridx = 1;
		quimLayout.gridy = 2;
		quimLayout.gridwidth = 1;
		quimLayout.gridheight = 1;
		add(txNombreUno, quimLayout);

		txNombreDos = new JTextField(20);
		txNombreDos.setDisabledTextColor(Color.BLACK);
		txNombreDos.setEnabled(false);
		quimLayout.gridx = 1;
		quimLayout.gridy = 4;
		quimLayout.gridwidth = 1;
		quimLayout.gridheight = 1;
		add(txNombreDos, quimLayout);

		txPotencialUno = new JTextField(5);
		txPotencialUno.setDisabledTextColor(Color.BLACK);
		txPotencialUno.setEnabled(false);
		quimLayout.gridx = 2;
		quimLayout.gridy = 2;
		quimLayout.gridwidth = 1;
		quimLayout.gridheight = 1;
		add(txPotencialUno, quimLayout);

		txPotencialDos = new JTextField(5);
		txPotencialDos.setEnabled(false);
		txPotencialDos.setDisabledTextColor(Color.BLACK);
		quimLayout.gridx = 2;
		quimLayout.gridy = 4;
		quimLayout.gridwidth = 1;
		quimLayout.gridheight = 1;
		add(txPotencialDos, quimLayout);

		txOxiReduceUno = new JTextField(2);
		txOxiReduceUno.setDisabledTextColor(Color.BLACK);
		txOxiReduceUno.setEnabled(false);
		quimLayout.gridx = 3;
		quimLayout.gridy = 2;
		quimLayout.gridwidth = 1;
		quimLayout.gridheight = 1;
		add(txOxiReduceUno, quimLayout);

		txOxiREducDos = new JTextField(2);
		txOxiREducDos.setDisabledTextColor(Color.BLACK);
		txOxiREducDos.setEnabled(false);
		quimLayout.gridx = 3;
		quimLayout.gridy = 4;
		quimLayout.gridwidth = 1;
		quimLayout.gridheight = 1;
		add(txOxiREducDos, quimLayout);

		btCAlcular = new JButton("Calcular");
		btCAlcular.setEnabled(false);
		btCAlcular.setActionCommand(GestionEventos.CALCULAR);
		btCAlcular.addActionListener(getEventos());
		quimLayout.gridx = 1;
		quimLayout.gridy = 6;
		quimLayout.gridwidth = 4;
		quimLayout.gridheight = 1;
		add(btCAlcular, quimLayout);

		taResultado = new JTextArea("\t                      Resultado\n");
		taResultado.setEditable(false);
		taResultado.setOpaque(false);
		quimLayout.gridx = 1;
		quimLayout.gridy = 8;
		quimLayout.gridwidth = 4;
		quimLayout.gridheight = 3;
		quimLayout.fill = GridBagConstraints.BOTH;
		add(new JScrollPane(taResultado), quimLayout);

		btLimpiar = new JButton("Limpiar");
		btLimpiar.setActionCommand(GestionEventos.LIMPIAR);
		btLimpiar.addActionListener(getEventos());
		quimLayout.gridx = 1;
		quimLayout.gridy = 11;
		quimLayout.gridwidth = 4;
		quimLayout.gridheight = 1;
		add(btLimpiar, quimLayout);

		lbspacio = new JLabel(" ");
		quimLayout.gridx = 1;
		quimLayout.gridy = 1;
		quimLayout.gridwidth = 4;
		quimLayout.gridheight = 1;
		quimLayout.fill = GridBagConstraints.BOTH;
		add(lbspacio, quimLayout);

		JLabel lbspacio2 = new JLabel(" ");
		quimLayout.gridx = 1;
		quimLayout.gridy = 5;
		quimLayout.gridwidth = 4;
		quimLayout.gridheight = 1;
		quimLayout.fill = GridBagConstraints.BOTH;
		add(lbspacio2, quimLayout);

		JLabel lbspacio3 = new JLabel(" ");
		quimLayout.gridx = 1;
		quimLayout.gridy = 3;
		quimLayout.gridwidth = 4;
		quimLayout.gridheight = 1;
		quimLayout.fill = GridBagConstraints.BOTH;
		add(lbspacio3, quimLayout);

		JLabel lbspacio4 = new JLabel(" ");
		quimLayout.gridx = 1;
		quimLayout.gridy = 7;
		quimLayout.gridwidth = 4;
		quimLayout.gridheight = 1;
		quimLayout.fill = GridBagConstraints.BOTH;
		add(lbspacio4, quimLayout);

		panel = new JPanel();
		ButtonGroup cbReduc;
		cbReduc = new ButtonGroup();
		oxida = new JRadioButton("Agente Oxidante");
		reduce = new JRadioButton("Agente Reductor");
		cbReduc.add(oxida);
		cbReduc.add(reduce);

		panel.add(oxida);
		panel.add(reduce);
		quimLayout.gridx = 0;
		quimLayout.gridy = 10;
		quimLayout.gridwidth = 1;
		quimLayout.gridheight = 1;
		add(panel, quimLayout);

		btAgregar = new JButton("Agregar");
		btAgregar.setActionCommand(GestionEventos.AGREGAR);
		btAgregar.addActionListener(getEventos());
		quimLayout.gridx = 0;
		quimLayout.gridy = 11;
		quimLayout.gridwidth = 1;
		quimLayout.gridheight = 1;
		add(btAgregar, quimLayout);

	}

	public GestionEventos getEventos() {
		return eventos;
	}

	public void setEventos(GestionEventos eventos) {
		this.eventos = eventos;
	}

	public int getContadorAgregar() {
		return contadorAgregar;
	}

	public void setContadorAgregar(int contadorAgregar) {
		this.contadorAgregar = contadorAgregar;
	}

	public JRadioButton getReduce() {
		return reduce;
	}

	public void setReduce(JRadioButton reduce) {
		this.reduce = reduce;
	}

	public JRadioButton getOxida() {
		return oxida;
	}

	public void setOxida(JRadioButton oxida) {
		this.oxida = oxida;
	}

	public void llenarTabla() {

		listo();

		try {
			potencial.readArchivo("archivos/datos.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Archivo no encontrado");
		}

		for (int g = 0; g < potencial.getListaPotenciales().size(); g++) {

			String nombre = potencial.getListaPotenciales().get(g)
					.getNombrePotencial();
			double potencia = potencial.getListaPotenciales().get(g)
					.getPotencial();

			Object co[] = { nombre, potencia };

			mtNombres.insertRow(g, co);
		}

	}

	public void listo() {

		while (mtNombres.getRowCount() != 0) {
			mtNombres.removeRow(0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaPrincipal ven = new VentanaPrincipal();
		ven.llenarTabla();
		JOptionPane.showMessageDialog(null, "Daniel Carvajal\n II Semestre 2013\n UIS", "Creditos",1);
		ven.setVisible(true);

	}

	public void agregar() {

		String nombre = "";
		double pot = 0;
		String p = "";
		if (oxida.isSelected() || reduce.isSelected()) {

			int numfila = jtNombres.getSelectedRow();

			if (numfila == -1) {
				JOptionPane.showMessageDialog(null,
						"Porfavor seleccione un elemento de la lista");
			} else {
				nombre = potencial.getListaPotenciales().get(numfila)
						.getNombrePotencial();
				pot = potencial.getListaPotenciales().get(numfila).getPotencial();
				
				if (reduce.isSelected()) {
					p = "AR";
					reduce.setEnabled(false);
				} else if (oxida.isSelected()) {
					p = "AO";
				  // pot = -pot;
					oxida.setEnabled(false);
				}
				
				
				if (txNombreUno.getText().equals("")) {
					txNombreUno.setText(nombre);
				} else
					txNombreDos.setText(nombre);

				if (txPotencialUno.getText().equals("")) {
					txPotencialUno.setText(String.valueOf(pot));
				} else
					txPotencialDos.setText(String.valueOf(pot));

				if (txOxiReduceUno.getText().equals("")) {
					txOxiReduceUno.setText(p);

				} else
					txOxiREducDos.setText(p);

				setContadorAgregar(getContadorAgregar() + 1);
				if (getContadorAgregar() == 2)
					btAgregar.setEnabled(false);
				
				btCAlcular.setEnabled(true);
			}

			
		} else
			JOptionPane.showMessageDialog(null,
					"¿la sustancia se reduce o se oxida");

	}

	public void limpiar() {
		
		setContadorAgregar(0);
		btAgregar.setEnabled(true);
		oxida.setEnabled(true);
		reduce.setEnabled(true);
		txNombreDos.setText("");
		txNombreUno.setText("");
		txOxiREducDos.setText("");
		txOxiReduceUno.setText("");
		txPotencialUno.setText("");
		txPotencialDos.setText("");
		btCAlcular.setEnabled(false);	
		taResultado.setText("\t                      Resultado\n");
	}

	public void calcular() {
		
		double potencialUno = 0;
		double potencialDos = 0;
		int ORUno=0;
		int ORDos=0;
		String resulado;
		
		if(txNombreUno.getText().equals("") || txNombreDos.getText().equals("")||txOxiREducDos.getText().equals("") ||txOxiReduceUno.getText().equals("")||txPotencialUno.getText().equals("")||txPotencialDos.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"Porfavor Llene Todos Los Campos");
		}
		else
		{
			 potencialUno = Double.parseDouble(txPotencialUno.getText());
		     potencialDos = Double.parseDouble(txPotencialDos.getText());
		
			
			if (txOxiReduceUno.getText().equals("AR")) {ORUno = 0; potencialUno = -potencialUno;}
			if (txOxiREducDos.getText().equals("AR")) {ORDos = 0; potencialDos = -potencialDos;}
			
			double resultado = potencial.calcularPotecnial(potencialUno, potencialDos, ORUno, ORDos);
			resultado = Math.rint(resultado*100)/100;
			
			if(resultado<0) resulado="no es espontanea";
			else resulado = "es espontanea";
			
			taResultado.append("\nLa reaccion "+resulado+".\nEl potencial resultante es de: "+resultado+"V");
		}
		
	}
}
