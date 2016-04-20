package br.com.alura.ComportamentosCompostosPorOutrosComportamentosEODecorator;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.ICMS;
import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.ISS;
import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Imposto;
import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Orcamento;
import br.com.alura.CodigosParecidosEOTemplateMethod.ICPP;

public class TestesDeImpostosComplexos {
	
	public static void main(String[] args) {
		
		Imposto iss = new ISS(new ICMS(new ICPP()));	
		Orcamento orcamento = new Orcamento(500.0);
		
		double valor = iss.calcula(orcamento);
		
		System.out.println(valor);
		
		Imposto impostoMuitoAlto = new ImpostoMuitoAlto(new ICMS());
		System.out.println(impostoMuitoAlto.calcula(orcamento));
	}
}
