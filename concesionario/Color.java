package concesionario;
/**
 * Colores de los coches, "Plata, rojo y azul"
 * @author 	Francisco Ram�rez
 *
 */
public enum Color {
	/**
	 * Color plata
	 */
	PLATA,
	/**
	 * Color rojo
	 */
	ROJO,
	/**
	 * Color azul
	 */
	AZUL;

	private static final Color[] VALUES = values();

	/**
	 * Genera las distintas opciones para manejarlas con un men�
	 * 
	 * @return array de string con las opciones
	 */
	public static String[] generarOpcionesMenu() {
		String[] opciones = new String[VALUES.length];

		int i = 0;

		for (Color color : VALUES) {
			opciones[i] = color.toString();
			i++;
		}

		return opciones;
	}
}
