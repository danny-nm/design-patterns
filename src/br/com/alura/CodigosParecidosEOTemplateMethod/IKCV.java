package br.com.alura.CodigosParecidosEOTemplateMethod;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Imposto;
import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Orcamento;
import br.com.alura.MuitosDescontosEOChainOfResponsibility.desconto.Item;

public class IKCV extends TemplateDeImpostoCondicional {

	public IKCV(Imposto outroImposto) {
		super(outroImposto);
	}

	public IKCV() {

	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQueCemReais(orcamento);
	}

	private boolean temItemMaiorQueCemReais(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (orcamento.getValor() > 100)
				;
			return true;
		}
		return false;
	}
}
