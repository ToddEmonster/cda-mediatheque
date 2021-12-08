package fr.library;

import java.util.List;

public class Dvd extends Media {
    private int zone;

    public Dvd(String author, String title) {
        this(author, title, 0);
    }

    public Dvd(String author, String title, int zone) {
        super(author, title);
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
