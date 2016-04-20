package br.com.alura.CodigosParecidosEOTemplateMethod;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Orcamento;
import br.com.alura.MuitosDescontosEOChainOfResponsibility.desconto.Item;

public class IHIT extends TemplateDeImpostoCondicional {

	@Override
	protected double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.01 * orcamento.getItens().size();
	}

	@Override
	protected double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	protected boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return temDoisItensComOMesmoNome(orcamento);
	}

	private boolean temDoisItensComOMesmoNome(Orcamento orcamento) {
		List<String> noOrcamento = new ArrayList<String>();

		for (Item item : orcamento.getItens()) {
			if (noOrcamento.contains(item.getNome()))
				return true;
			else
				noOrcamento.add(item.getNome());
		}
		return false;
	}

}
