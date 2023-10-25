public class Musica implements Comparable<Musica> {
    private String title;
    private int rating;

    public Musica(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public int compareTo(Musica musica) {
        return this.title.compareTo(musica.title);
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }
}
