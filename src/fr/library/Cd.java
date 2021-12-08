package fr.library;

public class Cd extends Media {
    private cdContentFormat contentFormat;

    public Cd(String author, String title) {
        this(author, title, cdContentFormat.CD_MUSICAL);
    }

    public Cd(String author, String title, cdContentFormat contentFormat) {
        super(author, title);
        this.contentFormat = contentFormat;
    }

    public String toString() {
        return super.toString() + " [" + this.contentFormat + "]";
    }
}
