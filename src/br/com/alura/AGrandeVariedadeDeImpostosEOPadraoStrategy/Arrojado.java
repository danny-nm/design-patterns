package br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy;

import java.util.Random;

public class Arrojado implements Investimento{

	private Random random;

	public Arrojado(){
		this.random = new Random();
	}
	
	@Override
	//tem 20% de chances de retornar 5%, 30% de chances de retornar 3%,
	//e 50% de chances de retornar 0.6%.
	public double calcula(Conta conta) {		
		int chute = random.nextInt(10);
        if(chute >= 0 && chute <= 1) return conta.getSaldo() * 0.5;
        else if (chute >= 2 && chute <= 4) return conta.getSaldo() * 0.3;
        else return conta.getSaldo() * 0.006;
	}		

}
