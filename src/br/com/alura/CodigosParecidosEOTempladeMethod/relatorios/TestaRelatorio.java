package br.com.alura.CodigosParecidosEOTempladeMethod.relatorios;

import java.util.ArrayList;
import java.util.List;

import br.com.alura.MuitosDescontosEOChainOfResponsability.resposta.Conta;

public class TestaRelatorio  {

	public static void main(String[] args) {
		
		
		List<Conta> conta = new ArrayList<>();
		RelatorioSimples relatorioSimples = new RelatorioSimples();
		RelatorioComplexo relatorioComplexo = new RelatorioComplexo();
		
		relatorioSimples.imprime(conta);
		
		relatorioComplexo.imprime(conta);
		
	}
}
