package personnages;
import java.util.Random;

public class GrandMere extends Humain{
	public Humain[] memoire;
	
	
	public GrandMere (String nom,int argent) {
		super(nom,"tisane",argent);
		memoire= new Humain[5];
	}
	
	private enum TypeHumain{
		Habitant("habitant"),Commercant("commercant"),Yakuza("yakuza"),Ronin("ronin"),Samourai("samourai"),Traitre("traitre");
		
		private String nom;
		
		private TypeHumain(String nom) {
			this.nom=nom;
		}
		
	}
	
	

	@Override
	public void memoriser(Humain autreHumain) {
		if (nbConnaissance < 5) {
			this.memoire[nbConnaissance]=autreHumain;
			nbConnaissance+=1;
		}else{
			parler("Oh ma tete ! Je ne peux plus retenir le nom d'un personne supplémentaire");
		}
	}
	
	public String humainHasard() {
		Random r = new Random();
        int n = r.nextInt(5);
        TypeHumain[] types = TypeHumain.values();
		return types[n].nom;
	}
	
	public void ragoter() {
		for(int i=0 ;i<5;i++) {
			if(memoire[i] instanceof Traitre) {
				parler("Je sais que "+memoire[i].getNom()+" est un traître. Petit chenapan !");
			}else{
				parler("Je crois que "+memoire[i].getNom()+" est un "+humainHasard());
			}
		}
	}
}
