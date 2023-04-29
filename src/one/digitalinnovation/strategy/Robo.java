package one.digitalinnovation.strategy;

public class Robo {
	
	private Comportamento comportamento;
	
	

	public Robo(Comportamento comportamento) {
		super();
		this.comportamento = comportamento;
	}

	public Robo() {
		// TODO Auto-generated constructor stub
	}

	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
	
}
