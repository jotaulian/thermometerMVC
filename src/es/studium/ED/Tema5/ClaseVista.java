package es.studium.ED.Tema5;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class ClaseVista extends Frame
{
	private static final long serialVersionUID = 1L;
	
	/*Declaramos los elementos gráficos*/
	Label etiqueta = new Label("Celsius");
	TextField celsius = new TextField(5);
	Label etiqueta2 = new Label("Fahrenheit");
	TextField fahrenheit = new TextField(5);
	Button btnCelFah = new Button(" Celsius a Fahrenheit ");
	Button btnFahCel = new Button(" Fahrenheit a Celsius ");
	
	//Constructor
	public ClaseVista() {
		setLayout(new GridLayout(3, 2));
		setTitle("Conversión de temperaturas");
		add(etiqueta);
		add(celsius);
		add(etiqueta2);
		add(fahrenheit);
		add(btnCelFah);
		add(btnFahCel);
		
		setSize(450, 150);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
}
