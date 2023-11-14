package personnages;

public class Traitre extends Samourai{
	int niveauTraitrise=0;
	
	public Traitre(String seigneur,String nom,String boisson,int argent) {
		super(seigneur,nom,boisson,argent);
	}
	
	@Override
	public void direBonjour() {
		parler("Mais je suis un traitre et mon niveau de traitrise est :"+niveauTraitrise+". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise<3) {
			int argentRanconner=commercant.getArgent()*2/10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			niveauTraitrise+=1;
			parler("Si tu veaux ma protection contre les Yakuzas, il va falloir payer ! Donne moi" +argentRanconner + "sous ou gare a toi :");
			commercant.parler("Tout de suite grand "+getNom()+".");
		}else {
			parler("Mince je ne peux plus ranconner personne sinon un samourai risque de me demasquer");
		}
	}
	
	public void faireLeGentil() {
		if(nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
			
		}else {
			Humain ami=memoire[0];
			int don=getArgent() * 1/20;
			String monAmi=ami.getNom();
			parler("Il faut absolument remonter ma cote de confiance.Je vais faire ami ami avec "+monAmi+".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant "+don+"sous.");
			
			ami.gagnerArgent(don);
			perdreArgent(don);
			
			String nom=this.getNom();
			ami.parler("Merci "+nom+".Vous etes quelqu'un de bien.");
			if (niveauTraitrise>1) {
				niveauTraitrise-=1;
			}
		}
	}
}
