package br.com.alura.EstadosQueVariamEOState;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Orcamento;

public class Aprovado implements EstadoDeUmOrcamento {
	
	private boolean descontoAplicado = false;

	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado){
			orcamento.valor -= orcamento.valor * 0.02;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto já aplicado!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento já está aprovado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos já aprovados não podem ser reprovados");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
	
	

}
