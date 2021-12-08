package fr.library;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Dvd hp1 = new Dvd("Chris Colombus", "Harry Potter à l'école des sorciers",  0);
        Dvd hp2 = new Dvd("Chris Colombus","Harry Potter et la Chambre des Secrets", 1);

        Cd planetHer = new Cd("Doja Cat", "Planet Her");
        Cd racineCarree = new Cd("Stromae", "Racine carrée", cdContentFormat.OGG);

        int[] zones1 = {1, 2, 3};
        int[] zones2 = {4, 5, 6};

        System.out.println(hp1);
        System.out.println(hp2.readable(zones1));
        System.out.println(hp2.readable(zones2));

        System.out.println(planetHer);
        System.out.println(racineCarree);
    }
}
