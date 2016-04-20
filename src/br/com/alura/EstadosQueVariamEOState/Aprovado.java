package br.com.alura.EstadosQueVariamEOState;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� est� aprovado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos j� aprovados n�o podem ser reprovados");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
