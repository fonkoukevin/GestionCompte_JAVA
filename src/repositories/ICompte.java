package repositories;
import entite.compte;
public interface ICompte {     // une interface decrit un ensemble de methodes en fournissant uniquement leur signature 
	public void verser(float mt);
	public void retirer(float mt);
}
