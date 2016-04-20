package br.com.alura.MuitosDescontosEOChainOfResponsibility.desconto;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Orcamento;

public interface Desconto {

	double desconto(Orcamento orcamento);
	void setProximo(Desconto proximo);
}
