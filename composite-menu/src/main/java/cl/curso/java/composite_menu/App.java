package cl.curso.java.composite_menu;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SubMenu menuNew = new SubMenu("New", new ArrayList<Menu>());
    	menuNew.getMenus().add( new ItemMenu("", "Java Project") );
    	menuNew.getMenus().add( new ItemMenu("", "Project....") );
    	
        SubMenu menu = new SubMenu("File", new ArrayList<Menu>());
    	menu.getMenus().add( menuNew );
   		menu.getMenus().add( new ItemMenu("", "Open File") );
   		menu.getMenus().add( new LineaSeparadora(null));
   		menu.getMenus().add( new ItemMenu("cmd+w", "Close") );
   		menu.getMenus().add( new ItemMenu("shift+zazz", "Close All") );
   		menu.pintarMenu();
    	
    }
}
