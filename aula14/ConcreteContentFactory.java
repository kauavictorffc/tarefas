public class ConcreteContentFactory extends ContentFactory {
    @Override
    public Content createContent(String type, String name) {
        if (type.equalsIgnoreCase("Music")) {
            return new Music(name);
        } else if (type.equalsIgnoreCase("Playlist")) {
            return new Playlist(name);
        }
        return null;
    }
}
