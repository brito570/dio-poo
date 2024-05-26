package dev.lucas.exercicioPoo.usuario;

import dev.lucas.exercicioPoo.pilares.ContaCorrente;
import dev.lucas.exercicioPoo.pilares.ContaPoupanca;


public class Main {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.depositar(100);
		
		ContaPoupanca poupanca = new ContaPoupanca();
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		
		System.out.println("Score " + poupanca.getScore());
		
	}

}
