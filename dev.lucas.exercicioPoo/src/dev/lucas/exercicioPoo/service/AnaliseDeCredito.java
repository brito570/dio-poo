package dev.lucas.exercicioPoo.service;

public class AnaliseDeCredito{

	private int score;

	// Aumenta o Score de acordo com a movimentação da conta.
	
	public int getScore() {
		return score;
	}

	public void aumentarScore() {
			this.score += 100;
		}	

}
