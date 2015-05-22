package Furgaut_Chassagne.KataTennis;

import junit.framework.TestCase;

public class JeuTest extends TestCase {
	Joueur joueur1 = new Joueur("Nadal");
	Joueur joueur2 = new Joueur("Noah");
	Jeu jeu = new Jeu(joueur1, joueur2);
	
	public void testNouveauJeuDoitRetournerZeroPartout()
	{
		String score = jeu.getScore();		
		assertEquals("Zero partout", score);
	}
	
	public void testJoueur1GagnePremiereBalle()
	{
		jeu.joueur1Marque();
		String score = jeu.getScore();
		assertEquals("Quinze,Zero", score);		
	}
	
	public void testQuinzePartout(){
		jeu.joueur1Marque();
		jeu.joueur2Marque();		
		String score = jeu.getScore();
		assertEquals("Quinze partout", score);
	}
	
	public void testJoueur2GagnePremiereBalle() {
		creerScore(0, 2);		
		String score = jeu.getScore();
		assertEquals("Zero,Trente", score);
	}	
	
	public void testJoueur1Gagne3PremieresBalles(){
		creerScore(3, 0);
		String score = jeu.getScore();
		assertEquals("Quarante,Zero", score);
	}
	
	public void testJoueursEgalite() {
		creerScore(3, 3);		
		String score = jeu.getScore();
		assertEquals("Egalité", score);		
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
		assertEquals("Egalité", score);		
	}

	public void testJoueur2Avantage(){
		creerScore(4, 5);		
		String score = jeu.getScore();
		assertEquals("Avantage Noah", score);
	}
	
	public void testJoueur2GagneApresAvantage() {
		creerScore(6, 8);
		String score = jeu.getScore();
		assertEquals("Noah a gagné", score);
	}
	
	public void testJoueur1GagneApresAvantage() {
		creerScore(8, 6);
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
