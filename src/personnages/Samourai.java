package personnages;

public class Samourai extends Humain{
	String seigneur;
	
	public Samourai(String seigneur,String nom,String boisson,int argent) {
		super(nom,boisson,argent);
		this.seigneur=seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur "+seigneur);
		
	}
	
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vasi choisir comme boisson ? Tiens je vais prendre du "+boisson);
	}
}
