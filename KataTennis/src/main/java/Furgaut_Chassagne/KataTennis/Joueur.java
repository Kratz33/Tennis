package Furgaut_Chassagne.KataTennis;

public class Joueur
{
	private String nom;	

	public Joueur(String _nom){
		this.nom = _nom;
	}
	
	public String getNom(){
		return nom;
	}
	
	public void setNom(String _nom){
		nom = _nom;
	}
}
