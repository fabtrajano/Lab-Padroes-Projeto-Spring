package one.digitalinnovation.facade;

import Subsisitema1.crm.CrmService;
import Subsistema2.cep.CepApi;

public class Facade {
	
	public void migrarCliente(String nome,String cep) {
		
		String cidade = CepApi.getInstancia().RecuperarCidade(cep);
		String estado = CepApi.getInstancia().RecuperarEstado(cep);
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
