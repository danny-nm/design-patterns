package br.com.alura.ComportamentosCompostosPorOutrosComportamentosEODecorator.filtro;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.MuitosDescontosEOChainOfResponsability.resposta.Conta;

	abstract class Filtro {

	protected Filtro outroFiltro;

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

	public Filtro() {
	}

	public abstract List<Conta> filtra(List<Conta> contas);

	protected List<Conta> proximo(List<Conta> contas) {
		if (outroFiltro != null)
			return outroFiltro.filtra(contas);
		else
			return new ArrayList<Conta>();
	}

}
