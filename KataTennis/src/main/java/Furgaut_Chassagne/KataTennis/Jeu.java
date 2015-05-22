package Furgaut_Chassagne.KataTennis;

public class Jeu
{
	private Joueur joueur1;
	private Joueur joueur2;
	private int scoreJoueur1;
	private int scoreJoueur2;

	public Jeu(Joueur joueur1, Joueur joueur2)
	{
		this.joueur1 = joueur1;
		this.joueur2 = joueur2;
	}
	
	public Joueur getJoueur1()
	{
		return joueur1;
	}
	public Joueur getJoueur2()
	{
		return joueur2;
	}
	public void setJoueur1(Joueur joueur1)
	{
		this.joueur1 = joueur1;
	}
	public void setJoueur2(Joueur joueur2)
	{
		this.joueur2 = joueur2;
	}
	
	public String getScore() {
		
		if (jeuTermine()) {
			return ScoreAvecLePlusGrosScore() + " a gagné";
		}
		
		if (Avantage()) { 
			return "Avantage " + ScoreAvecLePlusGrosScore(); 
		}
		
		if (Egalité())
			return "Égalité";
		
		if(scoreJoueur1 == scoreJoueur2) {
			return conversionScore(scoreJoueur1) + " partout";
		}
		
		return conversionScore(scoreJoueur1) + " - " + conversionScore(scoreJoueur2);
	}

	private boolean Egalité() {
		return scoreJoueur1 >= 3 && scoreJoueur2 == scoreJoueur1;
	}
	
	private String ScoreAvecLePlusGrosScore() {
		if (scoreJoueur1 > scoreJoueur2) {
			return joueur1.getNom();
		} else {
			return joueur2.getNom();
		}
	}
	
	private boolean jeuTermine() {
		if(scoreJoueur2 >= 4 && scoreJoueur2 >= scoreJoueur1 + 2 )
			return true;
		if(scoreJoueur1 >= 4 && scoreJoueur1 >= scoreJoueur2 + 2)
			return true;
		return false;
	}
	
	private boolean Avantage() {
		if (scoreJoueur2 >= 4 && scoreJoueur2 == scoreJoueur1 + 1){
			return true;
		}
		if (scoreJoueur1 >= 4 && scoreJoueur1 == scoreJoueur2 + 1){
			return true;
		}
		return false;

	}

	public void joueur1Marque() {
		scoreJoueur1++;
	}

	public void joueur2Marque() {
		scoreJoueur2++;
	}
	
	private int conversionScore(int score) {
		switch (score) {
		case 0:
			return 0;
		case 1:
		return 15;
		case 2: 
			return 30;
		case 3:
			return 40;
		}
	throw new IllegalArgumentException("score illégal: " + score);
}
}
