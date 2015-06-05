package Furgaut_Chassagne.KataTennis;

import junit.framework.TestCase;

public class JeuTest extends TestCase {
	Joueur joueur1 = new Joueur("Nadal");
	Joueur joueur2 = new Joueur("Noah");
	Jeu jeu = new Jeu(joueur1, joueur2);
	
	public void testNouveauJeuDoitRetournerZeroPartout()
	{
		creerScore(0, 0);	
		String score = jeu.getScore();	
		
		assertEquals("0 partout", score);
	}
	
	public void testJoueur1GagnePremiereBalle()
	{
		creerScore(1, 0);	
		
		String score = jeu.getScore();
		
		assertEquals("15 - 0", score);
	}
	
	public void testQuinzePartout(){
		creerScore(1, 1);		
		
		String score = jeu.getScore();
		
		assertEquals("15 partout", score);
	}
	
	public void testJoueur2GagnePremiereBalle() {
		creerScore(0, 2);		
		
		String score = jeu.getScore();
		
		assertEquals("0 - 30", score);
	}	
	
	public void testJoueur1Gagne3PremieresBalles(){
		creerScore(3, 0);
		
		String score = jeu.getScore();
		
		assertEquals("40 - 0", score);
	}
	
	public void testJoueursEgalite() {
		creerScore(3, 3);		
		
		String score = jeu.getScore();
		
		assertEquals("Égalité", score);		
	}
	
	public void testJoueur1GagneLeJeu()
	{
		creerScore(4, 0);	
		
		String score = jeu.getScore();
		
		assertEquals("Nadal a gagné", score);
	}
	
	public void testJoueur2GagneLeJeu(){
		creerScore(0,4);		
		
		String score = jeu.getScore();
		
		assertEquals("Noah a gagné", score);
	}
	
	public void testJoueursEgalite40A() {
		creerScore(4, 4);
		
		String score = jeu.getScore();
		
		assertEquals("Égalité", score);		
	}

	public void testJoueur2Avantage(){
		creerScore(4, 5);		
		
		String score = jeu.getScore();
		
		assertEquals("Avantage Noah", score);
	}
	
	public void testJoueur2GagneApresAvantage() {
		creerScore(10, 12);
		
		String score = jeu.getScore();
		
		assertEquals("Noah a gagné", score);
	}
	
	public void testJoueur1GagneApresAvantage() {
		creerScore(9, 7);
		
		String score = jeu.getScore();
		
		assertEquals("Nadal a gagné", score);
	}
	
	private void creerScore(int balleJoueur1, int balleJoueur2 ) {
		for (int i = 0; i < balleJoueur1; i++) {
			jeu.joueur1Marque();
		}
		for (int i = 0; i < balleJoueur2; i++) {
			jeu.joueur2Marque();
		}
	}
	
 
}
