package br.com.alura.ExecutandoDiferentesAcoesEOObserver;

import br.com.alura.CriacaoDeObjetosEOBuilder.NotaFiscal;

public class NotaFiscalDAO implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf){
		System.out.println("Salvei no banco");
	}
}
