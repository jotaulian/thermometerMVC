package es.studium.ED.Tema5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClaseControlador implements WindowListener, ActionListener
{
	private ClaseVista objVista;
	private ClaseModelo objModelo;
	
	public ClaseControlador(ClaseVista vista, ClaseModelo modelo)
	{
		this.objVista = vista;
		this.objModelo = modelo;
		
		objVista.btnCelFah.addActionListener(this);
		objVista.btnFahCel.addActionListener(this);
		objVista.addWindowListener(this);
	}

	//Action Listener
	@Override
	public void actionPerformed(ActionEvent evento)
	{
		if(objVista.btnCelFah.equals(evento.getSource())){
			//Convert Celsius to Fahrenheit
			float gradoC = Float.parseFloat(objVista.celsius.getText());
			float gradoF = objModelo.toFar(gradoC);
			objVista.fahrenheit.setText(Float.toString(gradoF));
			
		}else {
			float gradoF = Float.parseFloat(objVista.fahrenheit.getText());
			float gradoC = objModelo.toCel(gradoF);
			objVista.celsius.setText(Float.toString(gradoC));
		}
	}

	//Window Listener Methods
	public void windowActivated(WindowEvent arg0){}
	public void windowClosed(WindowEvent arg0){}
	public void windowClosing(WindowEvent arg0){
			System.exit(0);
		}
	public void windowDeactivated(WindowEvent arg0){}
	public void windowDeiconified(WindowEvent arg0){}
	public void windowIconified(WindowEvent arg0){}
	public void windowOpened(WindowEvent arg0){}
}
