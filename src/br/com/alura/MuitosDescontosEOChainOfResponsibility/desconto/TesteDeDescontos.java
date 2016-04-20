package br.com.alura.MuitosDescontosEOChainOfResponsibility.desconto;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Orcamento;

public class TesteDeDescontos {

	public static void main(String[] args) {

		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		Orcamento orcamento = new Orcamento(500.0);
		
		orcamento.adicionaItens(new Item("CANETA", 250.0));
		orcamento.adicionaItens(new Item("LAPIS", 250.0));
		
		double descontoFinal = descontos.calcula(orcamento);
		
		System.out.println(descontoFinal);
	}
}
