import java.util.ArrayList;  // Importando ArrayList
import java.util.List;       // Importando List

public class Playlist implements Content {
    private String name;
    private List<Content> songs = new ArrayList<>();  // Inicializando a lista de músicas

    public Playlist(String name) {
        this.name = name;
    }

    public void addSong(Content song) {
        songs.add(song);
    }

    @Override
    public void play() {
        System.out.println("Playing playlist: " + name);
        for (Content song : songs) {
            song.play();
        }
    }
}
