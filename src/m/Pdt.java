package m;

public class Pdt extends Legume{
	
	public Pdt() {
		super("Pomme de terre", 3, 4, 8, 1);
	}

	@Override
	public String toString() {
		return "Pdt [nom=" + getNom() + ", dureeDeLaPoussePourMaturite=" + getDureeDeLaPoussePourMaturite()
				+ ", quantiteObtenuLorsDeLaRecolte=" + getQuantiteObtenuLorsDeLaRecolte() + ", niveauDeMaturite="
				+ getNiveauDeMaturite() + ", prixDeVente=" + getPrixdevente() + ", prixPourPlanter=" + getPrixpourplanter() + "]";
	}



	
}
