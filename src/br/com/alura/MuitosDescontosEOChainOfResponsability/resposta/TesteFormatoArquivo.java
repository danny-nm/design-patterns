package br.com.alura.MuitosDescontosEOChainOfResponsability.resposta;

public class TesteFormatoArquivo {

	public static void main(String[] args) {

		RespondeCSV respondeCsv = new RespondeCSV();
		RespondePorcento respondePorcento = new RespondePorcento(respondeCsv);
		RespondeXML respondeXml = new RespondeXML(respondePorcento);

		Requisicao req = new Requisicao(Formato.XML);
		Conta conta = new Conta("Daniella", 3000.0);

		respondeXml.responde(req, conta);

	}

}
