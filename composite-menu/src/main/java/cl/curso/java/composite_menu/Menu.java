package cl.curso.java.composite_menu;

public abstract class Menu {

	private String nombre;
	
	
	
	/**
	 * @param nombre
	 */
	public Menu(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public abstract void pintarMenu();
}
