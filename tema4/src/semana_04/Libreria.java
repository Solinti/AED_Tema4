package semana_04;

public class Libreria {
	
	//Esto es para borrar el espacio del inicio
	public String eliminarEspacio(String dato) {
		return dato.trim();
	}
	
	public int longitudSinAjuste(String dato) {
		return dato.length();
	}
	
	// d = dato
	public char primerCarecter(String d) {
		return d.charAt(0);
	}
	
	public char ultimoCaracter(String d) {
		return d.charAt(longitudSinAjuste(d)-1);
	}
	
	public String textoAjustado(String d) {
		String texto = "";
		//Char si hay mas de 2 espacion lo va a elminiar
		char caracter;
		
		//se puede hacer un nuevo metodo d.length()
		for(int i = 0; i < longitudSinAjuste(d); i++) {
			caracter = d.charAt(i);
			//! es de negacion, esto lo cambia de verdaro a falso y viceversa 
			if(!(caracter == ' ' && ultimoCaracter(texto) == ' ')) {
				texto += caracter;
			}
		}
		return texto;
	}
	
}
