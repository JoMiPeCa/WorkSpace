package cl.curso.java.abstract_factory;

public class MacOSXWidgetFactory implements AbstractWidgetFactory {

	public Window createWindow() {
		return new MacOSXWindow();
	}

}
