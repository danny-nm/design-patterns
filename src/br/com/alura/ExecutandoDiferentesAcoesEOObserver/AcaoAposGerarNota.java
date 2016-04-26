package br.com.alura.ExecutandoDiferentesAcoesEOObserver;

import br.com.alura.CriacaoDeObjetosEOBuilder.NotaFiscal;

public interface AcaoAposGerarNota {

	void executa(NotaFiscal nf);
}
