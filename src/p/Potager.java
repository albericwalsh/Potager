package p;

import java.util.ArrayList;
import java.util.HashMap;

import UUU.Save;
import UUU.Utilitaires;
import m.Aliment;
import m.Pdt;

import static UUU.Save.createSave;
import static UUU.Save.loadSave;
import static p.Actions.planterAliment;

public class Potager {

//------------------------------------------------------------------------------------------------------------------
	private static ArrayList<Aliment> gardeManger;
	
	private static ArrayList<Aliment> potager;

	private static Integer argentDisponible;

	public static ArrayList<Aliment> getGardeManger() {
		return gardeManger;
	}

	public static ArrayList<Aliment> getPotager() {
		return potager;
	}

	public void setPotager(ArrayList<Aliment> potager) {
		this.potager = potager;
	}

	public static Integer getArgentDisponible() {
		return argentDisponible;
	}

	public static void setArgentDisponible(Integer X) {
		argentDisponible = X;
	}

//------------------------------------------------------------------------------------------------------------------
	public void cestparti() {

		argentDisponible = 10;
		gardeManger = new ArrayList<Aliment>();
		potager = new ArrayList<Aliment>();

		System.out.println("Bonjour");
		System.out.println("Bienvenue dans votre potager!");
		System.out.println("Souhaitez vous restaurer une sauvegarde?");
		

		if(Utilitaires.readString().equals("oui")) {
			loadSave();
		} else {
			createSave();
		}
		
		boolean appliOn = true;
		
		do {
			Actions.update();

			System.out.println("Choix :");
			System.out.println("1 Planter");
			System.out.println("2 Etat du potager");
			System.out.println("3 Recolter");
			System.out.println("4 Vendre au marché");
			System.out.println("5 Sauvegarder");
			System.out.println("6 Exit");

			int i = Utilitaires.readInt();
			
			switch (i) {
			case 1:
				System.out.println("Que voulez-vous planter?"
						+ " 1 Pomme de terre , 2 Carotte, 3 Poireau, 4 Pomme");
				int j = Utilitaires.readInt();

				//TO DO
				//Gestion saisie utilisateur : ajout d'un des fruits/legumes saisie dans le potager
				//On plante une unité.
				planterAliment(j);

				break;
			case 2:
				Actions.printPotager();
				break;
			case 3:
				System.out.println("Quel fruit ou legume voulez vous recolter?");
				if (potager.size()==0) {
					System.out.println("planter au moins une graine dans votre potager!");
				}
				Utilitaires.printChoiceOfPotager();
				int jj = Utilitaires.readInt();
				//TO DO
				Actions.recolter(jj);
				break;
			case 4 : 
				System.out.println("Vente au marché");
				if (gardeManger.size()==0) {
					System.out.println("récolter au moins un aliment!");
				}
				Utilitaires.printChoiceOfGardeManger();
				//TO DO
				//Quel fruit/legume vendre ?
				int jjj = Utilitaires.readInt();
				Actions.vendre(jjj);
				break;
			
			case 5:
				System.out.println("Sauvegarde dans un fichier");
				//TO DO
				//On sauvegarde ce qui est dans le potager, ainsi que l'argent courant
				createSave();
				break;
			case 6:
				System.out.println("Vous devrier peut être sauvegarder!");
				if (Utilitaires.readString() == "oui"){
					createSave();
				}
				appliOn = false;
				break;
			default:
				;
			}
		}
		
		//TO DO
		//ajout : la pousse de chaque fruit/legume du potager (il faut qu'à chaque action, tous les fruits et légumes poussent)
		//les fruits et légumes trop mûr sont perdus et retirés du potager
		
		
		while(appliOn);
	}
	

}
