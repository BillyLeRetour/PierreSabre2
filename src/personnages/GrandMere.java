package personnages;

public class GrandMere extends Humain{
	public Humain[] memoire;
	private int dernier;
	
	public GrandMere (String nom,int argent) {
		super(nom,"tisane",argent);
		memoire= new Humain[5];
	}
	
	private enum TypeHumain{
		Casque,Bouclier;
		}

	@Override
	public void memoriser(Humain autreHumain) {
		if (nbConnaissance < 5) {
			this.memoire[nbConnaissance]=autreHumain;
			nbConnaissance+=1;
		}else{
			if(dernier>5) {
				dernier=0;
			}
			this.memoire[dernier]=autreHumain;
			dernier+=1;
		}
	}
	
	public String humainHasard() {
		return "";
	}
}
