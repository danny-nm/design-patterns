package br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto;

public class ISS extends Imposto {

	public ISS(Imposto outroImposto) {
		super(outroImposto); // pegamos da classe pai
	}

	public ISS() {

	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + calculoDoOutroImposto(orcamento);
	}

}
