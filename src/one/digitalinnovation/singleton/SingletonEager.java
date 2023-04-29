package one.digitalinnovation.singleton;
/**
 * Sigleton "Apressado".
 * 
 * @author ftrajano
 *
 */

public class SingletonEager {
	

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager(){
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}

}
