package UUU;

import m.Aliment;


import java.io.*;

import static UUU.Utilitaires.splitString;
import static p.Potager.*;

public class Save {

    public static void createSave() {
        try {
            File f = new File("save.txt");

            if (f.createNewFile())
                System.out.println(ColorP.GRAY + "Fichier de sauvegarde créé avec succès" + ColorP.WHITE);

            try {
                FileWriter myWriter = new FileWriter("save.txt");
                String argent = String.valueOf(getArgentDisponible());
                myWriter.write(argent);
                myWriter.write("\n");
                myWriter.write("GM");
                myWriter.write("\n");
                // for each aliment in gardeManger
                for (Aliment a : getGardeManger()) {
                    myWriter.write(a.getNom() + ";" + a.getDureeDeLaPoussePourMaturite() + ";" + a.getNiveauDeMaturite() + ";" + a.getPrixdevente() + ";" + a.getPrixpourplanter());
                    myWriter.write("\n");
                }
                myWriter.write("P");
                myWriter.write("\n");
                // for each aliment in potager
                for (Aliment a : getPotager()) {
                    myWriter.write(a.getNom() + ";" + a.getDureeDeLaPoussePourMaturite() + ";" + a.getNiveauDeMaturite() + ";" + a.getPrixdevente() + ";" + a.getPrixpourplanter());
                    myWriter.write("\n");
                }

                myWriter.close();
                System.out.println(ColorP.GRAY + "Fichier de sauvegarde écrit avec succès" + ColorP.WHITE);


            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void loadSave() {

        System.out.println("try to load save");

        try {
            FileReader f = new FileReader("save.txt");
            BufferedReader b = new BufferedReader(f);
            String s = b.readLine();
            if (s != null) {
                setArgentDisponible(Integer.parseInt(s));
            }
            while (s != null) {
                System.out.println(s);
                s = b.readLine();
                if (s == "GM") {
                    while (s != "P") {
                        //TODO
                        //split s
                        Aliment a = splitString(s);
                        //add aliment to gardeManger
                        getGardeManger().add(a);
                        System.out.println("Aliment ajouté au gardeManger");
                    }
                    System.out.println(getGardeManger());
                }
                if (s == "P") {
                    while (s != null) {
                        Aliment a = splitString(s);
                        //add aliment to potager
                        getPotager().add(a);

                        System.out.println("Aliment ajouté au potager");
                    }
                    System.out.println(getPotager());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
