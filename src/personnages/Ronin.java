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
	
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		if (force>=adversaire.getReputation()) {
			parler("Je tai eu petit yakusa !");
			honneur+=1;
			setArgent(getArgent()+adversaire.perdre());
		}else {
			honneur-=1;
			int somme=getArgent();
			setArgent(0);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(somme);
		}
	}
	
	
	
	
}
