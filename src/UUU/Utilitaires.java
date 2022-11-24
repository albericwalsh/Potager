package UUU;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import m.Aliment;

import java.util.Scanner;

import static p.Potager.getGardeManger;
import static p.Potager.getPotager;

public class Utilitaires {

    public static int readInt() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        try {
            i = sc.nextInt();
        } catch (Exception e) {
        }
        return i;
    }

    public static void printHashMap(HashMap<Aliment, Integer> gardeManger) {
        for (Entry<Aliment, Integer> aliment : gardeManger.entrySet()) {
            System.out.println(aliment.getKey().getNom() + " quatité : " + aliment.getValue());
        }
    }

    public static void printArrayList(ArrayList<Aliment> potager) {
        for (Aliment aliment : potager) {
            System.out.println(aliment.toString());
        }
    }


    public static Object readString() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }

    public static Aliment splitString(String s) {
        String nom = s.split(";")[0];
        int dureeDeLaPoussePourMaturite = Integer.parseInt(s.split(";")[1]);
        int niveauDeMaturite = Integer.parseInt(s.split(";")[2]);
        float prixdevente = Float.parseFloat(s.split(";")[3]);
        float prixpourplanter = Float.parseFloat(s.split(";")[4]);
        System.out.println(nom + " " + dureeDeLaPoussePourMaturite + " " + niveauDeMaturite + " " + prixdevente + " " + prixpourplanter);
        //create aliment
        Aliment a = new Aliment(nom, dureeDeLaPoussePourMaturite, niveauDeMaturite, (int) prixdevente, (int) prixpourplanter);
        //add aliment to potager
        return a;
    }

    public static void printChoiceOfPotager() {
        for (int index = 0; index < getPotager().size(); index++) {
            System.out.println(index + ": " + getPotager().get(index).getNom() + " = " + getPotager().get(index).getNiveauDeMaturite());
        }
    }

    public static void printChoiceOfGardeManger() {
        for (int index = 0; index < getGardeManger().size(); index++) {
            System.out.println(index + ": " + getGardeManger().get(index).getNom() + " = " + getGardeManger().get(index).getNiveauDeMaturite());
        }
    }

}
