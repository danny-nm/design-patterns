package br.com.alura.EstadosQueVariamEOState.estadoConta;

import br.com.alura.AGrandeVariedadeDeImpostosEOPadraoStrategy.imposto.Conta;

public interface EstadoDaConta {

	void saca(Conta conta, double valor);

	void deposita(Conta conta, double valor);

}
