package m;

public class Poireau extends Legume{

	
	
	public Poireau() {
		super("Poireau", 5, 2, 3, 2);
		
	}

	@Override
	public String toString() {
		return "Poireau [nom=" + getNom() + ", dureeDeLaPoussePourMaturite=" + getDureeDeLaPoussePourMaturite()
				+ ", quantiteObtenuLorsDeLaRecolte=" + getQuantiteObtenuLorsDeLaRecolte() + ", niveauDeMaturite="
				+ getNiveauDeMaturite() + ", prixDeVente=" + getPrixdevente() + ", prixPourPlanter=" + getPrixpourplanter() + "]";
	}

	

	
	
	
}
