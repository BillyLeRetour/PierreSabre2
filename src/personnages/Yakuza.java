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
		parler(victime.getNom()+", si tu tiens � la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		parler("J�ai piqu� les "+somme+" sous de "+victime.getNom()+", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
}
