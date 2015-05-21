package Furgaut_Chassagne.KataTennis;

import junit.framework.TestCase;

public class JeuTest extends TestCase
{
	private Joueur joueur1;
	private Joueur joueur2;
	private Jeu jeu;

	public void avantJeu()
	{
		joueur1 = new Joueur("Gérard");
		joueur2 = new Joueur("Bouchard");
		jeu = new Jeu(joueur1, joueur2);
	}
	
	
}
