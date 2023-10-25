import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

public class MenuMusica {
    public static void main(String[] args) {
        List<Musica> playlist = new ArrayList<Musica>();
        int option = 0;
        do {
            // Create a menu with JOptionPane that allows the user to add a song, remove a
            // song, show the playlist and exit the program
            option = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Add a song\n2 - Remove a song\n3 - Show the playlist\n4 - Exit the program"));
            switch (option) {
                // Create the cases
                case 1:
                    String title = JOptionPane.showInputDialog("Enter the title of the song");
                    int rating = Integer.parseInt(JOptionPane.showInputDialog("Enter the rating of the song"));
                    playlist.add(new Musica(title, rating));
                    break;

                case 2:
                    int index = Integer.parseInt(JOptionPane.showInputDialog("Enter the index of the song"));
                    playlist.remove(index);
                    break;

                case 3:
                    Collections.sort(
                            playlist,
                            new Comparator<Musica>() {
                                public int compare(Musica musica1, Musica musica2) {
                                    return musica1.getTitle().compareTo(musica2.getTitle());
                                }
                            });
                    for (Musica musica : playlist) {
                        System.out.printf("Title: %s\nRating: %d\n", musica.getTitle(), musica.getRating());
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (option != 4);
    }
}
