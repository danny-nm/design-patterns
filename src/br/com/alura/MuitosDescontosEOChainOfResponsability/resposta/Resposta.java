package br.com.alura.MuitosDescontosEOChainOfResponsability.resposta;

public interface Resposta {

	void responde(Requisicao req, Conta conta);
	void setProxima(Resposta resposta);
}
