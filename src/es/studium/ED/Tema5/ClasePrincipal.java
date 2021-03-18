package es.studium.ED.Tema5;

public class ClasePrincipal
{

	public static void main(String[] args) {
		ClaseVista vista = new ClaseVista();
		ClaseModelo modelo = new ClaseModelo();
		new ClaseControlador(vista, modelo);
	}
	
}
