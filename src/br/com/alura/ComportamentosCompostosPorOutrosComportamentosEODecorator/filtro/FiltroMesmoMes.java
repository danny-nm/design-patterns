package br.com.alura.ComportamentosCompostosPorOutrosComportamentosEODecorator.filtro;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.alura.MuitosDescontosEOChainOfResponsability.resposta.Conta;

public class FiltroMesmoMes extends Filtro {

	public FiltroMesmoMes(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMesmoMes() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta c : contas) {
			if (((Calendar) c.getDataAbertura()).get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)
					&& ((Calendar) c.getDataAbertura()).get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
				filtrada.add(c);
			}
		}

		filtrada.addAll(proximo(contas));
		return filtrada;
	}

}