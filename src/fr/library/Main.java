package fr.library;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Dvd hp1 = new Dvd("Chris Colombus", "Harry Potter à l'école des sorciers",  0);
        Dvd hp2 = new Dvd("Chris Colombus","Harry Potter et la Chambre des Secrets", 1);

        Cd planetHer = new Cd("Doja Cat", "Planet Her");
        Cd racineCarree = new Cd("Stromae", "Racine carrée", cdContentFormat.OGG);

        Book terremer = new Book("Ursula K. Le Guin", "Le Cycle de Terremer");
        Book horde = new Book("Alain Damasio", "La Horde du Contrevent");

        int[] zones1 = {1, 2, 3};
        int[] zones2 = {4, 5, 6};

        System.out.println(hp1);
        System.out.println(hp2.readable(zones1));
        System.out.println(hp2.readable(zones2));

        System.out.println(planetHer);
        System.out.println(racineCarree);

        System.out.println("\n[ Bienvenue à la médiathèque ]\n");
        Library mediatheque = new Library();
        mediatheque.add(hp1);
        mediatheque.addMultiple(new Media[]{hp2, planetHer, racineCarree, terremer, horde});

        System.out.println(mediatheque.getMedias());

        // Filtre sur author
        System.out.println(mediatheque.filter("author", "Guin"));

        // Filtre sur titre
        System.out.println(mediatheque.filter("title", "potter"));
        System.out.println(mediatheque.filter("title", "la"));

        // Filtre sur type
        System.out.println(mediatheque.filter("type", "livre"));
        System.out.println(mediatheque.filter("type", "cd"));
        System.out.println(mediatheque.filter("type", "dvd"));
        System.out.println(mediatheque.filter("type", "book"));

    }
}
