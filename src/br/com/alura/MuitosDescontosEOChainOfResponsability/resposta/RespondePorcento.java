package br.com.alura.MuitosDescontosEOChainOfResponsability.resposta;

public class RespondePorcento implements Resposta {

	private Resposta outraResposta;

	public RespondePorcento(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else {
			outraResposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;

	}

}
