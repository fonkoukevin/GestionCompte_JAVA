package entite;

public final class  comptepayant extends compte {   // final montre que les mehode des class ne peuvent etre changer

	public comptepayant(float solde) {
		super(solde);   // nous  evite d'ecrire encore le nom de l'attribut qu'on veut modifier    ou nous evite d'ecrire le nom de la super classe 
		// TODO Auto-generated constructor stub
	}

	public void afficher() {
		System.out.println("  solde "+getSolde());
	}
	public void retirer(float mt) {
		if(mt<=getSolde()) {
		setSolde(getSolde() - mt);
		System.out.println("retrait de "+mt+" effectuer avec succes");
		
		} else {
			System.out.println("solde actuel "+getSolde()+" votre solde est  insuffisant pour effectuer ce retrait.");
		}
		
	}
}
