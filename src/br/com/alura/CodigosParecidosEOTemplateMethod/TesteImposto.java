package br.com.alura.CodigosParecidosEOTemplateMethod;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Orcamento;
import br.com.alura.MuitosDescontosEOChainOfResponsibility.desconto.Item;

public class TesteImposto {

	public static void main(String[] args) {

		ICPP icpp = new ICPP();
		IKCV ikcv = new IKCV();
		IHIT ihit = new IHIT();

		Orcamento orcamento = new Orcamento(600);
		double valorImpostoIcpp = icpp.calcula(orcamento);
		System.out.println(valorImpostoIcpp);

		Orcamento orcamento2 = new Orcamento(600);
		orcamento2.adicionaItens(new Item("Short", 120));
		double valorImpostoIkcv = ikcv.calcula(orcamento2);
		System.out.println(valorImpostoIkcv);

		Orcamento orcamento3 = new Orcamento(600);
		orcamento3.adicionaItens(new Item("Saia", 80));
		orcamento3.adicionaItens(new Item("Saia", 90));
		double valorImpostoIhit = ihit.calcula(orcamento3);
		System.out.println(valorImpostoIhit);

	}
}
