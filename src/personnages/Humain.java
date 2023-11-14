package personnages;

public class Humain {
	private String nom;
	private String boisson ;
	private int argent;
	private int nbConnaissance;
	private Humain[] memoire;
	private int dernier;
	
	public Humain(String nom,String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent=argent;
		this.nbConnaissance=0;
		this.dernier = 0;
		memoire= new Humain[30];
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
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	public void memoriser(Humain autreHumain) {
		if (nbConnaissance < 30) {
			this.memoire[nbConnaissance]=autreHumain;
			nbConnaissance+=1;
		}else{
			if(dernier>30) {
				dernier=0;
			}
			this.memoire[dernier]=autreHumain;
			dernier+=1;
		}
		
	}
	
	public void repondre(Humain autreHumain) {
		this.direBonjour();
		this.memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont :");
		for(int i=0 ;i<nbConnaissance;i++) {
			if (i==nbConnaissance-1) {
				System.out.print(memoire[i].getNom());
			}else {
				System.out.print(memoire[i].getNom()+",");}
		}
		System.out.print("\n");
	}
}