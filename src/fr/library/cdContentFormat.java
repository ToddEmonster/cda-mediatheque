package fr.library;

public enum cdContentFormat {
    CD_MUSICAL("CD musical"),
    OGG("OGG"),
    MP3("MP3");

    private String displayName;

    cdContentFormat(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
