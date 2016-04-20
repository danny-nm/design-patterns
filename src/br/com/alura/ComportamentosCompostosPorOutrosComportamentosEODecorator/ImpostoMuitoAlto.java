package br.com.alura.ComportamentosCompostosPorOutrosComportamentosEODecorator;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Imposto;
import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Orcamento;

public class ImpostoMuitoAlto extends Imposto {

	public ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}

	public ImpostoMuitoAlto() {

	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.20 + calculoDoOutroImposto(orcamento);
	}

}
