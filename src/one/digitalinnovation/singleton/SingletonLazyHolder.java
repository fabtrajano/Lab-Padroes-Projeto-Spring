package one.digitalinnovation.singleton;
/**
 * Sigleton "Apressado".
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author ftrajano
 *
 */

public class SingletonLazyHolder {
	
	private static class instanceHolder {
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder(){
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return instanceHolder.instancia;
	}

}
