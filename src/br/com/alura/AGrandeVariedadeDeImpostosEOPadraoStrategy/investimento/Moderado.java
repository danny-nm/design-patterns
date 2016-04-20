package br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.investimento;

import java.util.Random;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Conta;

public class Moderado implements Investimento{
	
	private Random random;
	
	public Moderado(){
		this.random = new Random();
	}
	
	@Override 
	// tem 50% de chances de retornar 2.5%, e 50% de 
	//chances de retornar 0.7%;
	public double calcula(Conta conta) {
		
		if(random.nextInt(2) == 0) return conta.getSaldo() * 0.025;
        else return conta.getSaldo() * 0.007;
	}

}
