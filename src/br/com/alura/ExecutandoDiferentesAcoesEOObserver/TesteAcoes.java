package br.com.alura.ExecutandoDiferentesAcoesEOObserver;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.CriacaoDeObjetosEOBuilder.ItemDaNota;
import br.com.alura.CriacaoDeObjetosEOBuilder.NotaFiscal;
import br.com.alura.CriacaoDeObjetosEOBuilder.NotaFiscalBuilder;

public class TesteAcoes {

	public static void main(String[] args) {
		
		List acoes = new ArrayList<>();

		acoes.add(new EnviadorDeEmail());
		acoes.add(new NotaFiscalDAO());
		acoes.add(new EnviadorDeSms());
		acoes.add(new Impressora());
		acoes.add(new Multiplicador(2)); // valor da nf-e * esse n° do parâmetro
		acoes.add(new Multiplicador(3)); // valor da nf-e * esse n° do parâmetro
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder(acoes);

		NotaFiscal nf = builder.paraEmpresa("Caelum").comCnpj("123").com(new ItemDaNota("Item", 100))
				.comObservacoes("obs").naData(null).controi();

		System.out.println(nf.getValorBruto());
	}
}

//isso tá zuado, arrumar teste