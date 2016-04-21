package br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto;

import br.com.alura.EstadosQueVariamEOState.estadoConta.EstadoDaConta;
import br.com.alura.EstadosQueVariamEOState.estadoConta.Positivo;

public class Conta {

	public double saldo;
	public EstadoDaConta estado;

	public Conta() {
		estado = new Positivo();
	}

	public void deposita(double valor) {
		estado.deposita(this, valor);
	}

	public void saca(double valor) {
		estado.saca(this, valor);
	}

	public double getSaldo() {
		return saldo;
	}

}
