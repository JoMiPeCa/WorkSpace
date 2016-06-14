package cl.curso.java.composite_menu;

public class LineaSeparadora extends Menu {

	/**
	 * @param nombre
	 */
	public LineaSeparadora(String nombre) {
		super(nombre);
		
	}

	@Override
	public void pintarMenu() {
		System.out.println("---------------------------------");
		
	}
	
	
}
