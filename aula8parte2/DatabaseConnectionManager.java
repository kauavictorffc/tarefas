public class DatabaseConnectionManager {
    // Instância única da classe (Singleton)
    private static DatabaseConnectionManager instance;

    // Construtor privado para evitar a criação de múltiplas instâncias
    private DatabaseConnectionManager() {
        System.out.println("Conexão com o banco de dados estabelecida.");
    }

    // Método para obter a única instância da classe
    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    // Método simulado para realizar operações no banco de dados
    public void connect() {
        System.out.println(Thread.currentThread().getName() + " está acessando o banco de dados.");
    }
}
