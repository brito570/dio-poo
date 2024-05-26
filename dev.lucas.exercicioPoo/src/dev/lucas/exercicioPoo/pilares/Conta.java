package dev.lucas.exercicioPoo.pilares;

import dev.lucas.exercicioPoo.service.AnaliseDeCredito;

public class Conta extends AnaliseDeCredito{
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	private static int SEQUENCIAL = 1;
	private static final int AGENCIA_PADRAO = 1;
	
	
	public Conta(){
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	public int getAgencia(){
		return agencia;
	}

	public int getNumero(){
		return numero;
	}

	public double getSaldo(){
		return saldo;
	}

	public void sacar(double valor){
				
		this.saldo -= valor;
		if (valor >= 100) {
			super.aumentarScore();
		}
		
	}
	
	public void depositar(double valor){
		
		this.saldo += valor;
		if (valor >= 100) {
			super.aumentarScore();
		}
	}
	
	public void transferir(double valor , Conta contaDestino) {
	
		this.sacar(valor);
		contaDestino.depositar(valor);
		if (valor >= 100) {
			super.aumentarScore();
		}
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: R$ %.2f", this.saldo));

	}


}
