package m;

public class Carotte extends Legume{

	
	public Carotte() {
		super("Carotte", 4, 2, 10, 2);
		
	}

	@Override
	public String toString() {
		return "Carotte [nom=" + getNom() + ", dureeDeLaPoussePourMaturite=" + getDureeDeLaPoussePourMaturite()
				+ ", quantiteObtenuLorsDeLaRecolte=" + getQuantiteObtenuLorsDeLaRecolte() + ", niveauDeMaturite="
				+ getNiveauDeMaturite() + ", prixDeVente=" + getPrixdevente() + ", prixPourPlanter=" + getPrixpourplanter() + "]";
	}
	

	
	
}
