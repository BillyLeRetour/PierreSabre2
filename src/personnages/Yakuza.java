package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation ;
	
	public Yakuza(String nom,String boisson,int argent,String clan) {
		super(nom,boisson,argent);
		this.clan=clan;
	}
	
	public void extorquer(Commercant victime) {
		int somme=victime.getArgent();
		gagnerArgent(somme);
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		parler("J’ai piqué les "+somme+" sous de "+victime.getNom()+", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
	
	public int perdre() {
		int somme=getArgent();
		perdreArgent(somme);
		reputation-=1;
		parler("J’ai perdu mon duel et mes "+somme+" sous, snif... J'ai déshonoré le clan de "+clan);
		return somme;
	}
	
	public int gagner() {
		int somme=getArgent();
		gagnerArgent(somme);
		reputation-=1;
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+" ? Je l'ai dépouillé de ses "+somme+" sous.");
		return somme;
	}
}
