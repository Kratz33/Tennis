package Furgaut_Chassagne.KataTennis;

public class Jeu
{
	private Joueur joueur1;
	private Joueur joueur2;

	public Jeu(Joueur _joueur1, Joueur _joueur2)
	{
		joueur1 = _joueur1;
		joueur2 = _joueur2;
	}
	
	public Joueur getJoueur1()
	{
		return joueur1;
	}
	public Joueur getJoueur2()
	{
		return joueur2;
	}
	public void setJoueur1(Joueur _joueur1)
	{
		joueur1 = _joueur1;
	}
	public void setJoueur2(Joueur _joueur2)
	{
		joueur2 = _joueur2;
	}
}
