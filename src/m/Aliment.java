package m;

public class Aliment {

	private String Nom;
	private int dureeDeLaPoussePourMaturite;
	private int quantiteObtenuLorsDeLaRecolte;
	private int niveauDeMaturite;
	private Integer prixdevente;
	private static Integer prixpourplanter;

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getDureeDeLaPoussePourMaturite() {
		return dureeDeLaPoussePourMaturite;
	}

	public void setDureeDeLaPoussePourMaturite(int dureeDeLaPoussePourMaturite) {
		this.dureeDeLaPoussePourMaturite = dureeDeLaPoussePourMaturite;
	}

	public int getQuantiteObtenuLorsDeLaRecolte() {
		return quantiteObtenuLorsDeLaRecolte;
	}

	public void setQuantiteObtenuLorsDeLaRecolte(int quantiteObtenuLorsDeLaRecolte) {
		this.quantiteObtenuLorsDeLaRecolte = quantiteObtenuLorsDeLaRecolte;
	}

	public int getNiveauDeMaturite() {
		return niveauDeMaturite;
	}

	public void setNiveauDeMaturite(int niveauDeMaturite) {
		this.niveauDeMaturite = niveauDeMaturite;
	}

	public Integer getPrixdevente() {
		return prixdevente;
	}

	public void setPrixdevente(Integer prixdevente) {
		this.prixdevente = prixdevente;
	}

	public static Integer getPrixpourplanter() {
		return prixpourplanter;
	}

	public void setPrixpourplanter(Integer prixpourplanter) {
		this.prixpourplanter = prixpourplanter;
	}

	/* ------------------------------------------------------------------------------------------------------------------ */

	public Aliment(String nom, int dureePousse, int recoltePousse, Integer prix, Integer prixPourPlanter) {
		super();
		this.Nom = nom;
		this.dureeDeLaPoussePourMaturite = dureePousse;
		this.quantiteObtenuLorsDeLaRecolte = recoltePousse;
		this.prixdevente = prix;
		this.prixpourplanter = prixPourPlanter;
		this.niveauDeMaturite = 0;
	}
}
