package GUI;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.security.auth.callback.NameCallback;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import logic.CalculoPotencial;

public class VentanaPrincipal extends JFrame{
	
	private GestionEventos eventos;
	private JLabel lbImagen, lbTitulo,lbUno,lbDos,lbTres,lbCuatro,lbCinco,lbSeis,lbSiete,lbOcho,lbNueve,lbDiez,lbResultado;
	private JButton btCalcular;
	private JTextField txUno, txDos, txTres, txCuatro, txCinco, txSeis,txSiete, txOcho, txNueve, txDiez, txOnce;

	private GridBagConstraints layout;
	private CalculoPotencial potencial;
	
	public VentanaPrincipal() {
		// TODO Auto-generated constructor stub
		
		setTitle("Potencial de reduccion de un electrolo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		setIconImage(new ImageIcon("imagenes/icon.png").getImage());
		setSize(250, 430);
		setResizable(false);
		
		eventos = new GestionEventos(this);
		potencial = new CalculoPotencial();
		layout = new GridBagConstraints();
		
		JPanel nm = new JPanel();
		nm.setBorder(new TitledBorder("Ecuacion"));
		lbImagen = new JLabel(new ImageIcon("imagenes/formula.png"));
        nm.add(lbImagen);
		layout.gridx = 0;
		layout.gridy = 0;
		layout.gridwidth = 2;
		layout.gridheight = 1;
		layout.weightx = 1.0;
		layout.weighty = 1.0; 
		
		add(nm,layout);
		
		lbTitulo = new JLabel("Ingrese Los Datos");
		lbTitulo.setFont(new Font("Andalus", 0, 19));
		layout.gridx = 0;
		layout.gridy = 1;
		layout.gridwidth = 2;
		layout.gridheight = 1;
		add(lbTitulo,layout);
		
		lbUno = new JLabel("E° =");
		lbUno.setFont(new Font("Andalus", 0, 16));
		layout.gridx = 0;
		layout.gridy = 2;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(lbUno,layout);
		
		lbDos = new JLabel("n =");
		lbDos.setFont(new Font("Andalus", 0, 16));
		layout.gridx = 0;
		layout.gridy = 3;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(lbDos,layout);
		
		lbTres = new JLabel("[A] =");
		lbTres.setFont(new Font("Andalus", 0, 16));
		layout.gridx = 0;
		layout.gridy = 4;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(lbTres,layout);
		
		lbCuatro = new JLabel("[B] =");
		lbCuatro.setFont(new Font("Andalus", 0, 16));
		layout.gridx = 0;
		layout.gridy = 5;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(lbCuatro,layout);
		
		lbCinco = new JLabel("[C] =");
		lbCinco.setFont(new Font("Andalus", 0, 16));
		layout.gridx = 0;
		layout.gridy = 6;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(lbCinco,layout);
		
		lbSeis = new JLabel("[D] =");
		lbSeis.setFont(new Font("Andalus", 0, 16));
		layout.gridx = 0;
		layout.gridy = 7;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(lbSeis,layout);
				
		lbSiete = new JLabel("a =");
		lbSiete.setFont(new Font("Andalus", 0, 16));
		layout.gridx = 0;
		layout.gridy = 8;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(lbSiete,layout);
		
		lbOcho = new JLabel("b =");
		lbOcho.setFont(new Font("Andalus", 0, 16));
		layout.gridx = 0;
		layout.gridy = 9;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(lbOcho,layout);
		
		lbNueve = new JLabel("c =");
		lbNueve.setFont(new Font("Andalus", 0, 16));
		layout.gridx = 0;
		layout.gridy = 10;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(lbNueve,layout);
		
		lbDiez = new JLabel("d =");
		lbDiez.setFont(new Font("Andalus", 0, 16));
		layout.gridx = 0;
		layout.gridy = 11;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(lbDiez,layout);
		
		
		txUno = new JTextField(5);
		txUno.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();
			if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) 	&& (c != '.') &&  (c != '-')) {
			e.consume();
			}
			if (c == '.' && txUno.getText().contains(".")) {
			e.consume();
			}if (c == '-' && txUno.getText().contains("-")) {
				e.consume();
				}
			}
			});
		
		
		layout.gridx = 1;
		layout.gridy = 2;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(txUno,layout);	
		
		txDos = new JTextField(5);
		txDos.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();
			int codigo =(int)e.getKeyChar();
			
			if(codigo <46 || codigo>57){
				e.consume();}
		//	char c = e.getKeyChar();
			if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) 	&& (c != '.')) {
			e.consume();
			}
			if (c == '.' && txDos.getText().contains(".")) {
			e.consume();
			}
			}
			});		
		layout.gridx = 1;
		layout.gridy = 3;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(txDos,layout);	
		
		txTres = new JTextField(5);
		txTres.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();
			int codigo =(int)e.getKeyChar();
			
			if(codigo <46 || codigo>57){
				e.consume();}
		//	char c = e.getKeyChar();
			if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) 	&& (c != '.')) {
			e.consume();
			}
			if (c == '.' && txTres.getText().contains(".")) {
			e.consume();
			}
			}
			});		
		layout.gridx = 1;
		layout.gridy = 4;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(txTres,layout);	
		
		txCuatro = new JTextField(5);
		txCuatro.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();
			int codigo =(int)e.getKeyChar();
			
			if(codigo <46 || codigo>57){
				e.consume();}
		//	char c = e.getKeyChar();
			if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) 	&& (c != '.')) {
			e.consume();
			}
			if (c == '.' && txCuatro.getText().contains(".")) {
			e.consume();
			}
			}
			});
		layout.gridx = 1;
		layout.gridy = 5;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(txCuatro,layout);
		
		txCinco = new JTextField(5);
		txCinco.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();
			int codigo =(int)e.getKeyChar();
			
			if(codigo <46 || codigo>57){
				e.consume();}
		//	char c = e.getKeyChar();
			if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) 	&& (c != '.')) {
			e.consume();
			}
			if (c == '.' && txCinco.getText().contains(".")) {
			e.consume();
			}
			}
			});
		layout.gridx = 1;
		layout.gridy = 6;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(txCinco,layout);
		
		txSeis = new JTextField(5);
		txSeis.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();
			int codigo =(int)e.getKeyChar();
			
			if(codigo <46 || codigo>57){
				e.consume();}
		//	char c = e.getKeyChar();
			if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) 	&& (c != '.')) {
			e.consume();
			}
			if (c == '.' && txSeis.getText().contains(".")) {
			e.consume();
			}
			}
			});
		layout.gridx = 1;
		layout.gridy = 7;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(txSeis,layout);
		
		txSiete = new JTextField(5);
		txSiete.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();
			int codigo =(int)e.getKeyChar();
			
			if(codigo <46 || codigo>57){
				e.consume();}
		//	char c = e.getKeyChar();
			if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) 	&& (c != '.')) {
			e.consume();
			}
			if (c == '.' && txSiete.getText().contains(".")) {
			e.consume();
			}
			}
			});
		layout.gridx = 1;
		layout.gridy = 8;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(txSiete,layout);
		
		txOcho = new JTextField(5);
		txOcho.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();
			int codigo =(int)e.getKeyChar();
			
			if(codigo <46 || codigo>57){
				e.consume();}
		//	char c = e.getKeyChar();
			if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) 	&& (c != '.')) {
			e.consume();
			}
			if (c == '.' && txOcho.getText().contains(".")) {
			e.consume();
			}
			}
			});
		layout.gridx = 1;
		layout.gridy = 9;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(txOcho,layout);
		
		txNueve = new JTextField(5);
		txNueve.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();
			int codigo =(int)e.getKeyChar();
			
			if(codigo <46 || codigo>57){
				e.consume();}
		//	char c = e.getKeyChar();
			if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) 	&& (c != '.')) {
			e.consume();
			}
			if (c == '.' && txNueve.getText().contains(".")) {
			e.consume();
			}
			}
			});
		layout.gridx = 1;
		layout.gridy = 10;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(txNueve,layout);
		
		txDiez = new JTextField(5);
		txDiez.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
			char c = e.getKeyChar();
			int codigo =(int)e.getKeyChar();
			
			if(codigo <46 || codigo>57){
				e.consume();}
		//	char c = e.getKeyChar();
			if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) 	&& (c != '.')) {
			e.consume();
			}
			if (c == '.' && txDiez.getText().contains(".")) {
			e.consume();
			}
			}
			});
		layout.gridx = 1;
		layout.gridy = 11;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(txDiez,layout);
		
		btCalcular = new JButton("Calcular");
		btCalcular.setActionCommand(eventos.CALCULAR);
		btCalcular.addActionListener(getEventos());
		layout.gridx = 0;
		layout.gridy = 12;
		layout.gridwidth = 2;
		layout.gridheight = 1;
		add(btCalcular,layout);
		
		lbResultado = new JLabel("E = ");
		layout.gridx = 0;
		layout.gridy = 13;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(lbResultado,layout);
		
	
		txOnce = new JTextField(10);
		txOnce.setEditable(false);
		layout.gridx = 1;
		layout.gridy = 13;
		layout.gridwidth = 1;
		layout.gridheight = 1;
		add(txOnce,layout);
	}
	
	
	public GestionEventos getEventos() {
		return eventos;
	}


	public void setEventos(GestionEventos eventos) {
		this.eventos = eventos;
	}


	public CalculoPotencial getPotencial() {
		return potencial;
	}


	public void setPotencial(CalculoPotencial potencial) {
		this.potencial = potencial;
	}


	public static void main(String[] args) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		JOptionPane.showMessageDialog(null, " Ruthber Escorcia Cabrera\n II Semestre 2013\n UIS", "Creditos",1);
		ventana.setVisible(true);
	}

     public void calcular() {
		// TODO Auto-generated method stub
//		if (existePunto(cadena)==true){}
		if(txUno.getText().equals("")||txDos.getText().equals("")||txTres.getText().equals("")||txCuatro.getText().equals("")||txCinco.getText().equals("")||txSeis.getText().equals("")||txSiete.getText().equals("")||txOcho.getText().equals("")||txNueve.getText().equals("")||txDiez.getText().equals(""))
		{
			JOptionPane.showMessageDialog(null,"Porfavor Llene todos los campos");
		}
		else{
		
			double cadenaUno = Double.parseDouble(txUno.getText());
			double cadenaDos = Double.parseDouble(txDos.getText());
			double cadenaTres = Double.parseDouble(txTres.getText());
			double cadenaCuatro = Double.parseDouble(txCuatro.getText());
			double cadenaCinco = Double.parseDouble(txCinco.getText());
			double cadenaSeis = Double.parseDouble(txSeis.getText());
			double cadenaSiete = Double.parseDouble(txSiete.getText());
			double cadenaOcho = Double.parseDouble(txOcho.getText());
			double cadenaNueve = Double.parseDouble(txNueve.getText());
			double cadenaDiez = Double.parseDouble(txDiez.getText());
			
			double resultado = potencial.CaalculoPotencial(cadenaUno, cadenaDos, cadenaSiete, cadenaOcho, cadenaNueve, cadenaDiez,cadenaTres, cadenaCuatro, cadenaCinco, cadenaSeis);
			resultado = Math.rint(resultado*100)/100;
			txOnce.setText(String.valueOf(resultado));
			
		}
		
	}


	public JLabel getLbImagen() {
		return lbImagen;
	}


	public void setLbImagen(JLabel lbImagen) {
		this.lbImagen = lbImagen;
	}


	public JLabel getLbTitulo() {
		return lbTitulo;
	}


	public void setLbTitulo(JLabel lbTitulo) {
		this.lbTitulo = lbTitulo;
	}


	public JLabel getLbUno() {
		return lbUno;
	}


	public void setLbUno(JLabel lbUno) {
		this.lbUno = lbUno;
	}


	public JLabel getLbDos() {
		return lbDos;
	}


	public void setLbDos(JLabel lbDos) {
		this.lbDos = lbDos;
	}


	public JLabel getLbTres() {
		return lbTres;
	}


	public void setLbTres(JLabel lbTres) {
		this.lbTres = lbTres;
	}


	public JLabel getLbCuatro() {
		return lbCuatro;
	}


	public void setLbCuatro(JLabel lbCuatro) {
		this.lbCuatro = lbCuatro;
	}


	public JLabel getLbCinco() {
		return lbCinco;
	}


	public void setLbCinco(JLabel lbCinco) {
		this.lbCinco = lbCinco;
	}


	public JLabel getLbSeis() {
		return lbSeis;
	}


	public void setLbSeis(JLabel lbSeis) {
		this.lbSeis = lbSeis;
	}


	public JLabel getLbSiete() {
		return lbSiete;
	}


	public void setLbSiete(JLabel lbSiete) {
		this.lbSiete = lbSiete;
	}


	public JLabel getLbOcho() {
		return lbOcho;
	}


	public void setLbOcho(JLabel lbOcho) {
		this.lbOcho = lbOcho;
	}


	public JLabel getLbNueve() {
		return lbNueve;
	}


	public void setLbNueve(JLabel lbNueve) {
		this.lbNueve = lbNueve;
	}


	public JLabel getLbDiez() {
		return lbDiez;
	}


	public void setLbDiez(JLabel lbDiez) {
		this.lbDiez = lbDiez;
	}


	public JLabel getLbResultado() {
		return lbResultado;
	}


	public void setLbResultado(JLabel lbResultado) {
		this.lbResultado = lbResultado;
	}


	public JButton getBtCalcular() {
		return btCalcular;
	}


	public void setBtCalcular(JButton btCalcular) {
		this.btCalcular = btCalcular;
	}


	public JTextField getTxUno() {
		return txUno;
	}


	public void setTxUno(JTextField txUno) {
		this.txUno = txUno;
	}


	public JTextField getTxDos() {
		return txDos;
	}


	public void setTxDos(JTextField txDos) {
		this.txDos = txDos;
	}


	public JTextField getTxTres() {
		return txTres;
	}


	public void setTxTres(JTextField txTres) {
		this.txTres = txTres;
	}


	public JTextField getTxCuatro() {
		return txCuatro;
	}


	public void setTxCuatro(JTextField txCuatro) {
		this.txCuatro = txCuatro;
	}


	public JTextField getTxCinco() {
		return txCinco;
	}


	public void setTxCinco(JTextField txCinco) {
		this.txCinco = txCinco;
	}


	public JTextField getTxSeis() {
		return txSeis;
	}


	public void setTxSeis(JTextField txSeis) {
		this.txSeis = txSeis;
	}


	public JTextField getTxSiete() {
		return txSiete;
	}


	public void setTxSiete(JTextField txSiete) {
		this.txSiete = txSiete;
	}


	public JTextField getTxOcho() {
		return txOcho;
	}


	public void setTxOcho(JTextField txOcho) {
		this.txOcho = txOcho;
	}


	public JTextField getTxNueve() {
		return txNueve;
	}


	public void setTxNueve(JTextField txNueve) {
		this.txNueve = txNueve;
	}


	public JTextField getTxDiez() {
		return txDiez;
	}


	public void setTxDiez(JTextField txDiez) {
		this.txDiez = txDiez;
	}


	public JTextField getTxOnce() {
		return txOnce;
	}


	public void setTxOnce(JTextField txOnce) {
		this.txOnce = txOnce;
	}

	public void setLayout(GridBagConstraints layout) {
		this.layout = layout;
	}
}
