package entite;

public final  class compteepargne extends compte {  // le mot cle final indique qu'un element ne peut etere change qui s'applique au methode fonction et classe
	
        public float taux;
        float interet ;
		
        
	public compteepargne(float solde,float taux) {
		super(solde);            // nous  vous evite d'ecrire encore le nom de la classe
		this.taux=taux;     //nous evite d'ecrire le nom de la super classe 
	}
 
	public float calculInteret() {
		interet=(getSolde()*taux/100);
		setSolde(getSolde()+interet);
		return getSolde();
	}
	
	public void afficher() {
 
		
		System.out.println("  solde: "+getSolde()+" TAUX:  "+taux+"%");

	}
	
	public void retirer(float mt) {
		if(mt<getSolde()) {
		setSolde(getSolde() - mt); 
		System.out.println("retrait de "+mt+" effectuer avec succes");
		} else {
			System.out.println("solde actuel "+getSolde()+"   votre solde est insuffisant pour effectuer ce retrait.");
		}
	}
	

}
