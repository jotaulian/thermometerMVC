package es.studium.ED.Tema5;

public class ClaseModelo
{
	public float toFar(float gradoC) {
		float resultadoFar;
		resultadoFar = (((gradoC) * 9 / 5) + 32);
		return (resultadoFar);
	}
	
	public float toCel(float gradoF) {
		float resultadoCel;
		resultadoCel = ((gradoF - 32) * 5/9);
		return (resultadoCel);
	}
	
}
