package dev.lucas.exercicioPoo.pilares;

public class ContaPoupanca extends Conta{
	
	public void imprimirExtrato() {
		System.out.println("*** Extrato conta poupança ***");
		super.imprimirInfosComuns();
	}

}
