package fr.library;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Library {
    private ArrayList<Media> medias = new ArrayList<Media>();

    public Library() {
    }

    public Library(ArrayList<Media> medias) {
        this.medias = medias;
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }

    public void add(Media m) {
        this.medias.add(m);
    }

    public void addMultiple(Media[] medias) {
        Stream.of(medias)
                .forEach(m -> this.medias.add(m));
    }

    public ArrayList<Media> filter(String criterion, String value) {
        ArrayList filteredMedia;
        System.out.println("Résultats de la recherche \"" + criterion + " = " + value + "\" :");
        switch(criterion) {
            case("auteur"):
            case("auteure"):
            case("autrice"):
            case("author"):
                filteredMedia = this.filterMediaOn(m -> ((Media) m)
                        .getAuthor().toLowerCase()
                        .contains(value.toLowerCase()));
                break;
            case("titre"):
            case("title"):
            default:
                filteredMedia = this.filterMediaOn(m -> ((Media) m)
                        .getTitle().toLowerCase()
                        .contains(value.toLowerCase()));
                break;
            case("type"):
                switch (value.toLowerCase()) {
                    case("dvd"):
                        filteredMedia = this.filterMediaOn(Dvd.class::isInstance);
                        break;
                    case("cd"):
                        filteredMedia = this.filterMediaOn(Cd.class::isInstance);
                        break;
                    case("livre"):
                    case("book"):
                    default:
                        filteredMedia = this.filterMediaOn(Book.class::isInstance);
                        break;
                }
                break;
        }
        return filteredMedia;
    }

    private ArrayList filterMediaOn(Predicate predicate) {
        return (ArrayList) this.medias
                .stream()
                .filter(predicate)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
