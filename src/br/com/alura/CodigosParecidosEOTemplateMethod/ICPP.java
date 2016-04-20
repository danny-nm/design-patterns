package br.com.alura.CodigosParecidosEOTemplateMethod;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Imposto;
import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Orcamento;

public class ICPP extends TemplateDeImpostoCondicional {

	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICPP() {

	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

}
