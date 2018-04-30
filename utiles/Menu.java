package utiles;

/**
 * Clase que muestra un menu y recoge la opcion introducida
 * 
 * @author Francisco Ramirez
 *
 */
	public class Menu {
		String titulo = null;
		String opciones[] = null;
		int numOpciones = 2;

		/**
		 * 
		 * @param titulo
		 *            título del menú
		 * @param opciones
		 *            opciones del menú
		 */
		public Menu(String titulo, String[] opciones) {
			this.titulo = titulo;
			this.opciones = opciones;
			this.numOpciones = this.opciones.length;
		}

		/**
		 * Gestiona el menú. Consiste en mostrar las opcines y recoger la opción
		 * seleccionada por el usuario
		 * 
		 * @return opción válida del menú
		 */
		public int gestionar() {
			mostrar();
			return recogerOpcion();
		}

		/**
		 * Muestra las opciones del menú
		 */
		private void mostrar() {
			int i = 1;
			System.out.println(titulo);
			for (String elemento : opciones)
				System.out.println("\n(" + (i++) + ") " +elemento);
		}

		/**
		 * Recoge la opción válida del menú
		 * 
		 * @return opción válida
		 */
		private int recogerOpcion() {
			int opcion;
			do {
				opcion = Teclado.leerEntero("\n>>>Opcion: " );
			} while (opcion < 1 || opcion > numOpciones);
			return opcion;
		}
	

}
