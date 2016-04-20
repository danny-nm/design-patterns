package br.com.alura.MuitosDescontosEOChainOfResponsability.resposta;

import javax.xml.crypto.Data;

public class Conta {

	private String titular;
	private double saldo;
	private int numero;
	private String agencia;
	private Data dataAbertura;

	public Data getDataAbertura() {
		return dataAbertura;
	}

	public int getNumero() {
		return numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public Conta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;

	}

	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

}
