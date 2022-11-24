package p;

import m.*;

import static p.Potager.*;

public class Actions {

    public static void planterAliment(int j){
        switch (j){
            case 1:
                getPotager().add(new Pdt());
                System.out.println("Vous avez planté une Pomme de terre!");
                setArgentDisponible(getArgentDisponible() - Pdt.getPrixpourplanter());
                break;
            case 2:
                getPotager().add(new Carotte());
                System.out.println("Vous avez planté une Carotte!");
                break;
            case 3:
                getPotager().add(new Poireau());
                System.out.println("Vous avez planté un Poireau!");
                break;
            case 4:
                getPotager().add(new Pomme());
                System.out.println("Vous avez planté une Pomme!");
                break;
            default:
                System.out.println("Entrer un nombre valide.");
        }

    }

    public static void update() {
        for (Aliment a : getPotager()) {
            a.setNiveauDeMaturite(a.getNiveauDeMaturite() + 1);
        }
    }

    public static void recolter(int jj) {
        for (int index = 0; index <= getPotager().size(); index++) {
            if (index == jj){
                Aliment a = getPotager().get(index);
                if (a.getNiveauDeMaturite() >= a.getDureeDeLaPoussePourMaturite()) {
                    if (a.getNiveauDeMaturite() <= a.getDureeDeLaPoussePourMaturite() + a.getDureeDeLaPoussePourMaturite()){
                        getGardeManger().add(a);
                        getPotager().remove(index);
                        System.out.println("Vous avez récolté " + a.getQuantiteObtenuLorsDeLaRecolte() + " " + a.getNom());
                    } else {
                        System.out.println("L'aliment est pourri!");
                        getPotager().remove(index);
                    }
                } else {
                    System.out.println("L'aliment n'est pas encore mûr.");
                }
            }
        }
    }

    public static void vendre(int jjj) {
        setArgentDisponible(getArgentDisponible() + getGardeManger().get(jjj).getPrixdevente() * getGardeManger().get(jjj).getQuantiteObtenuLorsDeLaRecolte());
        System.out.println("Vous avez vendu " + getGardeManger().get(jjj).getNom() + " pour " + getGardeManger().get(jjj).getPrixdevente() * getGardeManger().get(jjj).getQuantiteObtenuLorsDeLaRecolte() + "€");
        getGardeManger().remove(jjj);
    }

    public static void printPotager() {
        System.out.println("Potager: " + getArgentDisponible() + "€");
        for (int i = 0; i < getPotager().size(); i++) {
            System.out.println("-" + getPotager().get(i).getNom() + " est à l'état " + getPotager().get(i).getNiveauDeMaturite() + " de maturité. Atttendre l'état " + getPotager().get(i).getDureeDeLaPoussePourMaturite());
        }
    }
}
