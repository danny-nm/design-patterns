package br.com.alura.ExecutandoDiferentesAcoesEOObserver;

import br.com.alura.CriacaoDeObjetosEOBuilder.NotaFiscal;

public class Multiplicador implements AcaoAposGerarNota {

	private final double fator;

	public Multiplicador(double fator) {
		this.fator = fator;
	}

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println(nf.getValorBruto() * this.fator);
	}

}
