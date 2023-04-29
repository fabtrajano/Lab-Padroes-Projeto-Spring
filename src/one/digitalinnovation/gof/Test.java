package one.digitalinnovation.gof;

import one.digitalinnovation.facade.Facade;
import one.digitalinnovation.singleton.SingletonEager;
import one.digitalinnovation.singleton.SingletonLazy;
import one.digitalinnovation.singleton.SingletonLazyHolder;
import one.digitalinnovation.strategy.Comportamento;
import one.digitalinnovation.strategy.ComportamentoAgressivo;
import one.digitalinnovation.strategy.ComportamentoDefensivo;
import one.digitalinnovation.strategy.ComportamentoNormal;
import one.digitalinnovation.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		
		//Singleton
		
		/*
	  	SingletonLazy lazy = new SingletonLazy.getInstancia();
	  	System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		

		SingletonEager eager = new SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		

		SingletonLazyHolder lazyHolder = new SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		*/
		
		//Strategy
		/*
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal =new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		*/
		
		//Facde
		
		Facade facade = new Facade();
		facade.migrarCliente("Fabricio", "25935-00");
		
		
		
		
	}

}
