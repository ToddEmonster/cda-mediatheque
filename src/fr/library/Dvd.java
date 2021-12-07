package fr.library;

import java.util.List;

public class Dvd extends Media {
    private int zone;

    public Dvd(String title, String author) {
        this(title, author, 0);
    }

    public Dvd(String title, String author, int zone) {
        super(title, author);
        this.zone = zone;
    }

    public boolean readable(int[] zones) {
        if (this.zone == 0) {
            return true;
        } else {
            for (int zone : zones) {
                if (this.zone == zone) {
                    return true;
                }
            }
            return false;
        }
    }

}
