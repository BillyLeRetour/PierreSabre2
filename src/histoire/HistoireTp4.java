package histoire;
import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTp4 {

	public static void main(String[] args) {
		Humain prof;
		prof =new Humain("Prof","kombucha",54);
		Commercant marco;
		marco =new Commercant("Marco",15);
		Yakuza yaku;
		yaku=new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
		Ronin roro;
		roro=new Ronin("Roro","shochu",60);
		
//		prof.direBonjour();
//		prof.acheter("boisson",12);
//		prof.boire();
//		prof.acheter("jeu",2);
//		prof.acheter("kimono",50);
		
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		
//		yaku.direBonjour();
//		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
//		yaku.extorquer(marco);
		
//		roro.direBonjour();
//		roro.donner(marco);
		
		roro.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		roro.provoquer(yaku);
		
	}
}
