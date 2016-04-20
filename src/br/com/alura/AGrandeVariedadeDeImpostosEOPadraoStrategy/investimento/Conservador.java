package br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.investimento;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Conta;

public class Conservador implements Investimento{

	@Override
	public double calcula(Conta conta) {
		return conta.getSaldo() * 0.008;
	}
}
