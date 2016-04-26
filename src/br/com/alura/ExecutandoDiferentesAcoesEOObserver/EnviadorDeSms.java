package br.com.alura.ExecutandoDiferentesAcoesEOObserver;

import br.com.alura.CriacaoDeObjetosEOBuilder.NotaFiscal;

public class EnviadorDeSms implements AcaoAposGerarNota{

	public void executa(NotaFiscal nf){
		System.out.println("Enviei por sms");
		
	}
}
