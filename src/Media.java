import java.util.List;

public class Media {
    private String title;
    private String author;
    private List<Integer> notes;

    public Media(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }

    public float getMeanNote() {
        if (this.notes.isEmpty()) {
            return 0;
        } else {
            return this.notes
                    .stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        }
    }

    public void vote(int note) {
        if (note >= 0 && note <= 5) {
            this.notes.add(note);
            System.out.println("Votre note a été ajoutée au média.");
        } else {
            System.out.println("Format de vote incorrect : la note doit être comprise entre 0 et 5.");
        }
    }

    @Override
    public String toString() {
        return "\"" + title  + "\"" + " par " + author ;
    }
}
