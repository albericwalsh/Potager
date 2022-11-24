package m;

public class Pomme extends Fruit{
			
	public Pomme() {
		super("Pomme", 2, 2, 2, 3);
		
	}

	@Override
	public String toString() {
		return "Pomme [nom=" + getNom() + ", dureeDeLaPoussePourMaturite=" + getDureeDeLaPoussePourMaturite()
				+ ", quantiteObtenuLorsDeLaRecolte=" + getQuantiteObtenuLorsDeLaRecolte() + ", niveauDeMaturite="
				+ getNiveauDeMaturite() + ", prixDeVente=" + getPrixdevente() + ", prixPourPlanter=" + getPrixpourplanter() + "]";
	}

	
	
	
}
