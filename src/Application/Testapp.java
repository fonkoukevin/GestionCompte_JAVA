package Application;

import entite.compte;
import entite.compteepargne;
import entite.comptepayant;
import entite.comptesimple;

public class Testapp {
	
	public static void main(String[] args) {
		
		
	
		
		compte c2 = new compteepargne(0,10);
		c2.verser(2000);
		c2.calculInteret();
		c2.afficher();
		
		
		
	}

}
