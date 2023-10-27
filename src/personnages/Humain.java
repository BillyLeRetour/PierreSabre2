package personnages;

public class Humain {
	private String nom;
	private String boisson ;
	private int argent;
	
	public Humain(String nom,String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent=argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public void parler(String texte) {
		System.out.println(  "("+ nom +") - " + texte );
	}
	
	public void gagnerArgent(int gain) {
		argent+=gain;
	}
	
	public void perdreArgent(int perte) {
		argent-=perte;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle "+nom+" et j’aime boire du "+boisson);
	}
	
	public void boire() {
		parler("O Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
	}
	
	public void acheter(String bien,int prix) {
		if (argent>prix) {
				 parler("J'ai "+argent+" sous en poches.Je vais pouvoir m'offrir un "+bien+" a "+prix+" sous");
				 perdreArgent(prix);
		}else {
				 parler("Je n'ai que "+argent+" sous en poches.Je ne peux même pas m'offrir un"+bien+" a "+prix+" sous");
			 } 
	}
}