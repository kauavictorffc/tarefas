public class Main {
    public static void main(String[] args) {
        ContentFactory contentFactory = new ConcreteContentFactory();

        // Criando músicas e playlists
        Content song1 = contentFactory.createContent("Music", "Song 1");
        Content song2 = contentFactory.createContent("Music", "Song 2");
        Playlist playlist = (Playlist) contentFactory.createContent("Playlist", "My Playlist");
        playlist.addSong(song1);
        playlist.addSong(song2);

        // Decorando a música
        Content decoratedSong = new EqualizerDecorator(new BassBoostDecorator(song1));

        // Usando Proxy para controlar acesso
        ContentProxy proxySong = new ContentProxy(decoratedSong, true); // Usuário premium
        ContentProxy proxyPlaylist = new ContentProxy(playlist, false); // Usuário não premium

        // Tocando conteúdo
        proxySong.play();
        proxyPlaylist.play();
    }
}
