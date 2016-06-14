package cl.curso.java.composite_menu;

import java.util.List;

public class SubMenu extends Menu {

	private List<Menu> menus;

	/**
	 * @param nombre
	 * @param menus
	 */
	public SubMenu(String nombre, List<Menu> menus) {
		super(nombre);
		this.menus = menus;

	}

	/**
	 * @return the menus
	 */
	public List<Menu> getMenus() {
		return menus;
	}

	/**
	 * @param menus
	 *            the menus to set
	 */
	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cl.curso.java.composite_menu.Menu#pintarMenu()
	 */
	@Override
	public void pintarMenu() {
		System.out.println(this.getNombre());
		for (Menu menu : this.getMenus()) {
			menu.pintarMenu();
		}

	}

}
