package lib;

public class Libreria {
	
    //  Constante p�blica de clase 
    public static final double PI = 3.1416;
	//  Constructor por defecto
	public Libreria() {
	}
	//  M�todo p�blico de clase 
	public static int aleatorio(int min, int max) {
		return (int)((max - min + 1) * Math.random()) + min;
	}
	
}