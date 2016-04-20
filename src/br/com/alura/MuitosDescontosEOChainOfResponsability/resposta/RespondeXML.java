package br.com.alura.MuitosDescontosEOChainOfResponsability.resposta;

public class RespondeXML implements Resposta {

	private Resposta outraResposta;

	public RespondeXML(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>");
		} else {
			outraResposta.responde(req, conta);
		}

	}

	@Override
	public void setProxima(Resposta resposta) {
		this.outraResposta = resposta;

	}

}
