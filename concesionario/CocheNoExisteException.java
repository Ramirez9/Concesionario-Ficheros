package concesionario;

@SuppressWarnings("serial")
public class CocheNoExisteException extends Exception {
	
	public CocheNoExisteException (String string) {
		super(string);
	}
}
