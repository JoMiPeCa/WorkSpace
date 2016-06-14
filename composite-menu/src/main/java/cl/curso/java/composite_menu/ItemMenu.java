package cl.curso.java.composite_menu;

public class ItemMenu extends Menu{

	private String atajo;

	/**
	 * @param nombre
	 */
	public ItemMenu(String atajo, String nombre) {
		super(nombre);
		this.atajo = atajo;
		
	}

	/**
	 * @return the atajo
	 */
	public String getAtajo() {
		return atajo;
	}

	/**
	 * @param atajo the atajo to set
	 */
	public void setAtajo(String atajo) {
		this.atajo = atajo;
	}
	
	@Override
	public void pintarMenu(){
		System.out.println(this.getNombre() + " " + this.getAtajo());
	}
	
}
