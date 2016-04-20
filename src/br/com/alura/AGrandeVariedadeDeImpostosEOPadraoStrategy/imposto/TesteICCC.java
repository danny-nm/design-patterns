package br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto;

public class TesteICCC {
	
	public static void main(String[] args) {
	
		Orcamento reforma = new Orcamento(500.0);
		
		ICCC novoImposto = new ICCC();
			
		System.out.println(novoImposto.calcula(reforma));
	}
}
