package entite;

import repositories.ICompte;    // pour pouvoir manupuler les element du package

public  abstract class compte implements ICompte {
	private int code;
	private float solde;
	private static int nbcomptes;

	public compte(float solde) {
		super();
		this.code=nbcomptes++;
		this.solde=solde;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	

public String toString() {
	return("code="+code+"solde="+solde);
}

  public abstract void afficher();
  public void retirer(float mt) {
		solde-=mt; 
		System.out.println("retrait de "+mt+" effectuer avec succes");
	}
	public final void verser(float mt) {
		solde+=mt;
		System.out.println("versement de "+mt+" effectuer avec succes");}
	public float calculInteret() {
		float interet;
		float taux = 0;
		
		
	 interet = (getSolde()*taux/100);
		setSolde(getSolde()+interet);
		return getSolde();
	}
	}
