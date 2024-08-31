public class Main {
    public static void main(String[] args) {
        StreamingPlatform platform = new StreamingPlatform();

        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");
        User user4 = new User("Diana");
        User user5 = new User("Edward");

        // Usuários se inscrevem para receber notificações de certos gêneros
        platform.registerObserver(user1, "Action");
        platform.registerObserver(user2, "Comedy");
        platform.registerObserver(user3, "Horror");
        platform.registerObserver(user4, "Anime");
        platform.registerObserver(user5, "Sci-Fi");

        // Alice também gosta de Comédia e Ficção Científica
        platform.registerObserver(user1, "Comedy");
        platform.registerObserver(user1, "Sci-Fi");

        // Novo conteúdo é adicionado à plataforma
        platform.addNewContent("Action", "New Action Movie");
        platform.addNewContent("Comedy", "New Comedy Series");
        platform.addNewContent("Horror", "New Horror Movie");
        platform.addNewContent("Anime", "New Anime Show");
        platform.addNewContent("Sci-Fi", "New Sci-Fi Movie");
    }
}
