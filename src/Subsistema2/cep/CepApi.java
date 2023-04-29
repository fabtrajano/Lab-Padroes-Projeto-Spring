package Subsistema2.cep;

public class CepApi {
	
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String RecuperarCidade(String cep) {
		return "Mage";
	}
	
	public String RecuperarEstado(String cep) {
		return "Rio de Janeiro";
	}
			

}
