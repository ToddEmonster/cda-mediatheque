package fr.library;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Library {
    private ArrayList<Media> medias = new ArrayList<Media>();

    public Library(ArrayList<Media> medias) {
        this.medias = medias;
    }

    public ArrayList<Media> getMedias() {
        return medias;
    }

    private void add(Media m) {
        this.medias.add(m);
    }

    private ArrayList<Media> filter(String criterion, String value) throws ClassNotFoundException {
        List filteredMedia;
        switch(criterion) {
            case("author"):
                filteredMedia = this.filterMediaOn(m -> value == ((Media) m).getAuthor());
                break;
            default:
            case("title"):
                filteredMedia = this.filterMediaOn(m -> value == ((Media) m).getTitle());
                break;
            case("mediaType"):
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
        return new ArrayList<Media>(filteredMedia);
    }

    private List filterMediaOn(Predicate predicate) {
        return (List) this.medias
                .stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }
}
