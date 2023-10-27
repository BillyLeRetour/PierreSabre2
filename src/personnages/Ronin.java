package personnages;

public class Ronin extends Humain{
	public int honneur=1;

	public Ronin(String nom,String boisson,int argent) {
		super(nom,boisson,argent);
		}
		
	public void donner(Commercant beneficiaire) {
		int somme =getArgent()/10;
		parler(beneficiaire.getNom()+" prend ces "+somme+" sous");
		beneficiaire.recevoir(somme);
	}
}
