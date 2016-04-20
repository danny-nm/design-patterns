package br.com.alura.EstadosQueVariamEOState;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos finalizados n�o recebem desconto extra!");
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� finalizado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� finalizado!");		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamento j� finalizado!");		
	}

}
