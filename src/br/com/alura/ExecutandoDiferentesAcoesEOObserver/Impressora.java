package br.com.alura.ExecutandoDiferentesAcoesEOObserver;

import br.com.alura.CriacaoDeObjetosEOBuilder.NotaFiscal;

public class Impressora implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf){
		System.out.println("Nota impressa");
	}
}
