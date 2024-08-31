public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String genre, String content) {
        System.out.println("Hey " + name + ", new " + genre + " content is available: " + content);
    }
}
