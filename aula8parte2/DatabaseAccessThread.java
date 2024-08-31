public class DatabaseAccessThread extends Thread {
    @Override
    public void run() {
        // Obtém a instância do gerenciador de conexão e acessa o banco de dados
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();
        connectionManager.connect();
    }
}
