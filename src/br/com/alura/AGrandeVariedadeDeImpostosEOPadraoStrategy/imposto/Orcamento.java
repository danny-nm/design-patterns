package br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.EstadosQueVariamEOState.EmAprovacao;
import br.com.alura.EstadosQueVariamEOState.EstadoDeUmOrcamento;
import br.com.alura.MuitosDescontosEOChainOfResponsibility.desconto.Item;

public class Orcamento {

	public double valor;
	private final List<Item> itens;

	public EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		itens = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	// lista imutável
	// Não é alterada pelo mundo de fora
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItens(Item item) {
		itens.add(item);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.aprova(this);
	}

	public void reprova() {
		estadoAtual.reprova(this);
	}

	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}
