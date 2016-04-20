package br.com.alura.EstadosQueVariamEOState;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Orcamento;

public class TesteDeDescontoExtra {
	
		public static void main(String[] args) {
			
			Orcamento reforma = new Orcamento(500.0);			
			reforma.aplicaDescontoExtra();			
			System.out.println(reforma.getValor());
			
			reforma.aprova();
			reforma.aplicaDescontoExtra();
			System.out.println(reforma.getValor());
			
			reforma.finaliza();
			reforma.aplicaDescontoExtra();
		}

}
