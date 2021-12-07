package fr.library;

public class Cd extends Media {
    private cdContentFormat contentFormat;

    public Cd(String title, String author) {
        this(title, author, cdContentFormat.CD_MUSICAL);
    }

    public Cd(String title, String author, cdContentFormat contentFormat) {
        super(title, author);
        this.contentFormat = contentFormat;
    }

    public String toString() {
        return super.toString() + "[" + this.contentFormat + "]";

    }
}
